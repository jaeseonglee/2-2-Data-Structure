package Number7;

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

	public void print() {	// 연결리스트를 출력하는 print 메소드
		Node result = last.getNext();	// last의 다음노드가 리스트의 첫 항목이므로 가리켜준다
		for(int i=0; i< size; i++) {
			System.out.print(result.getItem()+"\t");
			result = result.getNext();
		}
	}
	
	public void rotateLeft(int n) {	// 왼쪽으로 n번 회전하는 rotateLeft메소드 
		Node temp = last;		// 0번회전할 수 있기 때문에 last로 초기화 해준다
		for(int i = 0; i < n; i++) {	// n번 만큼 회전을 위해 반복문 사용
			temp = temp.getNext();		// 환형 연결리스트에서는 마지막 노드가 처음 노드를 가리키므로 한번씩 이동
		}
		last = temp;		// temp로 바뀐 연결 리스트를  last에 저장
	}
	
	public void rotateRight(int n) { // 오른쪽으로 n번 회전하는 rotateRight메소드
		Node temp = last;			// 0번회전할 수 있기 때문에 last로 초기화 해준다
		for(int i = 0; i < n; i++) {	// n번 회전하기 위해 반복문 사용
			for(int j=0; j < size-1; j++) {	// 오른쪽 회전의 경우 마지막 노드가 마지막 전 노드를 가리켜야하므로
				temp = temp.getNext();		// size-1만큼 왼쪽으로 회전해서 결과적으로 오른쪽으로 한번 회전한것과 같게 한다
			}
		}
		last = temp;		// temp로 바뀐 연결 리스트를 last에 저장
	}
}