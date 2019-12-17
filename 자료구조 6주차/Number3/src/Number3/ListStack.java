package Number3;

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
	
	public void print() { // 스택을 출력하는 print 메소드	, 이 프로그램에서는 사용하지 않는다.
		Node result = top;
		for(int i=0; i< size; i++) {// 반복문을 통해 첫 노드부터 끝까지 출력해준다
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
	
	public boolean checkParentheses(String s) {	// 매개변수 문자열을 괄호짝맞추는 checkParentheses 메소드
		int count = 0;	// 리턴 값을 결정할 count 변수 0으로 초기화
		
		// ASCII 코드 
		// 40 : (	// 41 : )
		// 91 : [ 	// 93 : ]
		// 123 : { 	// 125 : }
		
		for(int i = 0; i < s.length(); i++ ) { // 반복문을 통해 출력과 count 값 결정
			System.out.print(s.charAt(i));	// 문자 하나씩 출력
			if( s.charAt(i) == (char)40 || s.charAt(i) == (char)91 ||  s.charAt(i) == (char)123 ) { 
				push( (E)(Object)s.charAt(i) );	// 왼쪽의 괄호들이  ( { [  오면 스택에 쌓아준다.
												// push 호출단계에서는 E 타입이 안정해졌기 때문에 Object클래스로 형변환 해준다.
			}
			else if(s.charAt(i) == (char)41 ) {	// ')' 가 오면
				if(isEmpty()) { // 먼저 스택이 비어있는지 확인
					count++;	// pop연산에 isEmpty가 있기 때문에 예외처리를 해버린다.
					continue;	// 비어있으면 괄호짝맞추기에 실패, count를 증가시키고 반복을 이어간다.
				}
				if(pop() != (Object)(char)40) { count++;}	// '(' 가 아니라면 count 증가
					// (char)40을 pop()반환값에 맞춰주기 위헤 Object사용,  pop연산으로 스택이 빠져나가는것을 주의!
			} 
			else if(s.charAt(i) == (char)93 ) { // ']' 가 오면
				if(isEmpty()) {	// 위와 같은 이유로 스택이 비어있는지 확인
					count++;
					continue;
				}
				if(pop() != (Object)(char)91) { count++;} // '[' 가 아니라면 count 증가
			} 
			else if(s.charAt(i) == (char)125 ) { // '}' 가 오면
				if(isEmpty()) {	// 위와 같은 이유로 스택이 비어있는지 확인
					count++;
					continue;
				}
				if(pop() != (Object)(char)123) { count++;}// '{' 가 아니라면 count 증가
			}
		}
		System.out.println();	// 문자열 출력 및 count값을 결정하는 반복문이 끝나면 줄바꿈 
		if(count == 0) { return true;}	// count 값에 따라 true false 결정
		else { return false;}
	}
	
}
