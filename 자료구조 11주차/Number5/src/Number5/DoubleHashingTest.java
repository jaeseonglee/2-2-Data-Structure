package Number5;

public class DoubleHashingTest {
	public static void main(String []args) {
		DoubleHashing<Integer,String> dh  = new DoubleHashing<Integer,String>();
		
		dh.put(25, "grape");
		dh.put(37, "apple");
		dh.put(18, "banana");
		dh.put(55, "cherry");
		dh.put(22, "mango");
		dh.put(35, "lime");
		dh.put(50, "orange");
		dh.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = " + dh.get(50));
		System.out.println("63의 data = " + dh.get(63));
		dh.print();
	}
}
