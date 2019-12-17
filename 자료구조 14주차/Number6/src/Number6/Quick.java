package Number6;
import java.lang.Comparable;
public class Quick {
	public static void sort(int [] a) {
		sort(a ,0 ,a.length -1);
	}
	private static void sort(int[] a, int low, int high) {
		if(high <= low) return;
		int j = partition(a,low,high);
		sort(a,low,j-1);	// �ǹ����� ���� �κ��� ���ȣ��
		sort(a,j+1, high);	// �ǹ����� ū �κ��� ���ȣ��
	}	
	private static int partition(int[] a, int pivot, int high) {
		int i = pivot +1;
		int j = high;
		Comparable p = a[pivot];
		while(true) {
			while(i <= high && !isless(p, a[i])) i++;	// �ǹ��� ���ų� ������ i++
			while(j >= pivot && isless(p,a[j])) j--;	// �ǹ����� ũ�� j--
			if(i >= j) break;		// i�� j�� �����Ǹ� ���� ������
			swap(a,i,j);
		}
		swap(a,pivot,j);	// �ǹ��� a[j] ��ȯ
		return j;			// a[j]�� �ǹ��� "������" �ڸ� ���� ��
	}
	
	private static boolean isless(Comparable i, Comparable j) {
		return (i.compareTo(j) < 0);
	}
	
	private static void swap(int[] arr , int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
