import java.util.NoSuchElementException;
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
	
	public void delete(DNode x) {	// p가 가리키는 노드 삭제
		if( x == null ) throw new NoSuchElementException();
		if( size <= 0 )	throw new NoSuchElementException();
		DNode f = x.getPrevious();	// 노드가 가리키는 이전의 값과
		DNode r = x.getNext();		// 다음의 값을
		f.setNext(r);		// 그 다음 노드로 설정함으로써  값을 삭제
		r.setPrevious(f);
		size--;
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
}