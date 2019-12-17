/** Q5 : DoubleHashing.java, DoubleHashingTest.java 
 *  �ۼ��� : 2019.11.11 ~ 11.17
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �����ؽ��� ������ ���α׷�
 */
package Number5;

public class DoubleHashing <K,V> {
	private int N =0, M =13;
	private K[] a = (K[]) new Object[M];
	private V[] dt = (V[]) new Object[M];
	private int hash(K key) { 	
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public void put(K key, V data) {
		int initialpos = hash(key);	// �ʱ� ��ġ
		int i = initialpos;	
		int j = 1;
		int d = (7 - (int)key % 7);	// �ι�° �ؽ� �Լ�, d(key) = 7- key % 7
		do {
			if(a[i] == null) {		// ���� ��ġ �߰�
				a[i] = key;			// key�� �ؽ����̺� ����
				dt[i] = data; N++;	// key���� ������ ����
				return;
			}
			if(a[i].equals(key)) {	// �̹� key����
				dt[i] = data;		// �����͸� ����
				return;
			}
			i = (initialpos + j*d) % M;	// i = ���� ��ġ
			j++;
		}while(N < M);
	}
	
	public V get(K key) {
		int initialpos = hash(key);	// �ʱ� ��ġ
		int i = initialpos;
		int j = 1;
		int d = (7 - (int)key % 7);
		while(a[i] != null) {		// Ž�� ����
			if(a[i].equals(key))
				return dt[i];
			i = (initialpos + j * d) % M;	// i = ���� ��ġ
			j++;
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