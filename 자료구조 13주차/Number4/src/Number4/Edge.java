/** Q4 : Edge.java, DijkstraSP.java, DijkstraSPtest.java  
 *  �ۼ��� : 2019.11.21 ~ 12.01
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� :  Dijkstra �˰����� ���� �ִ� ��θ� ���ϴ� ���α׷�
 */
package Number4;

public class Edge {
	int vertex;		// ������ ���� �� ����
	int adjvertex;	// ������ �ٸ��� �� ����
	int weight;		// ������ ����ġ
	
	public Edge(int u, int v, int wt) {
		vertex = u;
		adjvertex = v;
		weight = wt;
	}
}
