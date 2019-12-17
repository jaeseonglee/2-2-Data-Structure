package Number4;			// Number4(실습4번) 패키지

public class SList <E> {	// 단순 연결 리스트 SList 클래스
	protected Node head;	// 연결 리스트의 첫 노드를 가리킴
	private int size;		// 노드 수
	
	public SList() {		// 연결 리스트 생성자
		head = null;		// 기본 생성자는 각각 NULL값과 0으로 초기화 해준다
		size = 0;
	}
	
	public void setAndOrderNodes(int[] arr) {// 정수형 배열을 매개변수로 받는 setAndOrderNodes메소드
		if(arr != null) {	
			head = null;	// 리스트에 저장된 모든 노드삭제
			size = 0;		
		} else return ;		
		
		head = new Node(arr[0],head);// 배열의 첫번째 인덱스의 값을 저장
		size++;  			// 노드  수 증가
		Node temp;			// 임시 노드 temp 선언
	
		for(int i = 1; i < arr.length; i++) {// 중첩 반복문을 통해 배열의 값을 노드에 저장
			temp = head;		// 매 반복마다 temp가 head를 가리키도록 초기화
			
			for(int j = 1; j <= i; j++) {	// 배열의 원소가  노드에 저장된 숫자에 대하여 오름차순으로 값을 저장
				if(arr[i] <= (int)head.getItem() ) {	// head의 맨 첫번째 값보다 작거나 같으면
					head = new Node(arr[i], head);	// 맨앞에 추가해준다 
					size++;		// 노드 수 증가
					break;		// 안쪽의 반복문을 빠져나간다
				} else if ( j == i ) {	// 안쪽의 반복문이 마지막까지 반복한다는건 현재  배열의 값보다 큰 값이 없으므로
					temp.setNext(new Node( arr[i],temp.getNext() ) );	// 마지막에 추가해준다
					size++;		// 노드 수 증가
					break;		// 안쪽의 반복문을 빠져나간다
				} else  {	// 위의 두 조건을 지나 현재 노드가 가리키는 값보다 큰 값이라면 ex) arr[i] > (int)temp.getItem() 
					if(arr[i] <= (int)temp.getNext().getItem() ) {	// 다음 노드가 가진 값보다 작으면 
						temp.setNext(new Node( arr[i] , temp.getNext() ) );	
								// 현재 노드가 다음 노드 대신 배열의 현재값을 가진 노드를 가리키도록 저장  
						size++;	// 노드 수 증가											
						break;	// 안쪽의 반복문을 빠져나간다
					} else {
						temp = temp.getNext();	// 다음 노드가 가진 값보다도 크다면 
						continue;				// 안쪽의 반복문을 다시 실행한다.
					}
				} 
			}	// 안쪽의 반복문 종료
		}	// 바깥쪽의 반복문 종료
	}		// 메소드 종료
	

	public void print() {			// 출력을 위한 print함수
		Node result = head;
		System.out.print("단순 연결 리스트 출력 : ");
		for(int i=0; i< size; i++) {// 반복문을 통해 첫 노드부터 끝까지 출력해준다
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
	
	public void join (SList slist2)  {		// 두 연결 리스트 결합하는 join 메소드
		int [] arr = new int[slist2.size+size];	// 두 연결리스트의 길이만큼의 크기로 배열을 초기화해준다 
		for(int i=0; i<size; i++) {			// 반복문을 통해 두 연결리스트가 가진 값들을 하나의 배열로 저장한다
			arr[i] = (int)head.getItem();
			head = head.getNext();
		}
		for(int i= 0 + size; i< slist2.size +size; i++) {
			arr[i] = (int)slist2.head.getItem();
			slist2.head = slist2.head.getNext();
		}
		
		setAndOrderNodes(arr);	// setAndOrderNodes 메소드를 이용해서 두 연결리스트가 가진 값들을 하나의 연결리스트에 저장한다. 
	}
}
