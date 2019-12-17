
public class Q12 {
	public static void main(String[] args) {
		int n1 = 10; 
		int n2 = 15;
		int n3 = 33;
		
		System.out.println(n1 + ": " + numOneBits(n1));
		System.out.println(n2 + ": " + numOneBits(n2));
		System.out.println(n3 + ": " + numOneBits(n3));
	}
	public static int numOneBits(int n) {
		/*
		 * 입력: 정수 n이 주어진다.
		 * 출력: 정수 n을 2진법으로 표현하기 위해 필요한 1의 갯수
		 * 예:
		 * - 입력 : 1 => 출력 1 (10진수 1 => 2진수 1)
		 * - 입력 : 2 => 출력 1 (10진수 2 => 2진수 10)
		 * - 입력 : 3 => 출력 2 (10진수 3 => 2진수 11)
		 * - 입력 : 4 => 출력 1 (10진수 4 => 2진수 100)
		 * - 입력 : 5 => 출력 2 (10진수 5 => 2진수 101)
		 * 2진수로 변환했을 때, 1이 몇개 사용되는지를 카운트
		 */
		int num = n;
		int cnt = 0;
		if(num == 1) return 1;
		while(num < 2 ) {
			if ( num / 2 >= 1) cnt++;
			num = num / 2;
		}
		
		
		/* 여기에 들어갈 코드를 작성하세요 */
		
		
		
	}
}
