package Number5;

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
	
	public String getPostEq(String s) { // 중위표기법 수식을 후위표기법 수식으로 변환하는 getPostEq 메소드
		String result = "";		// 후위표기법으로 출력할 result 변수 생성 및 초기화
		Object temp = null;		// 임시 클래스 변수 선언 
		System.out.println(s);	// 입력받은 매개변수 출력
		
		// ASCII 코드 
		// 40 : (	// 41 : )
		// 42 : *	// 43 : +
		// 45 : -	// 47 : /
		
		for(int i= 0; i <s.length(); i++ ) {	// for문과 switch문을 통해 결과 저장
			switch(s.charAt(i)) {	// switch문
			case (char)40:			// '(' 가 오면 
				push((E)(Object)s.charAt(i)); // 스택에 쌓아준다.
				break;				// switch문 빠져나가 다음 반복문을 실해
			case (char)41:			//  ')' 가 오면 
				while (top.getItem() != (Object)(char)40) {	// top이 '('가 될때까지 무한반복
					result += pop();	// result에 문자들을 쌓아준다.
				} 
				temp = pop();		// top이 '('가 되어 반복문을 빠져나오면 '(' 를 pop 해주어 temp값에 저장 
				break;			  	
				
			case (char)43:			// +,- 가 오면
			case (char)45:
				if(isEmpty() || top.getItem() == (Object)(char)40) { // +,- 보다 낮은 우선순위를 가진 것은 '(', 그리고 스택이 없을 때
					push((E)(Object)s.charAt(i));	// + 또는 -를 push해준다.
				} else {
					result += pop();				// 위의 조건이 아니라면 스택에 쌓인 연산자를 pop해주고
					push((E)(Object)s.charAt(i));	// + 또는 -를 push해준다.
				}
				break;
				
			case (char)42:			// *,/ 가 오면
			case (char)47:
				if(isEmpty() ||top.getItem() == (Object)(char)40 ||   // 스택이 없거나, (,+,- 가 top에 오면 
					top.getItem() == (Object)(char)43 || top.getItem() == (Object)(char)45 ) {
					push((E)(Object)s.charAt(i)); // * 또는 /를 push해준다. 
				} else {
					result += pop();			 // 위의 조건이 아니라면 스택에 쌓인 연산자를 pop해주고
					push((E)(Object)s.charAt(i));//* 또는 /를 push해준다.
				}
				break;
				
			default:
				result += s.charAt(i);			// 연산자나 괄호가 아닌 문자들은 그대로 출력값에 저장해준다.
				break;
			}
		} // for문 종료
		
		while(isEmpty() != true) { // for문을 통해 result값이 정해지지만
			result += pop();	// 아직 스택에서 빠지지않은 연산자들은 result값에 추가해준다.
		}
		
		return result;	// 위의 반복문들이 끝나면, result값을 반환해준다.
	}
}
