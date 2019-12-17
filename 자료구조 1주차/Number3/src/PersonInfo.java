
public class PersonInfo {	// 멤버변수 2개를 갖는 PersonInfo 클래스 
	private String name;	// 이름을 저장하는 name 변수
	private int ID;			//ID를 저장하는 ID변수
	
	public PersonInfo (String name, int ID) {	// PersonInfo의 생성자
		this.name = name;
		this.ID = ID;
	}
	
	public void printPersonInfo() {	// name과 ID를 출력하는 printPersonInfo메소드
		System.out.println("사람 정보 출력");	// 정보출력
		System.out.println("이름 : " + name);	// 각각 name과 ID를 출력
		System.out.println("ID : " + ID);
		System.out.println();		// 출력이 끝나면 줄바꿈
	}
}
