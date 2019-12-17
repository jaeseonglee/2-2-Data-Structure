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
		for(int k = low; k <= high; k++) {	// 배열 a의 앞부부과 뒷부분을 합병하여 보조배열 b에 저장
			if		(i > mid)			b[k] = a[j++];	// 앞부분이 먼저 소진된 경우
			else if (j > high)			b[k] = a[i++];	// 뒷부분이 먼저 소진된 경우
			else if (isless(a[j],a[i]))	b[k] = a[j++];	// a[i]가 더 작으니까 b[k]로 이동
			else						b[k] = a[i++];	// a[i]가 더 작으니까 b[k]로 이동
		}
		for(int k = low; k <= high; k++) a[k] = b[k];	// 보조배열 b를 배열 a에 복사
	}
	
	private static void sort(int [] a, int [] b, int low , int high) {
		if(high <= low) return;
		int mid = low + (high - low) / 2;
		sort(a,b,low,mid);		// 앞부분 재귀호출
		sort(a,b,mid+1,high);	// 뒷부분 재귀호출
		merge(a,b,low,mid,high);// 합병수행
		
	}
}
