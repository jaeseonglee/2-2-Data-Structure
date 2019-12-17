package Number1;
import java.util.*;
public class AdjList {		// ���� ����Ʈ
	private int N;
	private List<Edge>[] adjList;	// �׷����� ��Ÿ���� List �迭
	public AdjList (int n) {	// ������
		this.N = n;
		adjList = new List[N];
		for(int i = 0; i < N; i++ ) {
			adjList[i] = new LinkedList<>();
		}
	}
	public List<Edge>[] getAdjList() { return adjList; }
	public void setAdjList(List<Edge>[] list ) { this.adjList = list; }
	
	public void addEdge(int vertex, int adjvertex, int weight) {	// ���� �߰�
		Edge e = new Edge(adjvertex,weight);
		adjList[vertex].add(e);
	}
}
