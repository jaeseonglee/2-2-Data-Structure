package Number6;

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
	
	public double calc (String s[] ) { // 주어진 후위표기법 수식을 계산하는 calc메소드
		double result = 0; 		// 결과를 반환할 변수 result 선언 및 초기화
		double temp = 0;		// 값을 임시적으로 저장할 temp 선언 및 초기화
		
		for(int i=0; i<s.length; i++) {	// 반복문을 통해 주어진 매개변수 문자열 배열을 출력
			System.out.print(s[i]+" ");
		}
		System.out.println();		// 출력이 끝나면 줄바꿈
		
		// ASCII 코드 
		// 42 : *	// 43 : +
		// 45 : -	// 47 : /
		
		for(int i=0; i< s.length; i++) {	// 반복문과 push,pop을 통해 수식 계산
			if(s[i].length() == 1) {		// 문자열의 길이가 한글자일 경우( 연산자 또는 한자리숫자)
				if( s[i].charAt(0) == (char)42) {	// '*' 라면
					temp = (double)pop();			// double형으로 pop해주어 temp에 저장
					temp =  (double)pop() * temp;	// 한번 더 pop 해주고 두 요소를 곱해주어 다시 temp에 저장
					push( (E)(Object)temp );		// 그 결과로 나온 temp를 E 타입으로 push해준다
					
				} else if(s[i].charAt(0) == (char)43) {	// '+' 라면
					temp = (double)pop();			
					temp =  (double)pop() + temp;	// 두번 pop해주고 두 요소를 더해준다.
					push( (E)(Object)temp );		// 결과로 나온 temp를 push
					
				} else if(s[i].charAt(0) == (char)45) {	// '-' 라면
					temp = (double)pop();		
					temp =  (double)pop() - temp;	// 두번 pop해주고 두 요소를 빼준다.
					push( (E)(Object)temp );		// 결과로 나온 temp를 push
					
				} else if(s[i].charAt(0) == (char)47) {	// '/' 라면
					temp = (double)pop();			// pop을 먼저 하고 
					temp =  (double)pop() / temp;	// 그 다음 pop 하는 요소에 temp로 나누어 준다.
					push( (E)(Object)temp );		// 결과로 나온 temp를 push
				} else {		// 위의 조건을 만족하지 않는, 즉 한글자의 숫자라면
					temp = Double.parseDouble(s[i]);// 문자열을 실수형으로 변환해주고
					push((E)(Object)temp);			// 값을 push 해준다
				}		
			} else {				// 한글자가 아니라면 숫자이기 떄문에
				temp = Double.parseDouble(s[i]);	// 문자열을 실수형으로 변환해주고
				push((E)(Object)temp);				// 값을 push 해준다.
			}
		}
		
		result = (double)pop();	// 반복문을 통해 계산되어 저장된 스택의 최종 top의 값을 pop해준어 result에 저장 
		return result;			// result를 반환해준다.
	}
	
}