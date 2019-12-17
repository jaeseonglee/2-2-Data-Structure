package Number3;
import java.util.List;

public class PrimMST {
	int N;				// �׷��� ������ ��
	List<Edge>[] graph;
	
	public PrimMST(List<Edge>[] adjList) {	// ������
		N = adjList.length;
		graph = adjList;
	}
	
	public int[] mst (int s) {		// Prim �˰���, s�� ���� ����
		boolean[] visited = new boolean[N];	// �湮�������� true��
		int[] D = new int [N];
		int[] previous = new int[N];	// �ּҽ���Ʈ���� �������� Ȯ���� �� ������ �ٸ� �� (Ʈ��)����
		for(int i = 0; i < N; i++) {	// �ʱ�ȭ
			visited[i] = false;
			previous[i] = -1;
			D[i] = Integer.MAX_VALUE;	// D[i]�� �ִ����� �ʱ�ȭ
		}
		previous[s] = 0;				// ���� ���� s�� ���� ���� �ʱ�ȭ
		D[s] = 0;
		for(int k = 0; k < N; k++) {	// �湮�ȵ� �������� D���ҵ� �߿��� �ּڰ����� ���� minVertex
			int minVertex = -1;
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < N; j++ ) {
				if((!visited[j]) && (D[j] < min)) {
					min = D[j];
					minVertex = j;
				}
			}
			visited[minVertex] = true;
			for(Edge i : graph[minVertex]) {	// minVertex�� ������ �� ������ D�� ���� ����
				if(!visited[i.adjvertex]) {		// Ʈ���� ���� ���� �ȵ� �����̸�
					int currentDist = D[i.adjvertex];
					int newDist = i.weight;
					if(newDist < currentDist) {
						D[i.adjvertex] = newDist;	// minVertex�� ����� �������� D���� ����
						previous[i.adjvertex] = minVertex;	// Ʈ�� ���� ������ ����
					}
				}
			}
		}
		return previous;		// �ּ� ���� Ʈ�� ���� ���� ����
	}
	
	public void print() {		// prim �˰����� ���� ���� �����  ���
		int result = Integer.MAX_VALUE;	// �ּҽ���Ʈ���� ���� �߾�ġ ��
		int sum = 0;			// result�� ������ �� ����
		int index = 0;			// index���� ������ ����
		int temp[] = new int[N];// mst()�޼ҵ��� ��ȯ���� ������ temp �迭
		
		for(int i = 0 ; i < graph.length; i++ ) {	// ����for���� ���� sum�� ���Ѵ�
			sum = 0;								// �Źݺ����� sum�� �ʱ�ȭ
			temp = mst(i);							// temp�� mst(i)�� ��ȯ�� ����
			for( int j = 0; j < temp.length; j++) {	
				if(j == temp[j]) continue;			// temp[j]�� ����Ű�� ������ ������ �ε����� ���ٸ� continue
				for(int k = 0; k< graph[j].size(); k++) {	
					if(graph[j].get(k).adjvertex == temp[j]) {	// �׷����� ����Ű�� ������ temp[j]�� ����Ű�� ������ ������
						sum += graph[j].get(k).weight;			// �� ����ġ�� sum�� �߰�
					}
				}
			}
			if(result > sum) {			// ������ ��ø �ݺ����� ���� ���� sum���� result���� ������
				result = sum;			// �װ����� �ʱ�ȭ�ϰ�			
				index = i;				// index�� ����
			}
		}	
		temp = mst(index);				// ���� for���� ���� ���� index������ temp�� �ʱ�ȭ
		System.out.println("�ּҽ���Ʈ�� ����");			
		for(int i  = 0 ;  i < temp.length; i++) {
			if(index == i) continue;	// index �������� prim�˰����� �����߱� ������ ����Ϸ��� ������ ������ continue
			System.out.print("(" + i + "," + temp[i] +") ");		// �ּ� ����Ʈ�� ���
		}
		System.out.println("\n\n�ּҽ���Ʈ���� ���� �߾�ġ �� = " + result);	// result ���
	}
}