package Number5;

public class SList <E> {	// 단순 연결 리스트를 뜻하는 SList 클래스
	protected Node head;	// 연결 리스트의 첫 노드를 가리킴
	private int size;		// 노드 수
	
	public SList() {		// 연결 리스트 생성자
		head = null;		// 기본 생성자는 각각 NULL값과 0으로 초기화 해준다
		size = 0;
	}
	
	public void insertFront(E newItem) {// 연결리스트 맨앞에 새 노드 삽입
		head = new Node(newItem,head);	// head가 가리키는 노드를 변경해준다
		size++;		
	}
	public void print() {			// 출력을 위한 print함수
		Node result = head;
		for(int i=0; i< size; i++) {// 반복문을 통해 첫 노드부터 끝까지 출력해준다
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
	}
	
	public void reverse() {	// 리스트를 역방향으로 바꾸는 reverse함수
		Node result = null;	// 결과를 저장할 result 선언
		for(int i=0; i< size; i++) {// 반복문을 통해
			result = new Node( head.getItem(), result);	// result 맨 앞으로 값을 저장
			head = head.getNext();	// 반복할때 마다 head의 다음 노드로 초기화 
		}
		head = result;	// 역방향으로 저장된 result를 head에 저장
	}
	
}
