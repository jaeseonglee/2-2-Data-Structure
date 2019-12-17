import java.util.*;
public class ArrListPoly  {	//ArrList�� ������� Ŭ������ ����?
	private int [] a;		// �迭 ����
	private int size;		// �׸� �� 
	ArrListPoly() {		// ������
		a = new int[1];	// 1���� ���� ���� �迭�� ����
		size = 0;		//0���� �ʱ�ȭ
	}
	ArrListPoly (int [] arr) {	// �迭�� �Ű������� ������ 
		this.a = arr;		// �� �迭�� �ʱ�ȭ
		size = a.length;	// �� �迭�� ���̷� �ʱ�ȭ
	}
	public void setPoly(int k, int [] arr) {	// �ְ� ���� k�� �������� ���� ���� �迭�� �谳������ ���´�
		size = k+1;	// �׸���� �ְ� �������� �ϳ� ���� ������ �ʱ�ȭ
		a= arr;		
	}
	
	public ArrListPoly sumPoly(ArrListPoly p) {	// �ΰ�ü�� ���� �迭�� ���ϴ� sumPoly�Լ�
		if(p.a.length > a.length) {		// �Ű������μ��� ��ü�� �迭�� �� ��� 
			for(int i=0; i<a.length; i++) {	// ������ �� ���� �迭�� ū �迭�� �����ִ� �ݺ���
				p.a[i] += a[i];		// �� ��ü�� �迭�� ���� ������ �ε��� ���� �����ش�
			}
			return p;		// ������ ��ü ��ȯ
		} else
			for(int i=0; i<p.a.length; i++) {
				a[i] += p.a[i];		// ���� ���� ����������
			}
			return new ArrListPoly(a);	// �Ű������� �ƴ� ��ü�� ��ȯ�� ���� �����ڸ� �̿��Ѵ�.
	}
	
	public int getHighestDegree() {	return size-1;}	// ���� ���� ������ ��ȯ�ϴ� �޼ҵ�
	
	public int peek(int k) {	
		if(size==0 || k>= size)	// size �� ���� 0�̰ų� �Ű����� k�� ã�� ��ġ�� size���� ũ�� 
			throw new NoSuchElementException();	// ���� �߻�
		return a[k];
	}

}	