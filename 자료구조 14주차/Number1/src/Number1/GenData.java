/** Q1 : GenData.java, GenDataTest.java
 *  �ۼ��� : 2019.11.28 ~ 12.02
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : n���� int���� �����Ͽ� �迭�� �����ϴ� GenData Ŭ���� ����
 */
package Number1;
import java.util.*;
public class GenData {
	public int[] getRandIntArr(int N, int min, int max) {
		int[] arr = new int[N];
		Random r = new Random();	// ������ �õ� ����
		for(int i = 0; i < N; i++) {
			 arr[i] = r.nextInt(max - min) + min ; //min ���� ũ�� max���� ���� �������� ����
		}
		return arr;
	}
}
