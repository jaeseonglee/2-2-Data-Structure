/** Q5 : BellmanFord.java, BellmanFordtest.java
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : BellmanFord 알고리즘을 통해 음수 가중치를 가진 그래프에서 최단경로를 추출하는 프로그램
 */
package Number5;
public class BellmanFord {
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[];	// 경로 추출을 위해
	private int N;
	
	public BellmanFord(int numOfVertices) {	// 생성자
		N = numOfVertices;
		D = new int[N];			// 최단거리 저장
		previous = new int[N];	// 최단 경로 추출하기 위해
	}
	
	public void shortestPath(int s,int adjMatrix[][]) {
		for(int i = 0; i < N; i++) {
			D[i] = INF;
		}
		D[s] = 0; previous[s] = 0;
		for(int k = 0; k < N-1; k++) {			// 총 N-1번 반복
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
