package Number1;
import java.util.*;

public class AdjList {
	private int N;		// 정점의 개수
	private List<Edge>[] adjList;	// 인접리스트를 통한 그래프	
	
	public AdjList (int n) {		// 생성자
		this.N = n;	
		adjList = new List[N];
		for(int i = 0; i < N; i++) {// 정점의 개수만큼 연결리스트를 만들어 준다
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int vertex, int adjvertex) {	// 간선 추가
		Edge e = new Edge(adjvertex);
		adjList[vertex].add(e);
	}
	
	public void print() {						// 그래프 출력
		for(int i = 0 ; i< N; i++) {
			System.out.print("[" + i + "]");
			for(Edge e : adjList[i]) {
				System.out.print(" => " + e.adjvertex);
			}
			System.out.println();
		}
	}	
}
