/** Q1 : Edge.java, AdjList.java, MyGraph.java, MyGraphTest.java  
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 그래프를 나타낸 인접리스트와 인접행렬의 형태를 서로 바꾸어 저장하는 프로그램
 */
package Number1;

public class Edge { 
	int adjvertex;	// 간선의 다른쪽 정점 
	int weight;		// 가중치
	public Edge (int v, int wt ) {
		adjvertex = v;
		weight = wt;
	}
 }
