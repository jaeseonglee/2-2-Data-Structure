package Number6;

public class BellmanFordNewTest {
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String [] args) {
		int[][] weight = {										// Q6 2,5,7에서 음수 사이클을 만들어줌
				{ INF,	 1, INF,   2, INF, INF, INF, INF},
				{ INF, INF,   4,  -2, 	1,   6, INF, INF},
				{ INF, INF, INF, INF, INF, INF, INF,  -2},		// Q6 2=>7(2)를 -2로 바꿔줌
				{ INF, INF, INF, INF,  -1, INF, INF, INF},
				{ INF, INF, INF, INF, INF, INF,   4, INF},
				{ INF, INF,  -1, INF, INF, INF, INF, INF},		// Q6 5=>2(1)을 -1로 바꿔줌
				{ INF, INF,  -1, INF, INF, INF, INF,   1},
				{ INF, INF, INF, INF, INF,  -3, INF, INF}		// Q6 7=>5(3)을 -3으로 바꿔줌
		};
		int N = weight.length;	// 그래프 정점의 수
		
		int s = 0;	// 출발점
		BellmanFordNew bf = new BellmanFordNew(N);// 객체 생성
		bf.shortestPath(s, weight);			// 최단경로 찾기
		//bf.printPaths(s);					// 결과 출력		Q6 출력에 있어 While문의 존재 때문에 무한 반복하여 출력한다 -> 임시 주석처리
	}
}
