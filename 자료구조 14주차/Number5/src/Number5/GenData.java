/** Q5 : GenData.java, Merge.java, MergeTest.java
 *  �ۼ��� : 2019.11.28 ~ 12.02
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �պ� ������ ������ ���α׷�
 */
package Number5;

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
}
