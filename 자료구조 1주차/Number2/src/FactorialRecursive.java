
public class FactorialRecursive {		// 재귀함수로 계산하는 FactorialRecursive 클래스
										// 팩토리얼의 값이 기하급수적으로 커지므로  long 사용
	public long calculate(int num) {	// 팩토리얼을 계산하는 calculate 메소드
		if(num <= 1 ) {			// 재귀함수의 종료조건으로 매개변수가 1이하면 1를 반환
			return 1;		
		}
		return num * calculate(num-1);	// 자기자신을 반환함으로써 팩토리얼을 계산	
	}
	
}
