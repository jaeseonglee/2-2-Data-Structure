/**	Q3 : ArrListPolyTest.java
 *  작성일 : 2019.09.19 ~ 09.21
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : ArrList를 확장하여 ArrListPoly를 구현하는 프로그램
 * 			main 함수는 pdf 32p에 있는 코드와 동일하게 코딩해야한다. - 제네릭 타입이 없음.
 *
 *			애초에 ArrList가 아니라 배열로 코딩을 한다?
 *   		배열의 동적 할당을 하려고 ArrList클래스에서는 제네릭 타입을 쓴것 같은데
 * 			이 main함수에서는 제네릭 타입이 없다.
 * 			그러면 setPoly함수를 통해 배열을 새로 저장하는 방향으로 코딩
 * 			그게 아니라면 배열의 크기를 하나씩 확장하는 방법? 으로 코딩	
 */
public class ArrListPolyTest {
	public static void main(String[] args) {
		ArrListPoly p1 = new ArrListPoly();
		// {9,0,-3,0,5} = 9 x0 + 0 x1 + -3 x2 + 0 x3 +5 x4
		int[] poly1 = {9,0,-3,0,5};
		int p1highestDegree = poly1.length-1;
		p1.setPoly(p1highestDegree,poly1);
		printPolyEq(p1,1);	// 다항식 출력전에 출력할 탭 수 = 1
		
		ArrListPoly p2 = new ArrListPoly();
		// {2,0,4} = 2 x0 + 0 x1 + 4 x2
		int[] poly2 = {2,0,4};
		int p2highestDegree = poly2.length-1;
		p2.setPoly(p2highestDegree,poly2);
		printPolyEq(p2,3);	// 다항식 출력전에 출력할 탭 수 = 3
		
		ArrListPoly p3 = p1.sumPoly(p2);
		printPolyEq(p3,1);	// 다항식 출력전에 출력할 탭 수 = 1
		
	}
	
	public static void printPolyEq(ArrListPoly p,int nTabs) {
		for(int i =0; i< nTabs; i++) System.out.printf("\t");
		for(int i= p.getHighestDegree(); i >= 0; i--)
			System.out.printf("%+d x%d\t",p.peek(i), i);
		System.out.println();
	}
}
