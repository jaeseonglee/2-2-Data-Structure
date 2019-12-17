package Number2;
import java.util.*;

public class AdjList{
	private int N;		// ������ ����
	private List<Edge>[] adjList;	// ��������Ʈ�� ���� �׷���	
	
	public AdjList (int n) {		// ������
		this.N = n;	
		adjList = new List[N];
		for(int i = 0; i < N; i++) {// ������ ������ŭ ���Ḯ��Ʈ�� ����� �ش�
			adjList[i] = new LinkedList<>();
		}
	}
	public List<Edge>[] getAdjList() { return adjList; }
	
	public void addEdge(int vertex, int adjvertex) {	// ���� �߰�
		Edge e = new Edge(adjvertex);
		adjList[vertex].add(e);
	}
}