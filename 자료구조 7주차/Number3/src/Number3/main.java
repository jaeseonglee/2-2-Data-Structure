package Number3;
public class main {
	public static void main(String[] args) {
		ListQueue<Integer> queue = new ListQueue<Integer>();	// ���������� ��ü ����
		queue.add(1);
		queue.add(3);		// 1 3 2 4 5 ������ ���� �־��ְ�
		queue.add(2);
		queue.add(4);
		queue.add(5);
		queue.print();		// ť�� ���
		System.out.println("��� : "+queue.avg()); // ����� ������ְ� 
		queue.print();		// �ٽ� ť�� ���
	}
}
