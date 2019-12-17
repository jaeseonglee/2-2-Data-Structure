package Number7;

public class RehashChainingTest {
	public static void main(String [] args) {
		System.out.println("[Task 1]");
		Chaining<Integer, Integer> ch = new Chaining<Integer, Integer>();
		for(int i=0;i<20;i++) ch.put(i,i);
		ch.print();
		
		System.out.println("[Task 2]");
		for(int i=0;i<20;i++) ch.delete(i);
		ch.print();
	}
}
