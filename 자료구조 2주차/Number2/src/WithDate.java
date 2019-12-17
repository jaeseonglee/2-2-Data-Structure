import java.util.*;

public class WithDate implements Comparator<Book> {	// �Ⱓ���� �������� �ϴ� WithDateŬ����
	public int compare(Book b1, Book b2) {			// ���������� Comparator�� compare�޼ҵ带 �����ϰ�
		
		if(b1.getYear() == b2.getYear()) {			// 1.�Ⱓ�⵵�� ���ٸ��� ���ǹ�
			if (b1.getMonth() == b2.getMonth()) {	// 2.�Ⱓ���� ���ٸ��� ���ǹ�
				return b1.getDay() - b2.getDay();	// 1,2�� ���� �ش��ϸ� �Ⱓ�ϱ��� �����ش�.
			} else {
				return b1.getMonth() - b2.getMonth(); // 1���� �ش��Ѵٸ� �Ⱓ���� �����ش�.
			}
		} else {
			return b1.getYear() - b2.getYear();		// �Ⱓ�⵵�� ���� �ʴٸ� �ٷ� �Ⱓ������ �����ش�.
		}
		
	}
}
