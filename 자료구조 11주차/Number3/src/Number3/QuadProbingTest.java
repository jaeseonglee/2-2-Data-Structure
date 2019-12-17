package Number3;

public class QuadProbingTest {
	public static void main(String[]args) {
		QuadProbing<Integer,String> qp = new QuadProbing<Integer,String>();
		
		qp.put(25, "grape");
		qp.put(37, "apple");
		qp.put(18, "banana");
		qp.put(55, "cherry");
		qp.put(22, "mango");
		qp.put(35, "lime");
		qp.put(50, "orange");
		qp.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = " + qp.get(50));
		System.out.println("63의 data = " + qp.get(63));
	
		qp.print();
	}
}
