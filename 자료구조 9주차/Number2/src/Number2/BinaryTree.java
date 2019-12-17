package Number2;
import java.util.*;

public class BinaryTree <Key extends Comparable<Key>>{
	private Node root;
	public BinaryTree()		{ root = null; }	// 트리 생성자
	public Node getRoot()	{ return root; }
	public void setRoot(Node newRoot)	{ root = newRoot;}	
	public boolean isEmpty()	{ return root == null; }
	
	public void insertValue(Key newItem) {		// 트리에 값을 넣는 insertValue 메소드, 강의자료의 레벨순회를 참조하여 작성됨
		Queue<Node> q = new LinkedList<Node>();		// 큐 자료구조
		Node newNode = new Node(newItem,null,null);	// 매개변수를 루트로 갖는 (서브)트리
		Node t;		// 임시 노드 생성
		
		if(isEmpty()) {	// 현재 이진트리에 아무것도 없다면 
			setRoot(newNode);	// newNode 노드는 루트가 된다
			return ;		// 메소드 종료
		}
		
		q.add(root);	// 큐에 루트를 저장
		while(!q.isEmpty()) {	// 큐가 존재하는 한 무한 반복
			t = q.remove();		// 큐의 가장앞에 있는 노드 제거
			if (t.getLeft() != null) 	// 왼쪽이 null이 아니라면
				q.add(t.getLeft());		// 큐의 왼쪽 자식 삽입
			if(t.getRight() != null) 	// 오른쪽이 null이 아니라면
				q.add(t.getRight());	// 큐의 오른쪽 자식 삽입
			if( t.getLeft() == null) {	// 왼쪽이 null이면 
				t.setLeft(newNode);		// newNode 노드는 왼쪽 자식이 되고
				break;					// 반복문을 빠져 나간다
			}	
			if( t.getRight() == null) {	// 왼쪽은 null아니고 오른쪽이 null이면 
				t.setRight(newNode);	// newNode 노드는 오른쪽 자식이 되고
				break;					// 반복문을 빠져 나간다
			}		
		}
	}
	
	public void preorder(Node n) {	// 트리를 전위순회하는 preorder 메소드
		if(n != null) {
			System.out.print(n.getKey()+ " ");	// 노드  n 방문
			preorder(n.getLeft());	// n의 왼쪽 서브트리를 순회하기 위해
			preorder(n.getRight());	// n의 오른쪽 서브트리를 순회하기 위해
		}
	}

	public void inorder(Node n) {	// 중위순회 하는 inorder 메소드
		if(n != null ) {
			inorder(n.getLeft());	// n의 왼쪽 서브트리를 순회하기 위해
			System.out.print(n.getKey() + " ");	// 노드  n 방문
			inorder(n.getRight()); // n의 오른쪽 서브트리를 순회하기 위해
		}
	}

	public void postorder(Node n) {	// 후위순회하는 postorder 메소드
		if(n != null) {
			postorder(n.getLeft());	// n의 왼쪽 서브트리를 순회하기 위해
			postorder(n.getRight());// n의 오른쪽 서브트리를 순회하기 위해
			System.out.print(n.getKey() + " ");// 노드  n 방문
		}
	}

	public void levelorder(Node root) {	// 레벨순회하는 levelorder 메소드
		Queue<Node> q = new LinkedList<Node>();	// 큐 자료구조 이용
		Node t;
		q.add(root);	// 루트 노드 큐에 삽입
		while(!q.isEmpty()) {
			t = q.remove();	// 큐에서 가장 앞에 있는 노드 제거
			System.out.print(t.getKey() + " ");	// 제거된 노드 출력(방문)
			if (t.getLeft() != null)	// 제거된 왼쪽 자식이  null이 아니면
				q.add(t.getLeft());		// 큐에 왼쪽 자식 삽입
			if(t.getRight() != null)	// 제거된 오른쪽 자식이 null이 아니면
				q.add(t.getRight());	// 큐에 오른쪽 자식 삽입
		}
	}
	
	public int size(Node n) {	// n을 루트로 하는 (서브)트리에 있는 노드 수 
		if(n == null)
			return 0;	// null이면 0 리턴
		else
			return (1+ size( n.getLeft() ) + size(n.getRight() ));
	}
	
	public int height(Node n) {	// n을 루트로 하는 (서브)트리에 있는 높이
		if(n == null)
			return 0;	// null이면 0 리턴
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}
	
	public static boolean isEqual(Node n, Node m) { // 두 트리의 동일성 검사
		if(n == null || m == null) 	// 둘중에 하나라도 null이면
			return n == m;			// 둘다 null이면 true, 아니면 false
		if(n.getKey().compareTo(m.getKey()) != 0)	// 둘다 null이 아니면 item 비교
			return false;
		
		return (isEqual(n.getLeft(), m.getLeft()) &&	// item이 같으면 왼쪽 자식 재귀호출
				isEqual(n.getRight(), m.getRight()));	// 오른쪽 자식 재귀호출
	}
	
	public int[] btree2intarr() { // Task 1 이진 트리를 배열로 저장하는 btree2intarr 메소드  
		Queue<Node> q = new LinkedList<Node>();	// 큐 자료구조 이용
		Node t;
		int [] arr = new int[size(root)+1];	// 배열을 size +1 만큼의 크기로 만들어준다
		int index = 1;	// 배열의 0번째 인덱스는 사용하지 않는다
		
		q.add(root);	// 루트 노드 큐에 삽입
		while(!q.isEmpty()) {
			t = q.remove();	// 큐에서 가장 앞에 있는 노드 제거
			arr[index] = (int)t.getKey(); // 매번 반복하면서 가장 앞에 있었던 노드의 Key값을 저장
			index++;			// 인덱스 증가
			if (t.getLeft() != null)	// 제거된 왼쪽 자식이  null이 아니면
				q.add(t.getLeft());		// 큐에 왼쪽 자식 삽입
			if(t.getRight() != null)	// 제거된 오른쪽 자식이 null이 아니면
				q.add(t.getRight());	// 큐에 오른쪽 자식 삽입
		}
		return arr;	// 반복문이 끝나면 배열 전체를 리턴
	}
	
	public void arrayPrint(int []arr) {	// 매개변수로 받은 배열을 출력하는 arrayPrint 메소드
		 System.out.println("배열 출력");
		for(int i = 1; i < arr.length; i++) {	// 0번째 인덱스는 사용하지 않는다 
			System.out.print(arr[i] +" ");	// 1번째 인덱스부터 끝까지 출력
		}
		System.out.println(); // 출력이 끝나면 줄바꿈
	}
	
	public void intarr2btree(int[] arr) {	//Task 2 intarr2btree 메소드 오버라이딩, 배열을 이진트리로 구성
		setRoot(null);
		for(int i =1; i< arr.length; i++) {
			insertValue((Key)(Integer)arr[i]);	// 반복문을 통해 값을 넣어준다.
		}
	} 
}

// 1029 주석 작성. 이 주석으로부터 위로 있는 메소드 3개를 insertValue에서 재귀호출을 하기 때문에 코딩이 이런 방향으로 쓰여졌다.
// 깃허브에서 다시 작성한다면 다른 방법으로 해볼것

 