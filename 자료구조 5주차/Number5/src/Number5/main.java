package Number5;

public class main {
	public static void main(String [] args) {
		SList<Integer> sl = new SList<Integer>();	// 연결 리스트 객체 t 생성
		
		System.out.println("[Task 1]");	// Task 1번
		sl.insertFront(5);
		sl.insertFront(4);
		sl.insertFront(3);
		sl.insertFront(2);
		sl.insertFront(1);	// 1-2-3-4-5 순으로 저장
		sl.print();			// 출력
		System.out.println();
		System.out.println("[Task 2]");// Task 2번
		sl.reverse();		// 역방향으로 저장
		sl.print();			// 출력
	}
}
