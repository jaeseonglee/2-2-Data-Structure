package Number5;

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
	
	public String getPostEq(String s) { // ����ǥ��� ������ ����ǥ��� �������� ��ȯ�ϴ� getPostEq �޼ҵ�
		String result = "";		// ����ǥ������� ����� result ���� ���� �� �ʱ�ȭ
		Object temp = null;		// �ӽ� Ŭ���� ���� ���� 
		System.out.println(s);	// �Է¹��� �Ű����� ���
		
		// ASCII �ڵ� 
		// 40 : (	// 41 : )
		// 42 : *	// 43 : +
		// 45 : -	// 47 : /
		
		for(int i= 0; i <s.length(); i++ ) {	// for���� switch���� ���� ��� ����
			switch(s.charAt(i)) {	// switch��
			case (char)40:			// '(' �� ���� 
				push((E)(Object)s.charAt(i)); // ���ÿ� �׾��ش�.
				break;				// switch�� �������� ���� �ݺ����� ����
			case (char)41:			//  ')' �� ���� 
				while (top.getItem() != (Object)(char)40) {	// top�� '('�� �ɶ����� ���ѹݺ�
					result += pop();	// result�� ���ڵ��� �׾��ش�.
				} 
				temp = pop();		// top�� '('�� �Ǿ� �ݺ����� ���������� '(' �� pop ���־� temp���� ���� 
				break;			  	
				
			case (char)43:			// +,- �� ����
			case (char)45:
				if(isEmpty() || top.getItem() == (Object)(char)40) { // +,- ���� ���� �켱������ ���� ���� '(', �׸��� ������ ���� ��
					push((E)(Object)s.charAt(i));	// + �Ǵ� -�� push���ش�.
				} else {
					result += pop();				// ���� ������ �ƴ϶�� ���ÿ� ���� �����ڸ� pop���ְ�
					push((E)(Object)s.charAt(i));	// + �Ǵ� -�� push���ش�.
				}
				break;
				
			case (char)42:			// *,/ �� ����
			case (char)47:
				if(isEmpty() ||top.getItem() == (Object)(char)40 ||   // ������ ���ų�, (,+,- �� top�� ���� 
					top.getItem() == (Object)(char)43 || top.getItem() == (Object)(char)45 ) {
					push((E)(Object)s.charAt(i)); // * �Ǵ� /�� push���ش�. 
				} else {
					result += pop();			 // ���� ������ �ƴ϶�� ���ÿ� ���� �����ڸ� pop���ְ�
					push((E)(Object)s.charAt(i));//* �Ǵ� /�� push���ش�.
				}
				break;
				
			default:
				result += s.charAt(i);			// �����ڳ� ��ȣ�� �ƴ� ���ڵ��� �״�� ��°��� �������ش�.
				break;
			}
		} // for�� ����
		
		while(isEmpty() != true) { // for���� ���� result���� ����������
			result += pop();	// ���� ���ÿ��� ���������� �����ڵ��� result���� �߰����ش�.
		}
		
		return result;	// ���� �ݺ������� ������, result���� ��ȯ���ش�.
	}
}
