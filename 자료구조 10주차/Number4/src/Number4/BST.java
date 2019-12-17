package Number4;

public class BST <Key extends Comparable<Key>, Value>{
	public Node root;
	public Node getRoot() { return root; }
	
	private int[] arr ;			// 트리의 Key값을 저장할 int형 전역 배열 생성
	private int num = 0;		// 정수형 클래스 전역변수 num 선언 및 0으로 초기화
	
	public BST(Key newId, Value newName) { // BST 생성자
		root = new Node(newId, newName);
	}
	
	public BST() {} // 아무런 인자도 받지 않는 생성자 추가
	
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
	
	// 최솟값 삭제 연산
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
	
	public int size(Node n) {	// n을 루트로 하는 (서브)트리에 있는 노드 수 
		if(n == null)
			return 0;	// null이면 0 리턴
		else
			return (1+ size( n.getLeft() ) + size(n.getRight() ));
	}
	
	public boolean checkBST() {
		arr = new int[size(root)];	// 배열을 트리의 노드 갯수로 초기화 해준다
		num = 0;					// 메소드 호출마다 num 을 0으로 초기화
		checkBST(root);				
		for(int i = 1; i < size(root); i++) {
			if(arr[i-1] > arr[i]) return false;		// 중위순회로 정렬된 배열이 아니라면  false 반환
		}
		return true;
	}
	
	private void checkBST(Node n) {
		if(n != null) {
			checkBST( n.getLeft());	// 중위순회로 먼저 왼쪽 자식을 확인
			arr[num] = (int) n.getKey();	// 현재의 Key값을 배열에 저장
			num++;		// num 증가
			checkBST( n.getRight());	// 왼쪽자식과 루트를 확인후 오른쪽 자식 확인
		}
	}
	
	public void setRoot(Node n) { root = n; }
	
}
