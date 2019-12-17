package Number1;

public class LinearProbingTest {
	public static void main(String []args) {
		LinearProbing<Integer,String> lp  = new LinearProbing<Integer,String>();
		
		lp.put(25, "grape");	// 강의자료에서 주어진 대로 삽입
		lp.put(37, "apple");
		lp.put(18, "banana");
		lp.put(55, "cherry");
		lp.put(22, "mango");
		lp.put(35, "lime");
		lp.put(50, "orange");
		lp.put(63, "watermelon");
		
		System.out.println("탐색 결과:");	
		System.out.println("50의 data = " + lp.get(50));
		System.out.println("63의 data = " + lp.get(63));
		lp.print();
	}
}