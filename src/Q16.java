
public class Q16 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.printf("(before) num1 = %d, num2 = %d\n", num1, num2);
		
		/*
		 * num1�� num2�� ���� ��ȯ�ϴ� �ڵ� �ۼ�
		 * ��, �ӽú����� ����� �� ����. 
		 * ��, num1, num2 �̿��� �ٸ� ���� ��� �Ұ�
		 */
		
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		
		num1 = num1 + num2; 
		num2 = num2 - num1; 
		num2 = -num2;		
		num1 = num1 -num2;
		
		
		
		System.out.printf("(after) num1 = %d, num2 = %d\n", num1, num2);
	}
}
