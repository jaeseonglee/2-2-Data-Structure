
public class FactorialLoop {		// �ݺ������ ����ϴ� FactorialLoop Ŭ����
	private long result = 1;		// ���丮���� ���� ���ϱ޼������� Ŀ���Ƿ�  long ���
	
	public long calculate(int num) {// ���丮���� ����ϴ� calculate �޼ҵ�
		for(int i=1; i<=num; i++) { // for���� ���� ���丮�� ���� ���
			result *= i;		// 1���� num���� ���� ����� result�� ����
		}
		return result;		// result ��ȯ
	}
	
}
