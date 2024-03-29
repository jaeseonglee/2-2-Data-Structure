package Number7;

import java.lang.Comparable;
public class Selection {
	public static void sort(int[] arr) {
		int N = arr.length;
		for(int i = 0; i < N; i++) {
			int min = i;
			for(int j = i+1; j < N; j++) {
				if(isless(arr[j], arr[min])) min = j;
			}
			swap(arr, i, min); // min�� a[i]�� ��ȯ
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
