package Number3;
public class main {
	public static void main(String[] args) {
		ListQueue<Integer> queue = new ListQueue<Integer>();	// 정수형으로 객체 생성
		queue.add(1);
		queue.add(3);		// 1 3 2 4 5 순서로 값을 넣어주고
		queue.add(2);
		queue.add(4);
		queue.add(5);
		queue.print();		// 큐을 출력
		System.out.println("평균 : "+queue.avg()); // 평균을 출력해주고 
		queue.print();		// 다시 큐를 출력
	}
}
