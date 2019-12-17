package Number6;

public class main {
	public static void main(String[] args) {
		
		System.out.println("[Task 1]");	// Task 1번
		DList<Integer> dl1 = new DList<Integer>();	// 객체 생성
		dl1.insertAfter(dl1.head, 1);	// 1-2-3 저장
		dl1.insertBefore(dl1.tail, 2);
		dl1.insertBefore(dl1.tail, 3);
		dl1.print();		// 출력
		
		System.out.println("[Task 2]");	// Task 2번
		DList<Integer> dl2 = new DList<Integer>();	// 객체 생성
		dl2.insertAfter(dl2.head, 6);	//6-7-8-9 저장
		dl2.insertBefore(dl2.tail, 7);
		dl2.insertBefore(dl2.tail, 8);
		dl2.insertBefore(dl2.tail, 9);
		dl2.print();		// 출력
		
		System.out.println("[Task 3]");	// Task 3번
		int add1 = dl1.add(dl2);		// 두 정수형 변수에 각각 값을 저장
		int add2 = dl2.add(dl1);		// 결과가 같은지 확인
		System.out.println("add1 출력 결과 : "+add1+"\nadd2 출력 결과 : " + add2);
	}
}