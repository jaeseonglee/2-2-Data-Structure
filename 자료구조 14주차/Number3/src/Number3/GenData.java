/** Q3 : GenData.java, Selection.java, SelectionTest.java
 *  작성일 : 2019.11.28 ~ 12.02
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 선택 정렬을 구현한 프로그램
 */
package Number3;
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
