
public class Q11 {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 71;
	
		if( isPrime(num1) ) System.out.println(num1 + " 은/는 소수다.");
		else System.out.println(num1 + " 은/는 소수가 아니다.");
		
		if( isPrime(num2) ) System.out.println(num2 + " 은/는 소수다.");
		else System.out.println(num2 + " 은/는 소수가 아니다.");	
		
	}
	public static boolean isPrime(int n) {
		/*
		 * 입력으로 정수형 숫자가 주어지면, 그 숫자가 소수인지 아닌지를
		 * boolean 으로 리턴하는 메소드.
		 * 예: 2는 소수, 3은 소수, 4는 소수 아님, 5는 소수, 6은 소수 아님...
		 * 참고로, 소수란 '1과 자기 자신으로밖에 나누어 떨어지지 않는 수이다"
		 */
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
		/* 여기에 들어갈 코드를 작성하세요 */
		
		
		
	}

}
