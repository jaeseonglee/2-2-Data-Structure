/** Q6 : Chaining.java, ChainingTest.java 
 *  �ۼ��� : 2019.11.11 ~ 11.17
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ����ּҹ���� ������ ���α׷�
 */
package Number6;

public class Chaining <K, V> {
	private int M = 13;				// ���̺� ũ��
	private Node[] a = new Node[M];	// �ؽ� ���̺�
	
	public static class Node {	//	Node Ŭ����
		private Object  key;
		private Object  data;
		private Node	next;
		public Node(Object newkey, Object newdata, Node ref) {	// ������
			key  = newkey;
			data = newdata;
			next = ref;
		}
		public Object getKey()  { return key; }
		public Object getData() { return data; }
	}
	
	private int hash(K key) {		// �ؽ��ڵ�
		return (key.hashCode() & 0x7fffffff) % M;	// ������ ���� 
	}
	public V get(K key) {
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next) {	// ���Ḯ��Ʈ Ž��
			if(key.equals(x.key)) return (V) x.data;	// Ž�� ����
		}
		return null;	// Ž�� ����
	}
	
	public void put (K key, V data) {	// ���� ����
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next)
			if(key.equals(x.key)) {	// �̹� key ����
				x.data = data;		// �����͸� ����
				return;
			}
		a[i] = new Node(key, data,a[i]);	// ���� ����Ʈ�� ù ���� ����
	}

	public void print() {		// Node �迭�� ����ϴ� print��
		System.out.println("\n�ؽ� ���̺�:");	
		Node result;		// �ӽ� Node ����
		for(int i =0; i< a.length; i++ ) {	// (��ø)�ݺ����� ���� ��¤�
			result = a[i];			// result�� ���� �ε����� Node ����
			System.out.print(i);	// ���� �ε��� ���
			while(result != null) {	// result Node�� null�� �ƴ϶��
				System.out.print("-->[" + result.key + "," + result.data + "]");	// �� ���
				result = result.next;		// result�� result ���� ��带 ����
			}
			System.out.println();	// ���� �ε��� �迭�� ����� ��� ���� ��µǸ� �ٹٲ� 
		}
	}
}
