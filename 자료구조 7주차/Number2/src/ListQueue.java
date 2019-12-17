import java.util.NoSuchElementException;
public class ListQueue <E> {
	private Node<E> front, rear;
	private int size;
	public ListQueue() {	// ������
		front = rear = null;
		size = 0;
	}
	public int size() {return size;}		// ť�� �׸��� ���� ����
	public boolean isEmpty() {return size() == 0;}	// ť�� empty�̸� true����
	
	public void add(E newItem) {
		Node newNode = new Node(newItem,null);	// �� ��� ����
		if(isEmpty()) front = newNode;	// ť�� empty�̾����� front�� newNode�� ����Ű�� �Ѵ�
		else rear.setNext(newNode);		// �׷��� ������ rear�� next�� newNode�� ����Ű�� �Ѵ�
		rear = newNode;					// ���������� rear�� newNode�� ����Ű�� �Ѵ�
		size++;							// ť �׸� �� 1����
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();	// underflow ��쿡 ���α׷� ����
		E frontItem = front.getItem();	//front�� ����Ű�� ����� �׸��� frontItem�� ����
		front = front.getNext();		// front�� front ���� ��带 ����Ű�� �Ѵ�.
		size--;							// ť �׸� �� 1����
		if(isEmpty()) rear = null;		// ť�� empty�� rear = null
		return frontItem;
	}
	
	public void print() {
		Node result = front;
		for(int i=0; i< size; i++) {// �ݺ����� ���� ù ������ ������ ������ش�
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
}
