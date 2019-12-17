/**Q4 : TestFactorial.java
 * 작성일 : 2019.08.29~30
 * 작성자 : 20165153 이재성
 * 프로그램 설명 : 키보드로부터 숫자(자연수)를 입력받아 숫자까지의 팩토리얼을 계산하는  프로그램
 * 		- FactorialRecursive.java는 재귀함수형태를 사용하여 계산
 * 		- FactorialLoop.java는 반복제어(for)를 사용하여 계산
 */
import java.util.*;					// Scanner 사용을 위한 라이브러리
public class TestFactorial {		// 키보드로부터 숫자를 입력받아 팩토리얼을 출력하는 TestFactorial 클래스
	public static void main(String[] args) {		// main 메소드
		FactorialRecursive rec = new FactorialRecursive();   
		FactorialLoop loop = new FactorialLoop();  	
		// FactorialRecursive와 FactorialLoop 객체 생성
		
		Scanner in = new Scanner(System.in); // Scanner 변수 생성 및 int형 변수 num을 0으로 초기화
		int num = 0;
		
		System.out.println("팩토리얼 계산(너무 큰 숫자를 입력하면 오버플로가  발생하니 주의!)" );
		System.out.print("1 이상의 숫자를 입력해주세요 : ");
		num = in.nextInt();			// 키보드로부터 숫자(정수)를 입력받는다.
		
		if(num <0) {		// 입력받은 값이 0보다 작으면  
			System.out.println("잘못된 숫자 입력으로 인한 종료"); // 종료한다고 출력하고 종료
		} else {
			System.out.println("재귀함수를 통한 결과 : " + rec.calculate(num));
			System.out.println("반복제어를 통한 결과 : " + loop.calculate(num));
			// 1이상의 정수가 입력되었으면 각각의 객체를 통한 팩토리얼 결과 출력
		}
		
	}
}
