package Number5;

import java.util.NoSuchElementException;
public class ListQueue <E> {
	private Node<E> front, rear;
	private int size;
	public ListQueue() {	// 생성자
		front = rear = null;
		size = 0;
	}
	public int size() {return size;}		// 큐의 항목의 수를 리턴
	public boolean isEmpty() {return size() == 0;}	// 큐가 empty이면 true리턴
	
	public void add(E newItem) {
		Node newNode = new Node(newItem,null);	// 새 노드 생성
		if(isEmpty()) front = newNode;	// 큐가 empty이었으면 front도 newNode를 가리키게 한다
		else rear.setNext(newNode);		// 그렇지 않으면 rear의 next를 newNode를 가리키게 한다
		rear = newNode;					// 마지막으로 rear가 newNode를 가리키게 한다
		size++;							// 큐 항목 수 1증가
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();	// underflow 경우에 프로그램 정지
		E frontItem = front.getItem();	//front가 가리키는 노드의 항목을 frontItem에 저장
		front = front.getNext();		// front가 front 다음 노드를 가리키게 한다.
		size--;							// 큐 항목 수 1감소
		if(isEmpty()) rear = null;		// 큐가 empty면 rear = null
		return frontItem;
	}
	
	public void print() {
		Node result = front;
		for(int i=0; i< size(); i++) {// 반복문을 통해 첫 노드부터 끝까지 출력해준다
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
}