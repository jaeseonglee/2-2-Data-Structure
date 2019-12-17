/**	자료구조 6주차
 * 	Q1 : ArrayStack.java, main.java
 *  작성일 : 2019.10.07 ~ 10.09
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 배열로 구현 스택자료구조. 강의자료의 코드와 동일하다.
 */
import java.util.EmptyStackException;	// 예외 처리를 위한 전처리문
public class ArrayStack <E> {	// 배열로 스택을 구현한 ArrayStack 클래스
	private E	s[];		// 스택을 위한 배열
	private int	top;		// 스택의 top 항목의 배열 원소 인덱스
	public ArrayStack() {	// 스택 생성자
		s = (E[]) new Object[1];	// 초기에 크기가 1인 배열 생성
		top = -1;
	}
	
	public int	size()	{ return top+1; }	// 스택에 있는 항목의 수를 리턴  
	public boolean isEmpty() { return (top == -1);}// 스택이 empty면 true 리턴
	
	
	public E peek() {	// 스택 top 항목의 내용만을 리턴
		if(isEmpty()) throw new EmptyStackException();	// underflow시 프로그램 정지
		return s[top];
	}
	
	public void push(E newItem) { // push 연산 메소드
		if (size() == s.length)	// 배열의 크기보다 더 많이 저장한다면
			resize(2*s.length);	// 스택을 2배의 크기로 확장
		s[++top] = newItem;		// 새 항목을 push
	}
	
	public E pop() {	// pop 연산 메소드
		if (isEmpty()) throw new EmptyStackException();	// underflow시 프로그램 정지
		E item = s[top];
		s[top--] = null;		// null로 초기화
		if(size() > 0 && size() == s.length/4) 
			resize(s.length/2);// 스택을 1/2크기로 축소
		return item;
	}

	
	private void resize(int newSize) {	// 배열의 크기를 조절하는 resize 메소드
		Object[] t = new Object[newSize];// newSize 크기의 새로운 배열 t 생성
		for(int i=0; i<size(); i++)
			t[i] = s[i];	// 배열 s를 배열 t로 복사
		s = (E[]) t;		// 배열 t를 배열 s로 이동
	}
	
	public void print() {	// 배열을 출력하는 print 메소드
		for(int i =0; i< size(); i++) {
			System.out.print(s[i]+"\t");
		}
		System.out.println();	// 출력이 끝나면 줄바꿈
	}
}
