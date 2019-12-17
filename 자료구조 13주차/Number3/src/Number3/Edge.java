/** Q3 : Edge.java, PrimMST.java, PrimMSTtest.java  
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 :  prim 알고리즘을 통해 최소 신장트리와 간선의 중앙치 합을 구하는 프로그램
 */
package Number3;

public class Edge {
	int adjvertex;			// 간선의 다른쪽 끝 정점
	int weight;				// 간선의 가중치
	public Edge(int v, int wt) {
		adjvertex = v;
		weight = wt;
	}
}