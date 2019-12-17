/**	�ڷᱸ�� 6����
 * 	Q1 : ArrayStack.java, main.java
 *  �ۼ��� : 2019.10.07 ~ 10.09
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �迭�� ���� �����ڷᱸ��. �����ڷ��� �ڵ�� �����ϴ�.
 */
import java.util.EmptyStackException;	// ���� ó���� ���� ��ó����
public class ArrayStack <E> {	// �迭�� ������ ������ ArrayStack Ŭ����
	private E	s[];		// ������ ���� �迭
	private int	top;		// ������ top �׸��� �迭 ���� �ε���
	public ArrayStack() {	// ���� ������
		s = (E[]) new Object[1];	// �ʱ⿡ ũ�Ⱑ 1�� �迭 ����
		top = -1;
	}
	
	public int	size()	{ return top+1; }	// ���ÿ� �ִ� �׸��� ���� ����  
	public boolean isEmpty() { return (top == -1);}// ������ empty�� true ����
	
	
	public E peek() {	// ���� top �׸��� ���븸�� ����
		if(isEmpty()) throw new EmptyStackException();	// underflow�� ���α׷� ����
		return s[top];
	}
	
	public void push(E newItem) { // push ���� �޼ҵ�
		if (size() == s.length)	// �迭�� ũ�⺸�� �� ���� �����Ѵٸ�
			resize(2*s.length);	// ������ 2���� ũ��� Ȯ��
		s[++top] = newItem;		// �� �׸��� push
	}
	
	public E pop() {	// pop ���� �޼ҵ�
		if (isEmpty()) throw new EmptyStackException();	// underflow�� ���α׷� ����
		E item = s[top];
		s[top--] = null;		// null�� �ʱ�ȭ
		if(size() > 0 && size() == s.length/4) 
			resize(s.length/2);// ������ 1/2ũ��� ���
		return item;
	}

	
	private void resize(int newSize) {	// �迭�� ũ�⸦ �����ϴ� resize �޼ҵ�
		Object[] t = new Object[newSize];// newSize ũ���� ���ο� �迭 t ����
		for(int i=0; i<size(); i++)
			t[i] = s[i];	// �迭 s�� �迭 t�� ����
		s = (E[]) t;		// �迭 t�� �迭 s�� �̵�
	}
	
	public void print() {	// �迭�� ����ϴ� print �޼ҵ�
		for(int i =0; i< size(); i++) {
			System.out.print(s[i]+"\t");
		}
		System.out.println();	// ����� ������ �ٹٲ�
	}
}
