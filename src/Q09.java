
public class Q09 {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "I am dreaming of a white Christmas";
		
		System.out.println(str1 + " : " + lastWorldLength(str1));
		System.out.println(str2 + " : " + lastWorldLength(str2));
	}
	public static int lastWordLength(String s) {
		/*
		 * �Է����� String s ���ڿ��� �־�����.
		 * ���ڿ� s�� ���� �빮��, �ҹ���, �������� �����ȴ�.
		 * ���� ������ �ܾ��� ���̸� �����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ��) �Է��� "Nice to meet you"�̸�, ����� 3�̴�.
		 *    �ֳ��ϸ�, ���� ������ �ܾ�� "you"�̰�, "you"�� ���̴� 3�̴ϱ�.
		 * ��) �Է��� "Hello"�̸�, ����� 5�̴�.
		 *    �ֳ��ϸ�, "Hello"�� ó������ ������ �ܾ��̱� �����̴�.
		 *    "Hello" �ܾ��� ���̴� 5
		 * ��) �Է��� "Hello World"�̸�, ����� 5�̴�.
		 *    �ֳ��ϸ�, ������ �ܾ�� "World"�̰�, �� ���̴� 5�ϱ�.
		 */
		
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		int cnt = 0;
		for(int i = 0; i< s.length(); i++) {
			cnt++;
			if(s.contains(i) == ' ') {
				cnt = 0;
			}
			
		}
		return cnt;
		
	}
}
