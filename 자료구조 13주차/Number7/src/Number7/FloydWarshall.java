/** Q7 : FloydWarshall.java, FloydWarshallTest.java
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : Floyd-Warshall 알고리즘을 구현한 프로그램 . 인접 행렬을 통해 알고리즘이 진행된다
 */
package Number7;
public class FloydWarshall {
	public static final int INF = Integer.MAX_VALUE;
	private int D[][];		// 인접 행렬을 저장할 배열
	private int N;			// 크기를 저장할 배열
	public FloydWarshall(int numOfVertices) {	// 생성자
		N = numOfVertices;	// 매개변수로 초기화
		D = new int[N][N];	// 2차원 배열 초기화
	}
	
	public void printAdjMatrix (int adjMatrix[][]) {
		for(int i = 0; i < N; i++) {	
			for(int j = 0; j < N; j++) {
				D[i][j] = adjMatrix[i][j];	// D를 새로 초기화
			}
		}
		for(int k = 0; k < N; k++) {		// 삼중 For문 으로 알고리즘 진행
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(i == j) continue;	// 한 정점이 자기 자신으로 돌아오는 경우는 없으므로 continue;
					// 주어진 알고리즘과 더불어, INF값이 사용되면 오버플로우가 발생하여 음수 값이 사용되므로 조건식이 같이 판별해준다 
					if (D[i][j] > D[i][k] + D[k][j] && D[i][k] != INF && D[k][j] != INF) {             
						D[i][j] = D[i][k] + D[k][j]; 	// 위의 조건이 전부 맞으면 값을 새로 초기화
					}
				}
			}
		}
		System.out.println();
		for(int i = 0; i < D.length; i++) {		// 인접행렬 출력
			System.out.printf("%2d",D[i][0]);	// 음수값을 좀더 깔끔히 출력하기 위해 printf 사용
			for(int j = 1; j < D[i].length; j++) {
				System.out.printf(", %2d", D[i][j]);
			}
			System.out.println();		// 행의 출력이 끝나면 줄바꿈
		}
	}
}
