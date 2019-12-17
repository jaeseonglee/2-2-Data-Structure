/** Q4 : Edge.java, DijkstraSP.java, DijkstraSPtest.java  
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 :  Dijkstra 알고리즘을 통해 최단 경로를 구하는 프로그램
 */
package Number4;

public class Edge {
	int vertex;		// 간선의 한쪽 끝 정점
	int adjvertex;	// 간선의 다른쪽 끝 정점
	int weight;		// 간선의 가중치
	
	public Edge(int u, int v, int wt) {
		vertex = u;
		adjvertex = v;
		weight = wt;
	}
}
