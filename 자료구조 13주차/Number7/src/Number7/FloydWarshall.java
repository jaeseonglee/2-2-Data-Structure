/** Q7 : FloydWarshall.java, FloydWarshallTest.java
 *  �ۼ��� : 2019.11.21 ~ 12.01
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : Floyd-Warshall �˰����� ������ ���α׷� . ���� ����� ���� �˰����� ����ȴ�
 */
package Number7;
public class FloydWarshall {
	public static final int INF = Integer.MAX_VALUE;
	private int D[][];		// ���� ����� ������ �迭
	private int N;			// ũ�⸦ ������ �迭
	public FloydWarshall(int numOfVertices) {	// ������
		N = numOfVertices;	// �Ű������� �ʱ�ȭ
		D = new int[N][N];	// 2���� �迭 �ʱ�ȭ
	}
	
	public void printAdjMatrix (int adjMatrix[][]) {
		for(int i = 0; i < N; i++) {	
			for(int j = 0; j < N; j++) {
				D[i][j] = adjMatrix[i][j];	// D�� ���� �ʱ�ȭ
			}
		}
		for(int k = 0; k < N; k++) {		// ���� For�� ���� �˰��� ����
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(i == j) continue;	// �� ������ �ڱ� �ڽ����� ���ƿ��� ���� �����Ƿ� continue;
					// �־��� �˰���� ���Ҿ�, INF���� ���Ǹ� �����÷ο찡 �߻��Ͽ� ���� ���� ���ǹǷ� ���ǽ��� ���� �Ǻ����ش� 
					if (D[i][j] > D[i][k] + D[k][j] && D[i][k] != INF && D[k][j] != INF) {             
						D[i][j] = D[i][k] + D[k][j]; 	// ���� ������ ���� ������ ���� ���� �ʱ�ȭ
					}
				}
			}
		}
		System.out.println();
		for(int i = 0; i < D.length; i++) {		// ������� ���
			System.out.printf("%2d",D[i][0]);	// �������� ���� ����� ����ϱ� ���� printf ���
			for(int j = 1; j < D[i].length; j++) {
				System.out.printf(", %2d", D[i][j]);
			}
			System.out.println();		// ���� ����� ������ �ٹٲ�
		}
	}
}
