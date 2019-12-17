import java.util.*;

public class WithName implements Comparator<Book> {		// 이름을 기준으로 하는 WithName 클래스
	public int compare(Book b1, Book b2) {				// Comparator와 compare메소드,
		return b1.getTitle().compareTo(b2.getTitle());	// getTitle을 통해 객체를 비교한다.
	}
}
