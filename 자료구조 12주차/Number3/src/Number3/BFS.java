package Number3;
import java.util.*;

public class BFS {
	int N;				// �׷��� ������ ��
	List<Edge>[] graph;
	private boolean [] visited;			// BFS ������ �湮�� ������ ���Ҹ� true�� �����.
	public BFS(List <Edge>[] adjList) { // ������
		N = adjList.length;
		graph = adjList;
		visited = new boolean [N];
		for(int i = 0; i < N; i++) visited[i] = false;		// �迭 �ʱ�ȭ
		for(int i = 0; i < N; i++) if (!visited[i]) bfs(i);
	}
	
	private void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();	// ť ����
		visited[i] = true;
		q.add(i);			// ť�� ���� ���� s�� ����
		while(!q.isEmpty()) {
			int j = q.remove();		// ť���� ���� j�� ������
			System.out.print(j+" ");
			for(Edge e : graph[j]) {// ���� j�� ������ ������ �� �湮 �ȵ� ���� �ϳ��� �湮
				if(!visited[e.adjvertex]) {
					visited[e.adjvertex] = true;
					q.add(e.adjvertex);		// ������ �湮�� ������ ť�� ����
				}
			}
		}
	}
}
