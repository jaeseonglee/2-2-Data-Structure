import java.util.*;

public class WithName implements Comparator<Book> {		// �̸��� �������� �ϴ� WithName Ŭ����
	public int compare(Book b1, Book b2) {				// Comparator�� compare�޼ҵ�,
		return b1.getTitle().compareTo(b2.getTitle());	// getTitle�� ���� ��ü�� ���Ѵ�.
	}
}
