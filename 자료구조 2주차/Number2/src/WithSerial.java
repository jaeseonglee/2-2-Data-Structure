import java.util.*;

public class WithSerial implements Comparator<Book> {//고유 번호를 기준으로 하는 WithSerial 클래스
	public int compare(Book b1, Book b2) {			// 마찬가지로 Comparator와 compare메소드,
		return b1.getSerial() - b2.getSerial();		// getSerial을 통해 객체를 비교한다.
	}
}
