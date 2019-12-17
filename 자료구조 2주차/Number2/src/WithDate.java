import java.util.*;

public class WithDate implements Comparator<Book> {	// 출간일을 기준으로 하는 WithDate클래스
	public int compare(Book b1, Book b2) {			// 마찬가지로 Comparator와 compare메소드를 지정하고
		
		if(b1.getYear() == b2.getYear()) {			// 1.출간년도가 같다면의 조건문
			if (b1.getMonth() == b2.getMonth()) {	// 2.출간월이 같다면의 조건문
				return b1.getDay() - b2.getDay();	// 1,2에 전부 해당하면 출간일까지 비교해준다.
			} else {
				return b1.getMonth() - b2.getMonth(); // 1에만 해당한다면 출간월을 비교해준다.
			}
		} else {
			return b1.getYear() - b2.getYear();		// 출간년도가 같지 않다면 바로 출간연도를 비교해준다.
		}
		
	}
}
