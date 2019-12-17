package Number1;
import java.util.*;

public class AdjList {
	private int N;		// ������ ����
	private List<Edge>[] adjList;	// ��������Ʈ�� ���� �׷���	
	
	public AdjList (int n) {		// ������
		this.N = n;	
		adjList = new List[N];
		for(int i = 0; i < N; i++) {// ������ ������ŭ ���Ḯ��Ʈ�� ����� �ش�
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int vertex, int adjvertex) {	// ���� �߰�
		Edge e = new Edge(adjvertex);
		adjList[vertex].add(e);
	}
	
	public void print() {						// �׷��� ���
		for(int i = 0 ; i< N; i++) {
			System.out.print("[" + i + "]");
			for(Edge e : adjList[i]) {
				System.out.print(" => " + e.adjvertex);
			}
			System.out.println();
		}
	}	
}
