/** Q3 : Edge.java, PrimMST.java, PrimMSTtest.java  
 *  �ۼ��� : 2019.11.21 ~ 12.01
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� :  prim �˰����� ���� �ּ� ����Ʈ���� ������ �߾�ġ ���� ���ϴ� ���α׷�
 */
package Number3;

public class Edge {
	int adjvertex;			// ������ �ٸ��� �� ����
	int weight;				// ������ ����ġ
	public Edge(int v, int wt) {
		adjvertex = v;
		weight = wt;
	}
}