/**	Q2 : ArrListTest.java
 *  �ۼ��� : 2019.09.19 ~ 09.20
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ���� �迭�� �����ϴ� ���α׷� ���� ��Ʈ�� �״�� �����Ʊ� ������ �ڵ尡 ����.
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
		
		System.out.println("1��° �׸��� " + s.peek(1)+"�̴�.");System.out.println();
	}
}
