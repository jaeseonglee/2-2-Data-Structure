/** Q6 : BellmanFordNew.java, BellmanFordNewTest.java
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : BellmanFord 알고리즘에서 음수 싸이클이 존재하는지 확인하는 프로그램. N-1번의 반복 후에  또 반복을 했을 때 음수 사이클이 존재하면
 * 				반복을 할때 마다 가중치 합이 계속 작아지므로 이를 이용해서 음수 사이클 존재를 확인
 */
package Number6;
import java.util.Arrays;

public class BellmanFordNew {
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[];	// 경로 추출을 위해
	private int N;
	
	public BellmanFordNew(int numOfVertices) {	// 생성자
		N = numOfVertices;
		D = new int[N];			// 최단거리 저장
		previous = new int[N];	// 최단 경로 추출하기 위해
	}
	
	public void shortestPath(int s,int adjMatrix[][]) {
		int []temp = new int[N];		// Q6 배열을 저장하는 temp 선언
		for(int i = 0; i < N; i++) {
			D[i] = INF;
		}
		D[s] = 0; previous[s] = 0;
		for(int k = 0; k < N; k++) { // Q6 N-1번이 아닌 N번 반복, N-1번 반복이 끝나고 한번더 반복해서 D배열의 값이 작아지면 음수사이클 존재
			for(int m= 0; m < N; m++ ) {
				temp[m] = D[m];		// Q6 temp에 D를 복사
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if (adjMatrix[i][j] != INF) {
						if (D[j] > D[i] + adjMatrix[i][j]) {
							D[j] = D[i] + adjMatrix[i][j];	// 간선 완화
							previous[j] = i;	// i 덕분에 j까지 거리가 단축됨
						}
					}
				}
			}
			if(k == N-1) {		// Q6 N-1번의 반복이 끝나고 N번째 반복일때 음수 사이클이 존재하는지 확인
				for(int n = 0; n < N; n++) {	
					if(temp[n] > D[n]) {		// Q6 만약 N번째 반복에서 D배열의 값이 작아졋다면 음수 사이클 존재확인
						System.out.println(Arrays.toString(temp));
						System.out.println(Arrays.toString(D));
						System.out.println("음수 사이클이 있습니다");	// Q6 음수 사이클 발생 출력후 
						return;					// 메소드 종료
					}
				}
			}
		}
	}
	public void printPaths(int s) {	// 결과 출력
		System.out.println("정점 0으로부터의 최단거리");
		for(int i = 1; i < D.length; i++) {
			if(D[i] == Integer.MAX_VALUE)
				System.out.println("0과 " + i +" 사이에 경로 없음.");
			else
				System.out.printf("[0, %d] =   %2d\n",i,D[i]);
		}
	
		System.out.printf("\n정점 0으로부터의 최단 경로\n");
		for(int i = 1; i < previous.length; i++) {
			int back = i;
			System.out.print(back);
			while (back != 0) {
				System.out.print("<-" + previous[back]);
				back = previous[back];
			}
			System.out.println();
		}
		
	}
}
