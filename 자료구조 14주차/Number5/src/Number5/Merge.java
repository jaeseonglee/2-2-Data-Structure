package Number5;
import java.lang.Comparable;
public class Merge {
	public static void sort(int [] a) {
		int[] b = new int[a.length];
		sort(a,b,0,a.length -1);
	}
	private static boolean isless(Comparable i, Comparable j) {
		return (i.compareTo(j) < 0);
	}
	
	private static void merge(int [] a, int [] b , int low,int mid,int high) {
		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++) {	// �迭 a�� �պκΰ� �޺κ��� �պ��Ͽ� �����迭 b�� ����
			if		(i > mid)			b[k] = a[j++];	// �պκ��� ���� ������ ���
			else if (j > high)			b[k] = a[i++];	// �޺κ��� ���� ������ ���
			else if (isless(a[j],a[i]))	b[k] = a[j++];	// a[i]�� �� �����ϱ� b[k]�� �̵�
			else						b[k] = a[i++];	// a[i]�� �� �����ϱ� b[k]�� �̵�
		}
		for(int k = low; k <= high; k++) a[k] = b[k];	// �����迭 b�� �迭 a�� ����
	}
	
	private static void sort(int [] a, int [] b, int low , int high) {
		if(high <= low) return;
		int mid = low + (high - low) / 2;
		sort(a,b,low,mid);		// �պκ� ���ȣ��
		sort(a,b,mid+1,high);	// �޺κ� ���ȣ��
		merge(a,b,low,mid,high);// �պ�����
		
	}
}
