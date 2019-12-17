package Number4;

public class RandProbingTest {
	public static void main(String []args) {
		RandProbing<Integer,String> rp  = new RandProbing<Integer,String>();
		
		rp.put(25, "grape");
		rp.put(37, "apple");
		rp.put(18, "banana");
		rp.put(55, "cherry");
		rp.put(22, "mango");
		rp.put(35, "lime");
		rp.put(50, "orange");
		rp.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = " + rp.get(50));
		System.out.println("63의 data = " + rp.get(63));
		
		rp.print();
	}
}
