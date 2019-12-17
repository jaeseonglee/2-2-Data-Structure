/**	Q3 : Node.java, ListQueue.java, main.java
 *  �ۼ��� : 2019.10.21 ~ 10.22
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ť�� ����� ���ϴ� ���α׷�, add�� remove���� ����Ͽ� ���� ���Ѵ�.
 */
package Number3;

public class Node <E>{		// Node Ŭ���� 
	private E 		item;	// ��ü�� ���� ����
	private Node<E>	next;	// ���� ��带 ����Ű�� ���۷���
	public Node(E newItem, Node<E> node) {	//������
		item = newItem;		// �Ű������� ���� ���� �������ش�
		next = node;
	}
	// �� ��������� ���� getter setter�޼ҵ� 
	public E		getItem() { return item; }
	public Node<E>	getNext() { return next; }
	public void		setItem(E newItem) 		{item = newItem;}
	public void 	setNext(Node<E> newNext){next = newNext;}
}