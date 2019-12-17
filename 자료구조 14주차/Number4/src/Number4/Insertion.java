package Number4;
import java.lang.Comparable;
public class Insertion {
	public static void sort(int [] a) {
		int N = a.length;
		for(int i = 1; i < N; i++) {	// i는 현재 원소의 인덱스
			for(int j = i; j > 0; j--) {	// 현재 원소를 정렬한 앞부분에 삽입
				if(isless(a[j] , a[j-1] ) ) 
					swap(a,j,j-1);
				else break;
			}
		}
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