package Number4;

public class BST <Key extends Comparable<Key>, Value>{
	public Node root;
	public Node getRoot() { return root; }
	
	private int[] arr ;			// Ʈ���� Key���� ������ int�� ���� �迭 ����
	private int num = 0;		// ������ Ŭ���� �������� num ���� �� 0���� �ʱ�ȭ
	
	public BST(Key newId, Value newName) { // BST ������
		root = new Node(newId, newName);
	}
	
	public BST() {} // �ƹ��� ���ڵ� ���� �ʴ� ������ �߰�
	
	public Value get(Key k) { return get(root, k); }
	public Value get(Node n ,Key k) {
		if(n == null) return null;		// k�� �߰߸���
		int t = n.getKey().compareTo(k);
		if(t > 0)		return get(n.getLeft(), k);  // if (k < ��� n�� id) ���ʼ���Ʈ�� Ž��
		else if( t < 0) return get(n.getRight(), k); // if (k > ��� n�� id) �����ʼ���Ʈ�� Ž��
		else			return (Value) n.getValue(); // k�� ���� ��� �߰�
	}
	
	public void put(Key k, Value v) { root = put(root,k,v); }
	public Node put(Node n,Key k, Value v) {
		if(n == null)	return new Node(k,v);
		int t = n.getKey().compareTo(k);
		if(t > 0)		 n.setLeft(put(n.getLeft(), k, v));	// if (k < ��� n�� id) ���ʼ���Ʈ�� Ž��
		else if ( t < 0) n.setRight(put(n.getRight(), k ,v));// if (k > ��� n�� id) �����ʼ���Ʈ�� Ž��
		else n.setValue(v);	// ��� n�� name�� v�� ����
		return n;
	}
	
	public Key min() {
		if(root == null) return null;
		return (Key) min(root).getKey();
	}
	private Node min(Node n) {
		if(n.getLeft() == null) return n;
		return min(n.getLeft());
	}
	
	// �ּڰ� ���� ����
	public void deleteMin() {
		if(root == null) System.out.println("empty Ʈ��");
		else root = deleteMin(root);
	}
	private Node deleteMin(Node n) {
		if(n.getLeft() == null) return n.getRight(); // if(n�� ���� �ڽ� == null) n�� ������ �ڽ� ����
		n.setLeft(deleteMin(n.getLeft()));			// if (n�� ������ �ڽ�!=null) n�� �����ڽ����� ���ȣ��
		return n;
	}
	
	public void delete(Key k) { root = delete(root,k);}
	public Node delete(Node n,Key k) {
		if(n == null) return null;
		int t = n.getKey().compareTo(k);
		if(t > 0)		n.setLeft(delete(n.getLeft(),k));	// if (k < ��� n�� id) ���� �ڽ����� �̵�
		else if (t < 0) n.setRight(delete(n.getRight(),k));	// if (k > ��� n�� id) ������ �ڽ����� �̵�
		else {	// ������ ��� �߰�
			if(n.getRight() == null) return n.getLeft(); // case 0,1
			if(n.getLeft() == null) return n.getRight(); // case 1   
			Node target = n;		// case 2 Line10-13
			n = min(target.getRight());	// ������ ��� �ڸ��� �Űܿ� ��� ã�Ƽ� n�� �������� ��
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}
	
	public void print() { 
		print(root);
		System.out.println();
	}
	public void print(Node n) {
		if(n != null) {
			print(n.getLeft());
			System.out.print(n.getValue() + " ");
			print(n.getRight());
		}
	}
	
	public int size(Node n) {	// n�� ��Ʈ�� �ϴ� (����)Ʈ���� �ִ� ��� �� 
		if(n == null)
			return 0;	// null�̸� 0 ����
		else
			return (1+ size( n.getLeft() ) + size(n.getRight() ));
	}
	
	public boolean checkBST() {
		arr = new int[size(root)];	// �迭�� Ʈ���� ��� ������ �ʱ�ȭ ���ش�
		num = 0;					// �޼ҵ� ȣ�⸶�� num �� 0���� �ʱ�ȭ
		checkBST(root);				
		for(int i = 1; i < size(root); i++) {
			if(arr[i-1] > arr[i]) return false;		// ������ȸ�� ���ĵ� �迭�� �ƴ϶��  false ��ȯ
		}
		return true;
	}
	
	private void checkBST(Node n) {
		if(n != null) {
			checkBST( n.getLeft());	// ������ȸ�� ���� ���� �ڽ��� Ȯ��
			arr[num] = (int) n.getKey();	// ������ Key���� �迭�� ����
			num++;		// num ����
			checkBST( n.getRight());	// �����ڽİ� ��Ʈ�� Ȯ���� ������ �ڽ� Ȯ��
		}
	}
	
	public void setRoot(Node n) { root = n; }
	
}
