/**Q5 : TestPersonAndStudent.java
 * �ۼ��� : 2019.08.29~30
 * �ۼ��� : 20165153 ���缺
 * ���α׷� ���� : PersonInfo�� StudentInfo �ΰ��� Ŭ������ ���� ����� ������ �ٽ� ¤��,
 * 			TestPersonAndStudent������ ��ü�� �����ڸ� ���� ������ ������ ����ϴ� ���α׷�
 */
public class TestPersonAndStudent {				// TestPersonAndStudentŬ������ ���ؼ� �� Ŭ���� ȣ��
	public static void main (String[] args) {	// main �޼ҵ�
		// �� ���� Ŭ������ ���� ��ü ���� �� ������ �����ڿ� �´� �ڷ������� ����
		PersonInfo person = new PersonInfo("ȫ�浿",2019);
		StudentInfo student = new StudentInfo("���缺",2016,"����������",20165153);
		
		// ������ Ŭ������ ��� �޼ҵ带 ȣ�� �Ͽ� ���� ���
		person.printPersonInfo();
		student.printStudentInfo();
	}
}
