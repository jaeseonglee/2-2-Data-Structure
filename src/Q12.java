
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
		 * �Է�: ���� n�� �־�����.
		 * ���: ���� n�� 2�������� ǥ���ϱ� ���� �ʿ��� 1�� ����
		 * ��:
		 * - �Է� : 1 => ��� 1 (10���� 1 => 2���� 1)
		 * - �Է� : 2 => ��� 1 (10���� 2 => 2���� 10)
		 * - �Է� : 3 => ��� 2 (10���� 3 => 2���� 11)
		 * - �Է� : 4 => ��� 1 (10���� 4 => 2���� 100)
		 * - �Է� : 5 => ��� 2 (10���� 5 => 2���� 101)
		 * 2������ ��ȯ���� ��, 1�� � ���Ǵ����� ī��Ʈ
		 */
		int num = n;
		int cnt = 0;
		if(num == 1) return 1;
		while(num < 2 ) {
			if ( num / 2 >= 1) cnt++;
			num = num / 2;
		}
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		
		
		
	}
}
