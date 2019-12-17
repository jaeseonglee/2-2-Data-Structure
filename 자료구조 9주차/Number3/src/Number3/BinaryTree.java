package Number3;
import java.util.*;
public class BinaryTree	<Key extends Comparable<Key>>{
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
	
	public LinkedList<Node> subTreeCompare(BinaryTree t) {	// 같은 서브트리를 갖는지 확인하는 subTreeCompare 메소드
		LinkedList<Node> LinkedList = new LinkedList<Node>(); // 리턴 타입이 LinkedList<Node>...이므로 선언 및 초기화
		Queue<Node> q = new LinkedList<Node>();		// 두 트리를 비교하기 위해 큐 두개 생성
		Queue<Node> q2= new LinkedList<Node>();	
		Node temp;		// 임시 노드 2개 생성
		Node temp2;
		
		q.add(root);	// 루트 노드 큐에 삽입
		while(!q.isEmpty()) {	// 현 객체의 반복문
			temp = q.remove();	// 큐에서 가장 앞에 있는 노드 제거
			q2.add(t.getRoot());	// 매개변수의 루트 노드 큐에 삽입
			
			while(!q2.isEmpty()) {	// 매개변수 객체의 반복문
				temp2 = q2.remove();	// 큐에서 가장 앞에 있는 노드 제거
				if(isEqual(temp,temp2)) { // isEqual메소드를 통해 두 노드(트리)를 비교
					LinkedList.add(temp); // isEqual을 통해 루트와 그 서브 트리까지 같은 트리를 찾으면 LinkedList에 추가해준다
				}
				if (temp2.getLeft() != null)	// 레벨순회와 비슷하게 
					q2.add(temp2.getLeft());	// 큐에 왼쪽 또는 	
				if(temp2.getRight() != null)	// 오른쪽 자식이 null인지 확인해서 
					q2.add(temp2.getRight());	// 큐에 쌓아준다
			}
			if (temp.getLeft() != null)		// 바깥쪽에 반복문도
				q.add(temp.getLeft());		// 레벨순회에서 사용했던 것 처럼
			if(temp.getRight() != null)		// 자식이 null인지 확인해서
				q.add(temp.getRight());		// 큐에 쌓아준다
		}
 		return LinkedList;		// 중첩 반복문을 통해 항목이 추가된 LinkedList를 리턴해준다.
	}
}