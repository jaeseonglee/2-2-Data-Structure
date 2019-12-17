package Number2;
import java.util.*;

public class BubbleSort {
	public static void main(String [] args) {
		GenData gd = new GenData();
		int [] nums = gd.getRandIntArr(10, 0, 100);
		System.out.println("Before : "+ Arrays.toString(nums));		
		int [] sorted_nums = doSort(nums);
		System.out.println("After  : "+ Arrays.toString(sorted_nums));
	}
	public static int [] doSort(int [] arr) {
		int temp = 0;
		for(int end = arr.length-1; end > 0; end-- ) {
			for(int i = 0; i < end; i++) {
				if(arr[i] > arr[i+1]) {	 // 잘못된 순서
					//arr[i]와 arr[i+1]의 교환
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
}