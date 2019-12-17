/** Q7 : GenData.java(버블정렬 포함), Selection.java, Insertion.java, Merge.java, Quick.java, ArrayAlgorithm.java
 *  작성일 : 2019.11.28 ~ 12.02
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 5개의 정렬의 알고리즘을 비교하여 시간을 측정하는 프로그램. 버블정렬은 GenData 클래스에 속해있다.
 */
package Number7;

import java.util.Random;
public class GenData {
	public int[] getRandIntArr(int N, int min, int max) {
		int[] arr =new int[N];
		Random r = new Random();
		
		for(int i = 0; i < N; i++) {
			 arr[i] = r.nextInt(max - min) + min ;
		}
		return arr;
	}
	
	public static int [] doSort(int [] arr) {		// 버블 정렬
		int temp = 0;
		for(int end = arr.length-1; end > 0; end-- ) {
			for(int i = 0; i < end; i++) {
				if(arr[i] > arr[i+1]) {
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
