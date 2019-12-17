package Number1;

public class GenDataTest {
	public static void main(String []args) {
		GenData gd1 = new GenData(); 
		//[Task 1]
		for(int i : gd1.getRandIntArr(5, 0, 10)) {
			System.out.print(i +" ");
		}
		//[Task 2]
		System.out.println();
		for(int i : gd1.getRandIntArr(5, 0, 100)) {
			System.out.print(i +" ");
		}
	}
}
