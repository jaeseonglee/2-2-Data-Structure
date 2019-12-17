
public class Q10 {

	public static void main(String[] args) {
		String A1 = "11", A2 = "1";
		String B1 = "1010", B2 = "1011";
		
		String sumA = addBinary(A1, A2);
		System.out.println(A1 + " + " + A2 + " = " + sumA);
		
		String sumB = addBinary(B1, B2);
		System.out.println(B1 + " + " + B2 + " = " + sumB);
	}
	public static String addBinary(String s1, String s2) {
		/*
		 * 두개의 문자열이 입력으로 주어지는데, 각 문자열은 이진수를 나타내고 있다.
		 * 두개의 이진수를 더한 결과를 String 으로 리턴하는 메소드를 구현하세요.
		 * 예) 입력 String : s1 = "11", s2 = "1" 
		 *     => 출력 String : "100" 
		 * 예) 입력 String : s1 = "1010", s2 = "1000"
		 *     => 출력 String : "10101" 
		 */
		
		
		/* 여기에 들어갈 코드를 작성하세요 */
		  
		if( s1.length() > s2.length()) {
			for(int i = s2.length() -1; i >=0; i--) {
				if(s2.charat(i) == (char)49 )
			}
		}
		
	}

}
