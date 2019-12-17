package Number4;

public class main {
	public static void main(String[] args) {
		
		System.out.println("[Task 1]");
		SList<Integer> SList1 = new SList<Integer>();	// 연결 리스트 객체 SList1 생성
		int [] arr1 = {7,11,4,1,8};
		SList1.setAndOrderNodes(arr1);
		SList1.print();
		
		
		System.out.println("[Task 2]");
		SList<Integer> SList2 = new SList<Integer>();	// 연결 리스트 객체 SList2 생성
		int [] arr2 = {5,2,8,7,13};
		SList2.setAndOrderNodes( arr2 );
		SList2.print();
		
		System.out.println("[Task 3]");
		SList1.join(SList2);
		SList1.print();
	}
}
