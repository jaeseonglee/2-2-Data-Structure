
public class StudentInfo extends PersonInfo {//StudentInfo�� ��ӹ޴� StudentInfo Ŭ����
	private String deptName;	// �߰������� ������� 2���� �� ���´�.
	private int stuID;			
	
	public StudentInfo (String name, int ID,String deptName, int stuID) {	// StudentInfo ������
		super(name,ID);				//super�� �̿��� �θ�Ŭ������ �����ڸ� ��������� ȣ�����ش�.
		this.deptName = deptName;
		this.stuID = stuID;
	}
	
	public void printStudentInfo() { 	// printPersonInfo�� ȣ���ϴ� printStudentInfo �޼ҵ�
		super.printPersonInfo();		// �θ�Ŭ������ printPersonInfo �޼ҵ带 ȣ�����ش�.
		System.out.println("�л� ���� ���");			// �л� ���� ���
		System.out.println("�μ��� : " + deptName);	// ���� deptName�� stuID���
		System.out.println("�л� ID : " + stuID);
		System.out.println();		// ����� ������ �ٹٲ�
	}
}
