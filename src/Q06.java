
public class Q06 {
	public static void main(String[] args) {
		String str1 = "abcba";
		String str2 = "tomato";

		if( isPalindrome(str1) ) System.out.println("str1�� ȸ���̴�.");
		else System.out.println("str1�� ȸ���� �ƴϴ�.");
		
		if( isPalindrome(str2) ) System.out.println("str2�� ȸ���̴�.");
		else System.out.println("str2�� ȸ���� �ƴϴ�.");
	}
	public static boolean isPalindrome(String s) {
		/*
		 * �־��� str1�� str2�� ȸ��(palindrome)������ �˻��ϴ� ���α׷�
		 * ȸ���� ���ʿ������� �������� �����ʿ������� �������� ���� ���� ���� ���Ѵ�.
		 * ���� ���, 
		 * aba�� ȸ���̴�. ���ʿ������� ������ aba�̰�, �����ʿ������� �о aba�̴�.
		 * abc�� ȸ���� �ƴϴ�. ���ʿ������� ������ abc�̰�, �����ʿ������� ������ cba�̴�.
		 */
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		for(int i = 0; i < s.length() / 2; i++) {
			if(s.charat(i) != s.charAt(s.length() - i -1) ) {
				return false;
			}
		}
		
		
		return true;
		
		
		
	}
	

}
