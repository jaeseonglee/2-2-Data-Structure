/** Q4 : RandProbing.java, RandProbingTest.java 
 *  �ۼ��� : 2019.11.11 ~ 11.17
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �������縦 ������ ���α׷�
 */
package Number4;
import java.util.*;	// ���� ������  ���� ���̺귯��

public class RandProbing <K,V> {
	private int N =0, M =13;		// �׸� �� N, ���̺� ũ�� M  
	private K[] a = (K[]) new Object[M];	// �ؽ����̺�
	private V[] d = (V[]) new Object[M];	// key���� ������ ����
	private int hash(K key) {		// �ؽ��ڵ�
		return (key.hashCode() & 0x7fffffff) % M; // ������ �Լ�
	}
	
	public void put (K key, V data) {	// ���� ����
		int initialpos = hash(key);		// �ʱ� ��ġ
		int i = initialpos;
		Random rand = new Random();
		rand.setSeed(10);
		do {
			if(a[i] == null) {		// ���� ��ġ �߰�
				a[i] = key;			// key�� �ؽ� ���̺� ����
				d[i] = data; N++;	// key ���� ������ ����
				return;
			}
			if(a[i].equals(key)) {	// �̹� key ����
				d[i] = data;		// �����͸� ����
				return;
			}
			i = (initialpos + rand.nextInt(1000)) % M;// i = ���� ��ġ
		} while( N < M );
	}
	
	public V get(K key) {	// Ž�� ����
		Random rand = new Random();
		rand.setSeed(10);	// ���Զ��� ���� seed�� ���
		int initialpos =hash(key);	// �ʱ���ġ
		int i = initialpos;
		while(a[i] != null) {
			if(a[i].equals(key))
				return d[i];	// Ž�� ����
			i = (initialpos + rand.nextInt(1000)) % M;	//i = ���� ��ġ
		}
		return null;	// Ž�� ����
	}
		
	public void print() {
		System.out.print("\n�ؽ� ���̺�:\n\t");
		for(int i =0; i< a.length; i++ ) {
			System.out.print(i+"\t");
		}
		System.out.print("\n\t");
		for(int i =0; i< 13; i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();
	}
}