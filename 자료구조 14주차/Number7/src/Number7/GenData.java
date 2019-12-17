/** Q7 : GenData.java(�������� ����), Selection.java, Insertion.java, Merge.java, Quick.java, ArrayAlgorithm.java
 *  �ۼ��� : 2019.11.28 ~ 12.02
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : 5���� ������ �˰����� ���Ͽ� �ð��� �����ϴ� ���α׷�. ���������� GenData Ŭ������ �����ִ�.
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
	
	public static int [] doSort(int [] arr) {		// ���� ����
		int temp = 0;
		for(int end = arr.length-1; end > 0; end-- ) {
			for(int i = 0; i < end; i++) {
				if(arr[i] > arr[i+1]) {
					//arr[i]�� arr[i+1]�� ��ȯ
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
}
