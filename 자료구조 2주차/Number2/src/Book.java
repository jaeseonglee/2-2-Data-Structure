import java.util.*;

public class Book implements Comparable<Book> {	//도서정보를 저장하기 위한 Book 클래스
	
	// Comparator를 통해 각각의 기준으로 객체를 비교하는 클래스의 객체 생성
	public static final Comparator<Book> WithName = new WithName();
	public static final Comparator<Book> WithSerial = new WithSerial();
	public static final Comparator<Book> WithDate = new WithDate();
	
	private String title;		// 도서명
	private int serial;			// 책의 고유 번호
	private int year;			// 출간 년도,월,일 
	private int month;
	private int day;
	 
	public Book (String title, int serial, int year, int month, int day ) {//Book의 생성자
		this.title = title;
		this.serial = serial;
		this.month= month;
		this.year = year;
		this.day = day;	
	}
	
	public String getTitle() {return title; }		// 변수들의 각각의 getter 메소드 지정
	public int getSerial() {return serial; }
	public int getMonth() {return month; }
	public int getYear() {return year; }
	public int getDay() {return day; }
	
	@Override		// compareTo 메소드를 선언 및 초기화 해준다.
	public int compareTo(Book b) {	// 아무 기준이 없다면 이름으로 정렬해주기 때문에
		return this.getTitle().compareTo(b.getTitle());	// getTitle을 이용해서 이름으로 정렬해준다.
	}
}

