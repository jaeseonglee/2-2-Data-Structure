package Number3;

import java.lang.Comparable;	// compareTo() 메소드 사용
public class Selection {
	public static void sort(int[] arr) {
		int N = arr.length;
		for(int i = 0; i < N; i++) {
			int min = i;
			for(int j = i+1; j < N; j++) {	// min 찾기
				if(isless(arr[j], arr[min])) min = j;
			}
			swap(arr, i, min); // min과 a[i]의 교환
		}
	}
	
	private static boolean isless(Comparable i, Comparable j) { // 키 비교
		return (i.compareTo(j) < 0);
	}
	
	private static void swap(int[] arr , int i, int j) { // 원소 교환
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
