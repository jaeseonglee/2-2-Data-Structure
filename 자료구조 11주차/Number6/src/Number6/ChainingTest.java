package Number6;

public class ChainingTest {
	public static void main(String []args) {
		Chaining<Integer,String> c = new Chaining<Integer,String>();
		
		c.put(25, "grape");	
		c.put(37, "apple");
		c.put(18, "banana");
		c.put(55, "cherry");
		c.put(22, "mango");
		c.put(35, "lime");
		c.put(50, "orange");
		c.put(63, "watermelon");
		
		System.out.println("탐색 결과 :");	// 강의 자료와 같이 탐색 및 출력
		System.out.println("50의 data = " + c.get(50));
		System.out.println("63의 data = " + c.get(63));
		System.out.println("37의 data = " + c.get(37));
		System.out.println("22의 data = " + c.get(22));
		
		c.print();
	}
}
