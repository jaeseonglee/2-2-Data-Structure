package Number2;

public class LinearProbing2Test  {
	public static void main(String []args) {
		LinearProbing2<Integer,Integer> lp2  = new LinearProbing2<Integer,Integer>();
		
		lp2.put(25, 25);	// 1. 키값과 동일하게 데이터를 변경하여 저장
		lp2.put(37, 37);
		lp2.put(18, 18);
		lp2.put(55, 55);
		lp2.put(22, 22);
		lp2.put(35, 35);
		lp2.put(50, 50);
		lp2.put(63, 63);
		lp2.print();		// 2. print 메소드 출력
		
		System.out.println("\n63의 출력결과 : " + lp2.get(63) + "\n");	// 3. key값이 63인 항목을 찾아 출력
		
		// 4. 키 값이 50인 항목 삭제
		System.out.println("50항목 삭제 : " + lp2.delete(50));
		lp2.print();		// 5 . print 메소드 출력
		
		// 6. key값이 63인 항목을 찾아 출력
		System.out.println("\n63의 출력결과 : " + lp2.get(63));	
	}
}