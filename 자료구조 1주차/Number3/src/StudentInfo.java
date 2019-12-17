
public class StudentInfo extends PersonInfo {//StudentInfo를 상속받는 StudentInfo 클래스
	private String deptName;	// 추가적으로 멤버변수 2개를 더 갖는다.
	private int stuID;			
	
	public StudentInfo (String name, int ID,String deptName, int stuID) {	// StudentInfo 생성자
		super(name,ID);				//super를 이용해 부모클래스의 생성자를 명시적으로 호출해준다.
		this.deptName = deptName;
		this.stuID = stuID;
	}
	
	public void printStudentInfo() { 	// printPersonInfo를 호출하는 printStudentInfo 메소드
		super.printPersonInfo();		// 부모클래스의 printPersonInfo 메소드를 호출해준다.
		System.out.println("학생 정보 출력");			// 학생 정보 출력
		System.out.println("부서명 : " + deptName);	// 각각 deptName과 stuID출력
		System.out.println("학생 ID : " + stuID);
		System.out.println();		// 출력이 끝나면 줄바꿈
	}
}
