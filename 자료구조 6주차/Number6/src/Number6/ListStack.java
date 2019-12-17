package Number6;

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
	
	public double calc (String s[] ) { // �־��� ����ǥ��� ������ ����ϴ� calc�޼ҵ�
		double result = 0; 		// ����� ��ȯ�� ���� result ���� �� �ʱ�ȭ
		double temp = 0;		// ���� �ӽ������� ������ temp ���� �� �ʱ�ȭ
		
		for(int i=0; i<s.length; i++) {	// �ݺ����� ���� �־��� �Ű����� ���ڿ� �迭�� ���
			System.out.print(s[i]+" ");
		}
		System.out.println();		// ����� ������ �ٹٲ�
		
		// ASCII �ڵ� 
		// 42 : *	// 43 : +
		// 45 : -	// 47 : /
		
		for(int i=0; i< s.length; i++) {	// �ݺ����� push,pop�� ���� ���� ���
			if(s[i].length() == 1) {		// ���ڿ��� ���̰� �ѱ����� ���( ������ �Ǵ� ���ڸ�����)
				if( s[i].charAt(0) == (char)42) {	// '*' ���
					temp = (double)pop();			// double������ pop���־� temp�� ����
					temp =  (double)pop() * temp;	// �ѹ� �� pop ���ְ� �� ��Ҹ� �����־� �ٽ� temp�� ����
					push( (E)(Object)temp );		// �� ����� ���� temp�� E Ÿ������ push���ش�
					
				} else if(s[i].charAt(0) == (char)43) {	// '+' ���
					temp = (double)pop();			
					temp =  (double)pop() + temp;	// �ι� pop���ְ� �� ��Ҹ� �����ش�.
					push( (E)(Object)temp );		// ����� ���� temp�� push
					
				} else if(s[i].charAt(0) == (char)45) {	// '-' ���
					temp = (double)pop();		
					temp =  (double)pop() - temp;	// �ι� pop���ְ� �� ��Ҹ� ���ش�.
					push( (E)(Object)temp );		// ����� ���� temp�� push
					
				} else if(s[i].charAt(0) == (char)47) {	// '/' ���
					temp = (double)pop();			// pop�� ���� �ϰ� 
					temp =  (double)pop() / temp;	// �� ���� pop �ϴ� ��ҿ� temp�� ������ �ش�.
					push( (E)(Object)temp );		// ����� ���� temp�� push
				} else {		// ���� ������ �������� �ʴ�, �� �ѱ����� ���ڶ��
					temp = Double.parseDouble(s[i]);// ���ڿ��� �Ǽ������� ��ȯ���ְ�
					push((E)(Object)temp);			// ���� push ���ش�
				}		
			} else {				// �ѱ��ڰ� �ƴ϶�� �����̱� ������
				temp = Double.parseDouble(s[i]);	// ���ڿ��� �Ǽ������� ��ȯ���ְ�
				push((E)(Object)temp);				// ���� push ���ش�.
			}
		}
		
		result = (double)pop();	// �ݺ����� ���� ���Ǿ� ����� ������ ���� top�� ���� pop���ؾ� result�� ���� 
		return result;			// result�� ��ȯ���ش�.
	}
	
}