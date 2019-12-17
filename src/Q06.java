
public class Q06 {
	public static void main(String[] args) {
		String str1 = "abcba";
		String str2 = "tomato";

		if( isPalindrome(str1) ) System.out.println("str1은 회문이다.");
		else System.out.println("str1은 회문이 아니다.");
		
		if( isPalindrome(str2) ) System.out.println("str2는 회문이다.");
		else System.out.println("str2는 회문이 아니다.");
	}
	public static boolean isPalindrome(String s) {
		/*
		 * 주어진 str1과 str2가 회문(palindrome)인지를 검사하는 프로그램
		 * 회문은 왼쪽에서부터 읽을때와 오른쪽에서부터 읽을때가 서로 같은 것을 말한다.
		 * 예를 들어, 
		 * aba는 회문이다. 왼쪽에서부터 읽으면 aba이고, 오른쪽에서부터 읽어도 aba이다.
		 * abc는 회문이 아니다. 왼쪽에서부터 읽으면 abc이고, 오른쪽에서부터 읽으면 cba이다.
		 */
		
		
		/* 여기에 들어갈 코드를 작성하세요 */
		for(int i = 0; i < s.length() / 2; i++) {
			if(s.charat(i) != s.charAt(s.length() - i -1) ) {
				return false;
			}
		}
		
		
		return true;
		
		
		
	}
	

}
