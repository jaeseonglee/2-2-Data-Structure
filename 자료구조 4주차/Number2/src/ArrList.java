import java.util.NoSuchElementException;	// ���� �߻��� ���� ��ó����
public class ArrList <E> { // ���׸��� �̿��ؼ� Ŭ������ ���� 
	private E a[];		// ���׸� Ÿ������ �ԷµǴ� �迭�� ����
	private int size;	// �׸� ��
	public ArrList() {	// ������
		a = (E[]) new Object[1]; // 1���� ���� ���� �迭�� ����	
		size = 0;	// 0���� �ʱ�ȭ
	}
	
	public E peek(int k) {		// ���׸� �޼ҵ� peek
		if(size==0 || k>= size)	// size �� ���� 0�̰ų� �Ű����� k�� ã�� ��ġ�� size���� ũ�� 
			throw new NoSuchElementException();	// ���� �߻�
		return a[k];
	}
	
	public boolean isEmpty() { // size�� 0�̸� true�� ��ȯ�ϴ� isEmpty �޼ҵ�
		if(size==0) return true;
		return false;
	}
	
	public void insertLast(E newItem) { // ���� �ڿ� �� �׸� ����
		if(size == a.length)		// �迭�� �� ������ ������
			resize(2*a.length);		// �迭�� ũ�⸦ 2��� �÷��ش�.
		a[size++] = newItem;		// �������� ���׸��� �����Ѵ�.
	}
	public void	insert (E newItem, int k) {	// �� �׸��� k-1��° �׸� ������ ����
		if(size == a.length)		// �迭�� �� ������ ������
			resize(2*a.length);		// �迭�� ũ�⸦ 2��� �÷��ش�.
		for(int i=size-1; i>= k; i--) a[i+1] = a[i];	// �׸���� ��ĭ �ڷ� �̵�
		a[k] = newItem;
		size++;
	}
	public void insert( E newItem) {// insert �޼ҵ� �����ε����ν�, ���° ���������� ������
		insertLast(newItem);		// ������ �׸� �߰��Ѵ�.
	}
	private void resize(int newSize) {	// �迭�� ũ�⸦ �����ϴ� resize �޼ҵ�
		Object[] t = new Object[newSize];// newSize ũ���� ���ο� �迭 t ����
		for(int i=0; i<size; i++)
			t[i] = a[i];	// �迭 s�� �迭 t�� ����
		a = (E[]) t;		// �迭 t�� �迭 s�� �̵�
	}
	
	public E delete(int k) {	// k��° �׸��� �����ϴ� delete �޼ҵ�
		if(isEmpty()) throw new NoSuchElementException();
		E item = a[k];
		for(int i = k; i< size; i++) a[i] = a[i+1];	// ��ĭ�� ������ �̵�
		size--;
		if(size > 0 && size <= a.length/4)	// �迭�� ��ü ũ���� 1/4�� ���Ǹ�
			resize(a.length/2);			// �迭�� 1/2�� ��ҽ�Ŵ
		return item;
	}
	
	public void print() {		// �迭�� ����ϴ� print �޼ҵ�
		for(int i =0; i< a.length; i++) {
			if(i<size) System.out.print(a[i]+"\t");
			else System.out.print("null\t");
		}
		System.out.println();
	}
}