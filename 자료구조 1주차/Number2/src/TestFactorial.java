/**Q4 : TestFactorial.java
 * �ۼ��� : 2019.08.29~30
 * �ۼ��� : 20165153 ���缺
 * ���α׷� ���� : Ű����κ��� ����(�ڿ���)�� �Է¹޾� ���ڱ����� ���丮���� ����ϴ�  ���α׷�
 * 		- FactorialRecursive.java�� ����Լ����¸� ����Ͽ� ���
 * 		- FactorialLoop.java�� �ݺ�����(for)�� ����Ͽ� ���
 */
import java.util.*;					// Scanner ����� ���� ���̺귯��
public class TestFactorial {		// Ű����κ��� ���ڸ� �Է¹޾� ���丮���� ����ϴ� TestFactorial Ŭ����
	public static void main(String[] args) {		// main �޼ҵ�
		FactorialRecursive rec = new FactorialRecursive();   
		FactorialLoop loop = new FactorialLoop();  	
		// FactorialRecursive�� FactorialLoop ��ü ����
		
		Scanner in = new Scanner(System.in); // Scanner ���� ���� �� int�� ���� num�� 0���� �ʱ�ȭ
		int num = 0;
		
		System.out.println("���丮�� ���(�ʹ� ū ���ڸ� �Է��ϸ� �����÷ΰ�  �߻��ϴ� ����!)" );
		System.out.print("1 �̻��� ���ڸ� �Է����ּ��� : ");
		num = in.nextInt();			// Ű����κ��� ����(����)�� �Է¹޴´�.
		
		if(num <0) {		// �Է¹��� ���� 0���� ������  
			System.out.println("�߸��� ���� �Է����� ���� ����"); // �����Ѵٰ� ����ϰ� ����
		} else {
			System.out.println("����Լ��� ���� ��� : " + rec.calculate(num));
			System.out.println("�ݺ���� ���� ��� : " + loop.calculate(num));
			// 1�̻��� ������ �ԷµǾ����� ������ ��ü�� ���� ���丮�� ��� ���
		}
		
	}
}
