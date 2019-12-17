package Number6;

public class BellmanFordNewTest {
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String [] args) {
		int[][] weight = {										// Q6 2,5,7���� ���� ����Ŭ�� �������
				{ INF,	 1, INF,   2, INF, INF, INF, INF},
				{ INF, INF,   4,  -2, 	1,   6, INF, INF},
				{ INF, INF, INF, INF, INF, INF, INF,  -2},		// Q6 2=>7(2)�� -2�� �ٲ���
				{ INF, INF, INF, INF,  -1, INF, INF, INF},
				{ INF, INF, INF, INF, INF, INF,   4, INF},
				{ INF, INF,  -1, INF, INF, INF, INF, INF},		// Q6 5=>2(1)�� -1�� �ٲ���
				{ INF, INF,  -1, INF, INF, INF, INF,   1},
				{ INF, INF, INF, INF, INF,  -3, INF, INF}		// Q6 7=>5(3)�� -3���� �ٲ���
		};
		int N = weight.length;	// �׷��� ������ ��
		
		int s = 0;	// �����
		BellmanFordNew bf = new BellmanFordNew(N);// ��ü ����
		bf.shortestPath(s, weight);			// �ִܰ�� ã��
		//bf.printPaths(s);					// ��� ���		Q6 ��¿� �־� While���� ���� ������ ���� �ݺ��Ͽ� ����Ѵ� -> �ӽ� �ּ�ó��
	}
}
