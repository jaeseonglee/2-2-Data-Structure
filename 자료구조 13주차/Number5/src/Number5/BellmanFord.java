/** Q5 : BellmanFord.java, BellmanFordtest.java
 *  �ۼ��� : 2019.11.21 ~ 12.01
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : BellmanFord �˰����� ���� ���� ����ġ�� ���� �׷������� �ִܰ�θ� �����ϴ� ���α׷�
 */
package Number5;
public class BellmanFord {
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[];	// ��� ������ ����
	private int N;
	
	public BellmanFord(int numOfVertices) {	// ������
		N = numOfVertices;
		D = new int[N];			// �ִܰŸ� ����
		previous = new int[N];	// �ִ� ��� �����ϱ� ����
	}
	
	public void shortestPath(int s,int adjMatrix[][]) {
		for(int i = 0; i < N; i++) {
			D[i] = INF;
		}
		D[s] = 0; previous[s] = 0;
		for(int k = 0; k < N-1; k++) {			// �� N-1�� �ݺ�
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if (adjMatrix[i][j] != INF) {
						if (D[j] > D[i] + adjMatrix[i][j]) {
							D[j] = D[i] + adjMatrix[i][j];	// ���� ��ȭ
							previous[j] = i;	// i ���п� j���� �Ÿ��� �����
						}
					}
				}
			}
		}
	}
	public void printPaths(int s) {	// ��� ���
		System.out.println("���� 0���κ����� �ִܰŸ�");
		for(int i = 1; i < D.length; i++) {
			if(D[i] == Integer.MAX_VALUE)
				System.out.println("0�� " + i +" ���̿� ��� ����.");
			else
				System.out.printf("[0, %d] =   %2d\n",i,D[i]);
		}
	
		System.out.printf("\n���� 0���κ����� �ִ� ���\n");
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
