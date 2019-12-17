/** Q7 : Chaining.java, RehashChainingTest.java 
 *  �ۼ��� : 2019.11.17
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ���ؽø� ���� ����ּҹ���� Ȱ���� ���α׷�
 */
package Number7;

public class Chaining  <K, V> {
	private int M = 5;				// ���̺� ũ�� Q7������ 5�� ������
	private Node[] a = new Node[M];	// �ؽ� ���̺�
	private int cnt = 0;			// Q7 ������ ����� ���� cnt ����
	
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
		checkRehash();		// Q7 get�޼ҵ忡�� ������ ���
		
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next) {	// ���Ḯ��Ʈ Ž��
			if(key.equals(x.key)) return (V) x.data;	// Ž�� ����
		}
		return null;	// Ž�� ����
	}
	
	public void put (K key, V data) {	// ���� ����
		checkRehash();					// Q7 put�޼ҵ忡�� ������ ���
		
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
		for(int i =0; i< a.length; i++ ) {	// (��ø)�ݺ����� ���� ���
			result = a[i];			// result�� ���� �ε����� Node ����
			System.out.print(i);	// ���� �ε��� ���
			while(result != null) {	// result Node�� null�� �ƴ϶��
				System.out.print("-->[" + result.key + "," + result.data + "]");	// �� ���
				result = result.next;		// result�� result ���� ��带 ����
			}
			System.out.println();	// ���� �ε��� �迭�� ����� ��� ���� ��µǸ� �ٹٲ� 
		}
	}
	
	private void checkRehash() {		// �������� ����ϴ� checkRehash �޼ҵ�
		cnt = 0;						// ���� cnt�� 0���� �ʱ�ȭ ��Ű��
		for(int i = 0; i < a.length; i++ ) {	// �ݺ����� ���ؼ�
			if(a[i] != null) cnt++; 	// �迭�� ���������� ����� �׸���� ���
		}
		if( (cnt >= (double)M *0.75) ||  (cnt <= (double)M *0.25)) rehash();	// �������� ���� ���ؽø޼ҵ� ȣ��
	}
	
	private void rehash()  {			// ���ؽ��ϴ� rehash�޼ҵ�
		int temp = M;					// ������ ũ�⸦ �����ϴ� �ӽ� ���� temp
		if(cnt >= (double)M *0.75 ) {	// �������� 0.75�� �ʰ��ϸ�
			M *= 2; 					// ũ�⸦ �ι�� �÷��ش�
			System.out.println("���̺��� ����� "+ temp +"���� "+ M +"�� �����մϴ�.");
			Node[] t = new Node[M];		// ���ο� �迭 ����
			for(int i = 0; i < temp; i++) {	// �ݺ����� ����
				t[i] = a[i];				// ���� ����
			}
			a = (Node[]) t;	 			// a�� t�� �ʱ�ȭ
		} else {						// rehash�� ȣ���ϴ� ���ǿ� ���� 0.25 �Ʒ��� ��������
			if( M == 5 )	return;		// �̶� �ּ� ũ���� 5�� �ش��ϸ� �޼ҵ� ���� >> 5�� ����θ� ũ�Ⱑ �����Ǳ� ����.
			M = (int) M / 2; 			// ũ�⸦ ������ �ٿ��ش�
			System.out.println("���̺��� ����� "+ temp +"���� "+ M +"�� �����մϴ�.");
			Node[] t = new Node[M];		// ���ο� �迭 ����
			for(int i = 0; i< M; i++) {		// �ݺ����� ����
				t[i] = a[i];				// ���� ����
			}
			a = (Node[]) t;	 				// a�� t�� �ʱ�ȭ
		}
	}
	public void delete(K key) {			// ���� ������ ���� delete �޼ҵ�
		for(int i = 0; i < a.length; i++ ) {// �ݺ����� ���� ����, ������ �����ϸ� �׳� �ݺ����� �������´� 
			if(a[i] == null) continue;
			if( key.equals(a[i].key) ) {	// �Էµ� key ���� ���� Node�� key�� �ִٸ�
				a[i] = null;				// Node ����
				break;						// �ݺ��� ����
			}
		}		
		checkRehash();						// �������꿡 ���� ������ ���
	}
}