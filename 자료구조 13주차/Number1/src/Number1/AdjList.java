package Number1;
import java.util.*;
public class AdjList {		// 인접 리스트
	private int N;
	private List<Edge>[] adjList;	// 그래프를 나타내는 List 배열
	public AdjList (int n) {	// 생성자
		this.N = n;
		adjList = new List[N];
		for(int i = 0; i < N; i++ ) {
			adjList[i] = new LinkedList<>();
		}
	}
	public List<Edge>[] getAdjList() { return adjList; }
	public void setAdjList(List<Edge>[] list ) { this.adjList = list; }
	
	public void addEdge(int vertex, int adjvertex, int weight) {	// 간선 추가
		Edge e = new Edge(adjvertex,weight);
		adjList[vertex].add(e);
	}
}
