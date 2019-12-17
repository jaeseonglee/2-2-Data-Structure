import java.util.*;

public class Book implements Comparable<Book> {	//���������� �����ϱ� ���� Book Ŭ����
	
	// Comparator�� ���� ������ �������� ��ü�� ���ϴ� Ŭ������ ��ü ����
	public static final Comparator<Book> WithName = new WithName();
	public static final Comparator<Book> WithSerial = new WithSerial();
	public static final Comparator<Book> WithDate = new WithDate();
	
	private String title;		// ������
	private int serial;			// å�� ���� ��ȣ
	private int year;			// �Ⱓ �⵵,��,�� 
	private int month;
	private int day;
	 
	public Book (String title, int serial, int year, int month, int day ) {//Book�� ������
		this.title = title;
		this.serial = serial;
		this.month= month;
		this.year = year;
		this.day = day;	
	}
	
	public String getTitle() {return title; }		// �������� ������ getter �޼ҵ� ����
	public int getSerial() {return serial; }
	public int getMonth() {return month; }
	public int getYear() {return year; }
	public int getDay() {return day; }
	
	@Override		// compareTo �޼ҵ带 ���� �� �ʱ�ȭ ���ش�.
	public int compareTo(Book b) {	// �ƹ� ������ ���ٸ� �̸����� �������ֱ� ������
		return this.getTitle().compareTo(b.getTitle());	// getTitle�� �̿��ؼ� �̸����� �������ش�.
	}
}

