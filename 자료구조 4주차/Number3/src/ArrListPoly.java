import java.util.*;
public class ArrListPoly  {	//ArrList를 기반으로 클래스를 구현?
	private int [] a;		// 배열 생성
	private int size;		// 항목 수 
	ArrListPoly() {		// 생성자
		a = new int[1];	// 1개의 값을 갖는 배열로 저장
		size = 0;		//0으로 초기화
	}
	ArrListPoly (int [] arr) {	// 배열을 매개변수로 가지면 
		this.a = arr;		// 그 배열로 초기화
		size = a.length;	// 그 배열의 길이로 초기화
	}
	public void setPoly(int k, int [] arr) {	// 최고 차수 k와 차수들의 값을 갖는 배열을 배개변수로 갖는다
		size = k+1;	// 항목수는 최고 차수에서 하나 더한 값으로 초기화
		a= arr;		
	}
	
	public ArrListPoly sumPoly(ArrListPoly p) {	// 두객체가 갖는 배열을 더하는 sumPoly함수
		if(p.a.length > a.length) {		// 매개변수로서의 객체의 배열이 더 길면 
			for(int i=0; i<a.length; i++) {	// 차수가 더 낮은 배열을 큰 배열에 더해주는 반복문
				p.a[i] += a[i];		// 두 객체의 배열에 대한 각각의 인덱스 값을 더해준다
			}
			return p;		// 더해진 객체 반환
		} else
			for(int i=0; i<p.a.length; i++) {
				a[i] += p.a[i];		// 위와 같은 구조이지만
			}
			return new ArrListPoly(a);	// 매개변수가 아닌 객체를 반환을 위해 생성자를 이용한다.
	}
	
	public int getHighestDegree() {	return size-1;}	// 가장 높은 차수를 반환하는 메소드
	
	public int peek(int k) {	
		if(size==0 || k>= size)	// size 의 값이 0이거나 매개변수 k가 찾는 위치가 size보다 크면 
			throw new NoSuchElementException();	// 예외 발생
		return a[k];
	}

}	