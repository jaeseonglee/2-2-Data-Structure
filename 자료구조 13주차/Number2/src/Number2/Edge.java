/** Q2 : Edge.java, AdjList.java, CheckGraph.java, CheckGraphTest.java  
 *  작성일 : 2019.11.21 ~ 12.01
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 주어진 그래프 G와 G를 뒤집은 GR과의 비교를 통해 서로 같은 그래프가 되는지 확인하는 프로그램 
 */

package Number2;
public class Edge { 
	int adjvertex;	// 간선의 다른쪽 정점 
	int weight;		// 가중치
	public Edge (int v, int wt ) {
		adjvertex = v;
		weight = wt;
	}
 }
