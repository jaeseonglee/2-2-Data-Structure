
public class FactorialRecursive {		// ����Լ��� ����ϴ� FactorialRecursive Ŭ����
										// ���丮���� ���� ���ϱ޼������� Ŀ���Ƿ�  long ���
	public long calculate(int num) {	// ���丮���� ����ϴ� calculate �޼ҵ�
		if(num <= 1 ) {			// ����Լ��� ������������ �Ű������� 1���ϸ� 1�� ��ȯ
			return 1;		
		}
		return num * calculate(num-1);	// �ڱ��ڽ��� ��ȯ�����ν� ���丮���� ���	
	}
	
}
