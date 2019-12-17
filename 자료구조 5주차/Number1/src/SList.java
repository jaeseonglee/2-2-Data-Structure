import java.util.NoSuchElementException;

public class SList <E> {	// 단순 연결 리스트를 뜻하는 SList 클래스
	protected Node head;	// 연결 리스트의 첫 노드를 가리킴
	private int size;		// 노드 수
	
	public SList() {		// 연결 리스트 생성자
		head = null;		// 기본 생성자는 각각 NULL값과 0으로 초기화 해준다
		size = 0;
	}
	
	public int search(E target) {	// target를 탐색
		Node p = head;				// 첫 노드를 가리키는 head로 초기화
		for( int k = 0; k < size; k++) {// 반복문을 통해 첫 노드부터 끝까지
			if(target == p.getItem()) return k;	// target과 같다면 값을 리턴해준다
			p = p.getNext();		// 찾지 못하면 다음 노드로 탐색
		}
		return -1;		// 탐색을 실패한경우 -1 리턴
	}
	
	public void insertFront(E newItem) {// 연결리스트 맨앞에 새 노드 삽입
		head = new Node(newItem,head);	// head가 가리키는 노드를 변경해준다
		size++;		
	}
	
	public void insertAfter(E newItem, Node p) {	// 노드 p바로 다음에 새 노드 삽입
		p.setNext(new Node(newItem, p.getNext()));	// 노드 p가 가리키는 노드를 바꿔준다
		size++;
	}
	
	public void deleteFront() {	// 리스트의 첫 노드 삭제
		if(size ==0) throw new NoSuchElementException();	// 항목수가 0개라면 예외발생
		head = head.getNext();		// head가 가리키는 노드(첫 노드)를 그 다음 노드로 지정해주어
		size--;						// GC가 기존의 첫 노드를 수거해간다
	}
	
	public void deleteAfter(Node p) { //  p가 가리키는 노드의 다음 노드를 삭제
		if(p == null) throw new NoSuchElementException();
		Node t = p.getNext();	
		p.setNext(t.getNext());		// deleteFront 메소드처럼 그 다음 노드로 가리켜서
		t.setNext(null);			// 기존 노드의 정보를 null로 가리키며 지워준다
		size--;
	}
	
	public void print() {			// 출력을 위한 print함수
		Node result = head;
		for(int i=0; i< size; i++) {// 반복문을 통해 첫 노드부터 끝까지 출력해준다
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
	}
	
	public  int size() {return size;}	// 현재 노드 갯수를 리턴하는 size메소드	 
}

