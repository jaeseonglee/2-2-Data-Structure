
public class Q11 {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 71;
	
		if( isPrime(num1) ) System.out.println(num1 + " ��/�� �Ҽ���.");
		else System.out.println(num1 + " ��/�� �Ҽ��� �ƴϴ�.");
		
		if( isPrime(num2) ) System.out.println(num2 + " ��/�� �Ҽ���.");
		else System.out.println(num2 + " ��/�� �Ҽ��� �ƴϴ�.");	
		
	}
	public static boolean isPrime(int n) {
		/*
		 * �Է����� ������ ���ڰ� �־�����, �� ���ڰ� �Ҽ����� �ƴ�����
		 * boolean ���� �����ϴ� �޼ҵ�.
		 * ��: 2�� �Ҽ�, 3�� �Ҽ�, 4�� �Ҽ� �ƴ�, 5�� �Ҽ�, 6�� �Ҽ� �ƴ�...
		 * �����, �Ҽ��� '1�� �ڱ� �ڽ����ιۿ� ������ �������� �ʴ� ���̴�"
		 */
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		
		
		
	}

}
