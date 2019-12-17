/**	Q2 : ArrListTest.java
 *  작성일 : 2019.09.19 ~ 09.20
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 동적 배열을 구현하는 프로그램 강의 노트를 그대로 따라쳤기 때문에 코드가 같다.
 */
public class ArrListTest {
	public static void main(String [] args) {
		ArrList<String> s = new ArrList<String>();
		s.insert("apple");		s.print();		s.insert("orange");		s.print();
		s.insert("cherry");		s.print();		s.insert("pear");		s.print();
		s.insert("grape",1);	s.print();		s.insert("lemon",4);	s.print();
		s.insert("kiwi");		s.print();
		s.delete(4);			s.print(); 		s.delete(0); 			s.print();
		s.delete(0);			s.print(); 		s.delete(3); 			s.print();
		s.delete(0);			s.print();
		
		System.out.println("1번째 항목은 " + s.peek(1)+"이다.");System.out.println();
	}
}
