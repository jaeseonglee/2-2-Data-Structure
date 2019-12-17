package Number4;

public class main {
	public static void main(String[] args) {
		ListQueue<Integer> queue = new ListQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.print();
		queue.reverse();
		queue.print();
	}
}
