/** Q1 : GenData.java, GenDataTest.java
 *  작성일 : 2019.11.28 ~ 12.02
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : n개의 int값을 생성하여 배열로 리턴하는 GenData 클래스 구현
 */
package Number1;
import java.util.*;
public class GenData {
	public int[] getRandIntArr(int N, int min, int max) {
		int[] arr = new int[N];
		Random r = new Random();	// 랜덤값 시드 설정
		for(int i = 0; i < N; i++) {
			 arr[i] = r.nextInt(max - min) + min ; //min 보다 크고 max보다 작은 랜덤값을 저장
		}
		return arr;
	}
}
