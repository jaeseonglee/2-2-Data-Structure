package Number1;

public class LinearProbingTest {
	public static void main(String []args) {
		LinearProbing<Integer,String> lp  = new LinearProbing<Integer,String>();
		
		lp.put(25, "grape");	// �����ڷῡ�� �־��� ��� ����
		lp.put(37, "apple");
		lp.put(18, "banana");
		lp.put(55, "cherry");
		lp.put(22, "mango");
		lp.put(35, "lime");
		lp.put(50, "orange");
		lp.put(63, "watermelon");
		
		System.out.println("Ž�� ���:");	
		System.out.println("50�� data = " + lp.get(50));
		System.out.println("63�� data = " + lp.get(63));
		lp.print();
	}
}