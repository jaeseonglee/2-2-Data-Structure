package Number6;

public class main {
	public static void main( String []args) {
		ListStack<Double> stack = new ListStack<Double>();		// �Ǽ�Ÿ������ ��ü����
		
		//String arr[] = {"81", "37", "-211", "+"," 15", "-", "/"}; 
		//System.out.printf("%.3f",   stack.calc(arr)); // �Ǽ��� ��ȯ�ϴ� calc�޼ҵ�, 3�ڸ����� ������ش�.
		
		// task 2�� ��� �����ڰ� 2���ε� ���� 2���� ���Ƿ� �� �ϳ� �߰��Ͽ� ���
		String arr2[] = {"20.5", "10.2", "+", "10.0", "*"}; 
		System.out.printf("%.3f",   stack.calc(arr2));
	}
}
