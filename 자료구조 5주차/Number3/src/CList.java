import java.util.NoSuchElementException;
public class CList <E> {//환형 연결리스트 CList 클래스
	private Node last;	// 리스트의 마지막 노드(항목)을 가리킨다
	private int size;	// 리스트의 항목(노드) 수
	public CList() {	// 생성자
		last = null;
		size = 0;
	}
	
	public void insert(E newItem) {	// last가 가리키는 노드의 다음에 새노드 삽입
		Node newNode = new Node(newItem,null);	// 새 노드 생성
		if(last == null) {						// 리스트가 empty일때
			newNode.setNext(newNode);		// 새 항목을 리스트의 첫 노드로 삽입함
			last = newNode;
		}
		else {	
			newNode.setNext(last.getNext());//newNode의 다음 노드가 last가 가리키는 노드의 다음노드가 되도록
			last.setNext(newNode);	// last가 가리키는 노드의 다음 노그가 newNode가 되도록
		}
		size++;
	}
	
	
	public Node delete() {// last가 가리키는 노드의 다음 노드르 제거
		if(isEmtpy()) throw new NoSuchElementException();
		Node x = last.getNext();	// x가 리스트의 첫 노드를 가리킴
		if(x == last) last = null;	// 리스트에 1개의 노드만 있는 경우
		else {
			last.setNext(x.getNext());	//last가 가리키는 노드의 다음 노드가 x의 다음 노드가 되도록
			x.setNext(null);		// x의 next를 null로 만든다.
		}
		size--;
		return x;
	}
	
	private boolean isEmtpy() {	// 항목이 없는지 알려주는 isEmpty 메소드
		if(size == 0) return true;
		else return false;
	}
	
	public int size() {	return size;}	// 항목수를 리턴하는 size메소드

	public void print() {	// 연결리스트를 출력하는 print 메소드
		Node result = last.getNext();	// last의 다음노드가 리스트의 첫 항목이므로 가리켜준다
		for(int i=0; i< size; i++) {
			System.out.print(result.getItem()+"\t");
			result = result.getNext();
		}
	}
}
