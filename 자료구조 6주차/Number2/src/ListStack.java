import java.util.EmptyStackException; // 예외처리를 위한 전처리문
public class ListStack <E> {	// 리스트로 스택을 구현한 ListStack 클래스 
	private Node<E> top;	// 스택 top 항목을 가진 Node를 가리키기 위해
	private int size;		// 스택의 항목 수
	public ListStack() {	// 스택 생성자
		top = null;
		size = 0;
	}
	public int	size()	{return size;} // 스택의 항목의 수를 리턴
	public boolean isEmpty() {return size ==0;}	// 스택이 empty이면 true 리턴
	
	public E peek() {		// 스택 top 항목만을 리턴
		if(isEmpty()) throw new EmptyStackException();// underflow
		return top.getItem();
	}
	
	public void push(E newItem) {	// 스택 push 연산
		Node newNode = new Node(newItem, top);	// 리스트 앞부분에 삽입
		top = newNode;			// top이 새 노드 가리킴
		size++;					// 스택 항목 수 1증가
	}
	
	public E pop() {		// 스택 pop 연산
		if(isEmpty()) throw new EmptyStackException();// underflow
		E topItem  = top.getItem();	// 스택 top 항목을 topItem에 저장
		top = top.getNext();		// top이 top 바로 아래 항목을 가리킴
		size--;						// 스택 항목 수를 1 감소
		return topItem;
	}
	
	public void print() { // 스택을 출력하는 print 메소드	
		Node result = top;
		for(int i=0; i< size; i++) {// 반복문을 통해 첫 노드부터 끝까지 출력해준다
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
}
