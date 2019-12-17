/** Q6 : BellmanFordNew.java, BellmanFordNewTest.java
 *  �ۼ��� : 2019.11.21 ~ 12.01
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : BellmanFord �˰��򿡼� ���� ����Ŭ�� �����ϴ��� Ȯ���ϴ� ���α׷�. N-1���� �ݺ� �Ŀ�  �� �ݺ��� ���� �� ���� ����Ŭ�� �����ϸ�
 * 				�ݺ��� �Ҷ� ���� ����ġ ���� ��� �۾����Ƿ� �̸� �̿��ؼ� ���� ����Ŭ ���縦 Ȯ��
 */
package Number6;
import java.util.Arrays;

public class BellmanFordNew {
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[];	// ��� ������ ����
	private int N;
	
	public BellmanFordNew(int numOfVertices) {	// ������
		N = numOfVertices;
		D = new int[N];			// �ִܰŸ� ����
		previous = new int[N];	// �ִ� ��� �����ϱ� ����
	}
	
	public void shortestPath(int s,int adjMatrix[][]) {
		int []temp = new int[N];		// Q6 �迭�� �����ϴ� temp ����
		for(int i = 0; i < N; i++) {
			D[i] = INF;
		}
		D[s] = 0; previous[s] = 0;
		for(int k = 0; k < N; k++) { // Q6 N-1���� �ƴ� N�� �ݺ�, N-1�� �ݺ��� ������ �ѹ��� �ݺ��ؼ� D�迭�� ���� �۾����� ��������Ŭ ����
			for(int m= 0; m < N; m++ ) {
				temp[m] = D[m];		// Q6 temp�� D�� ����
			}
			
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
			if(k == N-1) {		// Q6 N-1���� �ݺ��� ������ N��° �ݺ��϶� ���� ����Ŭ�� �����ϴ��� Ȯ��
				for(int n = 0; n < N; n++) {	
					if(temp[n] > D[n]) {		// Q6 ���� N��° �ݺ����� D�迭�� ���� �۾Ơ��ٸ� ���� ����Ŭ ����Ȯ��
						System.out.println(Arrays.toString(temp));
						System.out.println(Arrays.toString(D));
						System.out.println("���� ����Ŭ�� �ֽ��ϴ�");	// Q6 ���� ����Ŭ �߻� ����� 
						return;					// �޼ҵ� ����
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
