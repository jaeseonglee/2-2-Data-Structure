package Number2;
public class BST <Key extends Comparable<Key>, Value>{
	public Node root;
	public Node getRoot() { return root; }
	public BST(Key newId, Value newName) { // BST 생성자
		root = new Node(newId, newName);
	}
	
	public Value get(Key k) { return get(root, k); }
	public Value get(Node n ,Key k) {
		if(n == null) return null;		// k를 발견못함
		int t = n.getKey().compareTo(k);
		if(t > 0)		return get(n.getLeft(), k);  // if (k < 노드 n의 id) 왼쪽서브트리 탐색
		else if( t < 0) return get(n.getRight(), k); // if (k > 노드 n의 id) 오른쪽서브트리 탐색
		else			return (Value) n.getValue(); // k를 가진 노드 발견
	}
	
	public void put(Key k, Value v) { root = put(root,k,v); }
	public Node put(Node n,Key k, Value v) {
		if(n == null)	return new Node(k,v);
		int t = n.getKey().compareTo(k);
		if(t > 0)		 n.setLeft(put(n.getLeft(), k, v));	// if (k < 노드 n의 id) 왼쪽서브트리 탐색
		else if ( t < 0) n.setRight(put(n.getRight(), k ,v));// if (k > 노드 n의 id) 오른쪽서브트리 탐색
		else n.setValue(v);	// 노드 n의 name을 v로 갱신
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
	
	public void deleteMin() {
		if(root == null) System.out.println("empty 트리");
		else root = deleteMin(root);
	}
	private Node deleteMin(Node n) {
		if(n.getLeft() == null) return n.getRight(); // if(n의 왼쪽 자식 == null) n의 오른쪽 자식 리턴
		n.setLeft(deleteMin(n.getLeft()));			// if (n의 오른쪽 자식!=null) n의 왼쪽자식으로 재귀호출
		return n;
	}
	
	public void delete(Key k) { root = delete(root,k);}
	public Node delete(Node n,Key k) {
		if(n == null) return null;
		int t = n.getKey().compareTo(k);
		if(t > 0)		n.setLeft(delete(n.getLeft(),k));	// if (k < 노드 n의 id) 왼쪽 자식으로 이동
		else if (t < 0) n.setRight(delete(n.getRight(),k));	// if (k > 노드 n의 id) 오른쪽 자식으로 이동
		else {	// 삭제할 노드 발견
			if(n.getRight() == null) return n.getLeft(); // case 0,1
			if(n.getLeft() == null) return n.getRight(); // case 1   
			Node target = n;		// case 2 Line10-13
			n = min(target.getRight());	// 삭제할 노드 자리로 옮겨올 노드 찾아서 n이 가리기케 함
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
	
	public void deleteMax() {		// 최댓값을 삭제하는 deleteMax 메소드
		if(root == null) System.out.println("empty 트리");
		else root = deleteMax(root);
	}
	private Node deleteMax(Node n) {
		if(n.getRight() == null) return n.getLeft();
		n.setRight(deleteMax(n.getRight()));		
		return n;
	}
}
