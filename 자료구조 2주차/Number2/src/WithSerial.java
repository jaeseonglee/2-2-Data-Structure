import java.util.*;

public class WithSerial implements Comparator<Book> {//���� ��ȣ�� �������� �ϴ� WithSerial Ŭ����
	public int compare(Book b1, Book b2) {			// ���������� Comparator�� compare�޼ҵ�,
		return b1.getSerial() - b2.getSerial();		// getSerial�� ���� ��ü�� ���Ѵ�.
	}
}
