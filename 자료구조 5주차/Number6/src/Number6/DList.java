package Number6;

public class DList <E> {		// 이중 연결리스트 DList
	protected DNode head, tail;
	protected int size;
	public DList() {		// 생성자
		head = new DNode(null, null ,null);
		tail = new DNode(null, head, null);// 이전의 값인 head를 가리킴
		head.setNext(tail);		// head의 다음 노드를 tail로 만든다.
		size =0;
	}
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem,t,p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	public void insertAfter(DNode p, E newItem) {// p가 가리키는 노드 앞에 삽입
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode); // 노드를 가리키는 이전의 값고 다음 값을 바꿔준다
		p.setNext(newNode);
		size++;
	}

	public void print() { // 이중연결 리스트르 출력하는 print 메소드
		DNode result = head.getNext();
		for(int i=0; i< size; i++) {
			System.out.print(result.getItem()+"\t");
			result = result.getNext();
		}
		if(size == 0 ) {System.out.print("리스트 비어있음");}
		System.out.println();		
	}
	
	
	public int add(DList dl2) {	// 두개의 리스트를 합치는 add 메소드
		int result = 0;	// 결과를 저장할 result 변수
		int ten;		// 10의 n제곱을 저장할 ten
		DNode temp = head.getNext();	// 임시 DNode temp;
		
		for(int i = size; i > 0 ; i--) { // 반복문을 통해 두 객체에 있는 값들을 정수로 바꿔 저장한다
			ten = 1;
			for(int j = 1; j < i; j++) { ten *= 10; }	// size만큼 10의 n제곱을 해준다
			result = result + (int)temp.getItem() * ten;// 10의 n제곱 만큼 값을 곱해서 저장
			temp = temp.getNext();		// 값의 저장이 끝나면 다음 노드를 가리킨다
		}
		
		temp = dl2.head.getNext();		// 매개변수의 값을 가리키게 초기화
		for(int i = dl2.size; i > 0; i--) {	// 위와 같이 반복문을 통해
			ten = 1;
			for(int j = 1; j<i; j++) { ten *= 10; }
			result = result + (int)temp.getItem() * ten; 	// 값을 저장하고
			temp = temp.getNext();
		}
		return result;	 // 모든 값의 계산이 끝나면 결과를 반환
	}
}