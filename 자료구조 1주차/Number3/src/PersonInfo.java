
public class PersonInfo {	// ������� 2���� ���� PersonInfo Ŭ���� 
	private String name;	// �̸��� �����ϴ� name ����
	private int ID;			//ID�� �����ϴ� ID����
	
	public PersonInfo (String name, int ID) {	// PersonInfo�� ������
		this.name = name;
		this.ID = ID;
	}
	
	public void printPersonInfo() {	// name�� ID�� ����ϴ� printPersonInfo�޼ҵ�
		System.out.println("��� ���� ���");	// �������
		System.out.println("�̸� : " + name);	// ���� name�� ID�� ���
		System.out.println("ID : " + ID);
		System.out.println();		// ����� ������ �ٹٲ�
	}
}
