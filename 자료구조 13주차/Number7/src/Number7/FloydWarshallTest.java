package Number7;

public class FloydWarshallTest {
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String[]args) {
		int[][] adjMatrix = {{   0,   4,   2,   5,  INF},
							 { INF,   0,   1, INF, 	  4},
							 {   1,	  3,   0,   1,    2},
							 {  -2, INF, INF,   0,    2},
							 { INF,  -3,   3,   1,    0}};	// 1) 44p에 주어진 방향 가중치 그래프를 인접행렬로 구현
		
		for(int i = 0; i < adjMatrix.length; i++) {		// 2) 인접 행렬 출력
			for(int j = 0; j < adjMatrix[i].length; j++) {
				System.out.printf("%11d ",adjMatrix[i][j]);
			}
			System.out.println();
		}
		FloydWarshall fws = new FloydWarshall(adjMatrix.length);
		fws.printAdjMatrix(adjMatrix);		// 3,4) Floyd-Warshall 알고리즘 실행 및 출력
	}
}
