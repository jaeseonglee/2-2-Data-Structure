package Number2;

public class LinearProbing2Test  {
	public static void main(String []args) {
		LinearProbing2<Integer,Integer> lp2  = new LinearProbing2<Integer,Integer>();
		
		lp2.put(25, 25);	// 1. Ű���� �����ϰ� �����͸� �����Ͽ� ����
		lp2.put(37, 37);
		lp2.put(18, 18);
		lp2.put(55, 55);
		lp2.put(22, 22);
		lp2.put(35, 35);
		lp2.put(50, 50);
		lp2.put(63, 63);
		lp2.print();		// 2. print �޼ҵ� ���
		
		System.out.println("\n63�� ��°�� : " + lp2.get(63) + "\n");	// 3. key���� 63�� �׸��� ã�� ���
		
		// 4. Ű ���� 50�� �׸� ����
		System.out.println("50�׸� ���� : " + lp2.delete(50));
		lp2.print();		// 5 . print �޼ҵ� ���
		
		// 6. key���� 63�� �׸��� ã�� ���
		System.out.println("\n63�� ��°�� : " + lp2.get(63));	
	}
}