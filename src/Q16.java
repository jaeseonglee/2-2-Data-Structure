
public class Q16 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.printf("(before) num1 = %d, num2 = %d\n", num1, num2);
		
		/*
		 * num1과 num2를 서로 교환하는 코드 작성
		 * 단, 임시변수를 사용할 수 없음. 
		 * 즉, num1, num2 이외의 다른 변수 사용 불가
		 */
		
		
		
		/* 여기에 들어갈 코드를 작성하세요 */
		
		num1 = num1 + num2; 
		num2 = num2 - num1; 
		num2 = -num2;		
		num1 = num1 -num2;
		
		
		
		System.out.printf("(after) num1 = %d, num2 = %d\n", num1, num2);
	}
}
