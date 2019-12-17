package Number7;

public class main {
	public static void main(String [] args) {
		CList<Integer> cl1 = new CList<Integer>();// 연결리스트 객체 s 생성
		System.out.println("[Task 1]");	// Task 1번
		cl1.insert(4);
		cl1.insert(3);		// 1-2-3-4 저장
		cl1.insert(2);
		cl1.insert(1);
		cl1.print();		// 출력
		System.out.println();

		CList<Integer> cl2 = new CList<Integer>();// 연결리스트 객체 s 생성
		cl2.insert(4);
		cl2.insert(3);	// 1-2-3-4 저장
		cl2.insert(2);
		cl2.insert(1);
		cl2.print();
		System.out.println();
		
		// Task 2
		cl1.rotateLeft(1);		// 각각 1만큼 회전
		cl2.rotateRight(1);	
		
		System.out.println("[Task 3]");	// Task 3번
		cl1.print();			// 각각 회전한 결과 출력
		System.out.println();
		cl2.print();	
	}
}
