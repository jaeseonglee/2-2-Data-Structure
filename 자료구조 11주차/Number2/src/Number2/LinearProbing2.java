/** Q2 : LinearProbing2.java, LinearProbingTest2.java 
 *  �ۼ��� : 2019.11.11 ~ 11.17
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : LinearProbing Ŭ�������� delete �޼ҵ带 �߰��� ���α׷�
 */
package Number2;

public class LinearProbing2 <K,V> {
	private int M = 13;		// ���̺� ũ��
	private K[] a = (K[]) new Object[M]; // �ؽ� ���̺�
	private V[] d = (V[]) new Object[M]; // key���� ������ ����
	private int hash(K key) {		// �ؽ��ڵ�
		return (key.hashCode() & 0x7fffffff) % M;	// ������ �Լ�
	}
	
	public void put(K key, V data) {	// ���� ����
		int initialpos = hash(key);		// �ʱ� ��ġ
		int i = initialpos, j = 1;
		do {
			if (a[i] == null ) {	// ���� ��ġ �߰�
				a[i] = key;			// key�� �ؽ����̺� ����
				d[i] = data;		// key���� �����͸� ������ �ε����Ͽ� ����
				return;
			}
			if (a[i].equals(key) ) { // �̹� key ����:
				d[i] = data;		// �����͸� ����
				return;
			}
			i = (initialpos + j++ ) % M;	// i = ���� ��ġ
		}while( i != initialpos);		// ���� i�� �ʱ���ġ�� ���ԵǸ� ���� ����
	}

	public V get(K key) {		// Ž�� ����
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if( a[i].equals(key) ) return d[i];
			i = (initialpos + j++) % M;
		} while(a[i] != null && 	// a[i]�� null(=�������) �̸� stop(��ã��)
				i != initialpos);	// ó�� ��ġ�� ���ƿԴٸ� stop (��ã��)
		return null;
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
	
	public V delete(K key) {		// �׸��� �����ϴ� delete �޼ҵ�
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if( a[i].equals(key) ) {	// ������ �׸��� �߰�
				V temp = d[i];	// ������ �׸��� ������ ����
				int num = (initialpos + j++) % M;	// �浹�� �߻��� ���� ��ġ�� �׸��� �ε��� ����
				a[i] = a[num];	// ���� ������ �׸��� �����ʹ��
				d[i] = d[num];	// �浹�� �߻��� ������ġ�� �����ͷ� ����
				a[num] = null;	// ���� �ڸ��� null�� �ʱ�ȭ
				d[num] = null;
				return temp;	// ������ �׸��� ��ȯ
			}
			i = (initialpos + j++) % M;
		} while(a[i] != null && 	// a[i]�� null(=�������) �̸� stop(��ã��)
				i != initialpos);	// ó�� ��ġ�� ���ƿԴٸ� stop (��ã��)
		return null;
	}
	
}