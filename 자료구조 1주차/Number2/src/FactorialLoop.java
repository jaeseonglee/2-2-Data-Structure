
public class FactorialLoop {		// 반복제어로 계산하는 FactorialLoop 클래스
	private long result = 1;		// 팩토리얼의 값이 기하급수적으로 커지므로  long 사용
	
	public long calculate(int num) {// 팩토리얼을 계산하는 calculate 메소드
		for(int i=1; i<=num; i++) { // for문을 통해 팩토리얼 값을 계산
			result *= i;		// 1부터 num까지 곱한 결과를 result에 저장
		}
		return result;		// result 반환
	}
	
}
