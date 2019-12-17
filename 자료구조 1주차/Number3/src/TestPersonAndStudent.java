/**Q5 : TestPersonAndStudent.java
 * 작성일 : 2019.08.29~30
 * 작성자 : 20165153 이재성
 * 프로그램 설명 : PersonInfo와 StudentInfo 두개의 클래스를 통한 상속의 개념을 다시 짚고,
 * 			TestPersonAndStudent에서의 객체와 생성자를 통해 각각의 정보를 출력하는 프로그램
 */
public class TestPersonAndStudent {				// TestPersonAndStudent클래스를 통해서 두 클래스 호출
	public static void main (String[] args) {	// main 메소드
		// 두 개의 클래스에 대한 객체 생성 및 각각의 생성자에 맞는 자료형으로 저장
		PersonInfo person = new PersonInfo("홍길동",2019);
		StudentInfo student = new StudentInfo("이재성",2016,"빅데이터전공",20165153);
		
		// 각각의 클래스의 출력 메소드를 호출 하여 정보 출력
		person.printPersonInfo();
		student.printStudentInfo();
	}
}
