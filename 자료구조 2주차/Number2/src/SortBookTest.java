/**	Q3 : ArrayProgram.java
 *  작성일 : 2019.09.05~06
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 도서관의 책의 정보를 각각의 기준으로 정렬하는 프로그램			
 */

import java.util.*;

public class SortBookTest {		// 도서관을 책들을 각각의 기준으로 정렬하는 SortBookTest 클래스
	public static void main(String[] args) {		// main 메소드
		Book[] b = {			// 객체의 배열로 7권의 책을 만들어준다.
				new Book("한림대학교\t",	1,	2010,3, 15),
				new Book("IT 기술\t",	2,	2018,8, 11),
				new Book("자바 프로그래밍",	3,	2011,1, 11),
				new Book("C 프로그래밍",	4,	1999,12,18),
				new Book("인공지능\t",	5,	2019,2, 22),
				new Book("기계학습\t",	6,	2015,9, 30),
				new Book("인간의 미래",	7,	2017,5, 21)};	
				// 일부가 수평탭(\t)이 붙은 이유는 출력시 깔끔하게 보이기 위해서. 
		
		Arrays.sort(b);					// 1번 : 객체 배열을 아무 기준없이 정렬 (이름순)	
		print(b, "기준 없음");				// 그에 따라 print메소드를 통해 출력해준다.
		
		Arrays.sort(b, Book.WithName);	// 2번 : 도서명을 기준으로 정렬
		print(b,"도서명");				
		
		Arrays.sort(b,Book.WithSerial);	// 3번 : 고유번호를 기준으로 정렬
		print(b,"고유 번호");
		
		Arrays.sort(b, Book.WithDate);	// 4번 : 출간일을 기준으로 정렬
		print(b,"출간일");				// 각각의 기준에 따라 출력해준다.
	}
	
	
	public static void print(Book[] b, String key) {// 도서정보를 출력하는 print 메소드
													// 객체 배열과 문자열을 매개변수로 갖는다
		System.out.println();
		System.out.println("\t"+key+"(으)로 정렬");		// 문자열에 따라 어떤 기준으로 정렬하는지 출력 
		System.out.println("\t도서명\t고유 번호\t출간(년)\t출간(월) 출간(일)");	
		System.out.println("----------------------------------------------");
		
		for(Book temp : b) {				// for-each 구문을 통해 도서 정보를 기준에 따라 출력
			System.out.println(temp.getTitle()+"\t"+temp.getSerial()+"\t"+temp.getYear()
								+"\t" + temp.getMonth() +"\t"+ temp.getDay());
		}	// 각각의 정보들을 각각의 변수에 맞는 getter를 통해 호출해서 출력한다.
	}
}