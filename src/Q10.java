
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
		 * �ΰ��� ���ڿ��� �Է����� �־����µ�, �� ���ڿ��� �������� ��Ÿ���� �ִ�.
		 * �ΰ��� �������� ���� ����� String ���� �����ϴ� �޼ҵ带 �����ϼ���.
		 * ��) �Է� String : s1 = "11", s2 = "1" 
		 *     => ��� String : "100" 
		 * ��) �Է� String : s1 = "1010", s2 = "1000"
		 *     => ��� String : "10101" 
		 */
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		  
		if( s1.length() > s2.length()) {
			for(int i = s2.length() -1; i >=0; i--) {
				if(s2.charat(i) == (char)49 )
			}
		}
		
	}

}
