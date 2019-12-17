package Number4;

import java.util.EmptyStackException; // ����ó���� ���� ��ó����
public class ListStack <E> {	// ����Ʈ�� ������ ������ ListStack Ŭ���� 
	private Node<E> top;	// ���� top �׸��� ���� Node�� ����Ű�� ����
	private int size;		// ������ �׸� ��
	public ListStack() {	// ���� ������
		top = null;
		size = 0;
	}
	public int	size()	{return size;} // ������ �׸��� ���� ����
	public boolean isEmpty() {return size ==0;}	// ������ empty�̸� true ����
	
	public E peek() {		// ���� top �׸��� ����
		if(isEmpty()) throw new EmptyStackException();// underflow
		return top.getItem();
	}
	
	public void push(E newItem) {	// ���� push ����
		Node newNode = new Node(newItem, top);	// ����Ʈ �պκп� ����
		top = newNode;			// top�� �� ��� ����Ŵ
		size++;					// ���� �׸� �� 1����
	}
	
	public E pop() {		// ���� pop ����
		if(isEmpty()) throw new EmptyStackException();// underflow
		E topItem  = top.getItem();	// ���� top �׸��� topItem�� ����
		top = top.getNext();		// top�� top �ٷ� �Ʒ� �׸��� ����Ŵ
		size--;						// ���� �׸� ���� 1 ����
		return topItem;
	}
	
	public void print() { // ������ ����ϴ� print �޼ҵ�	
		Node result = top;
		for(int i=0; i< size; i++) {// �ݺ����� ���� ù ������ ������ ������ش�
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
	
	public boolean checkPalindrome(String s) {  // �־��� �ܾ ȸ������ �Ǻ��ϴ� checkPalindrome�޼ҵ�
		int count = 0;			// ���� ���� ������ count ���� 0���� �ʱ�ȭ
		int len = s.length();	// ���ڿ��� ���̸� ������ ���� len
		
		for(int i =0; i < len/2 ; i++) {	// ���� ������ ���ݱ���, ���ڼ��� Ȧ���� ���� �� �ձ��� ��°� push����
			System.out.print(s.charAt(i));	// ���� �ϳ��� ���
			push( (E)(Object)s.charAt(i) );	// �׸��� push�� ���� stack�� �־��ش�.
		}
		for(int i = len/2; i < len; i++) {  // �׸��� ���� ������ ��°� ������ ���� ȸ������ �Ǵ�
			System.out.print(s.charAt(i));	// ���� �ϳ��� ���
			if(i == len/2 && len % 2 == 1) continue;	// ù��° �ݺ����� ���ڼ��� Ȧ���� ��� ���ڸ� �����ش�.
			if(pop() != (Object)s.charAt(i)) { count++; }	// ���� ���ڿ� stack�� ���� ���ڰ� �ٸ��� count ���� 
		}
		System.out.println();	// ���ڿ� ��� �� count���� �����ϴ� �ݺ����� ������ �ٹٲ� 
		if(count == 0) { return true;}	// count ���� ���� true false ����
		else { return false;}
	}
	
}
