package Number4;

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
	
	public boolean checkPalindrome(String s) {  // 주어진 단어가 회문인지 판별하는 checkPalindrome메소드
		int count = 0;			// 리턴 값을 결정할 count 변수 0으로 초기화
		int len = s.length();	// 문자열의 길이를 저장할 변수 len
		
		for(int i =0; i < len/2 ; i++) {	// 먼저 문자의 절반까지, 글자수가 홀수면 절반 그 앞까지 출력과 push연산
			System.out.print(s.charAt(i));	// 문자 하나씩 출력
			push( (E)(Object)s.charAt(i) );	// 그리고 push를 통해 stack에 넣어준다.
		}
		for(int i = len/2; i < len; i++) {  // 그리고 남은 절반을 출력과 대조를 통해 회문여부 판단
			System.out.print(s.charAt(i));	// 문자 하나씩 출력
			if(i == len/2 && len % 2 == 1) continue;	// 첫번째 반복에서 글자수가 홀수면 가운데 문자를 버려준다.
			if(pop() != (Object)s.charAt(i)) { count++; }	// 현재 문자와 stack에 쌓인 문자가 다르면 count 증가 
		}
		System.out.println();	// 문자열 출력 및 count값을 결정하는 반복문이 끝나면 줄바꿈 
		if(count == 0) { return true;}	// count 값에 따라 true false 결정
		else { return false;}
	}
	
}
