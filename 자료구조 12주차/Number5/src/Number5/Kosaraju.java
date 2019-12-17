/** Q5 : Kosaraju.java, KosarajuTest.java 
 *  작성일 : 2019.11.18 ~ 11.25
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : Kosaraju 알고리즘을 통해 강연결성분을 찾는 프로그램
 */
package Number5;
import java.util.*;

public class Kosaraju {
	int N;							// 그래프의 정점 수
	boolean[] visited;				// DFS 수행 중 방문여부 체크 용
	List<Integer>[] adjList;		// 인접리스트 형태의  입력 그래프
	List<Integer> sequence;			// 위상 정렬 순서를 담을 리스트
	List<Integer>[] reverseGraph;	// 그래프의 순서를 뒤집어 저정할 그래프
	public Kosaraju(List<Integer>[] graph) { // 생성자
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>();
		reverseGraph = new List[N];
		for(int i = 0 ; i < N; i++) visited[i] = false;		// 배열 초기화
	}
	
	public List<Integer> tsort() {		// 위상정렬을 위한 DFS 수행
		for(int i = 0; i < N; i++) if(!visited[i]) dfs(i);
		Collections.reverse(sequence);	// sequence를 역순으로 만들기
		return sequence;
	}
	
	public void dfs(int i) {			// DFS 수행
		visited[i] = true;
		for(int v : adjList[i]) {		// i의 방문이 끝나고 앞으로 방문해야하는 각 정점 v에 대해
			if(!visited[v]) dfs(v);
		}
		sequence.add(i);				// i에서 진출하는 간선이 더이상 없으므로 i를 sequence에 추가
	}
	
	private void reverseGraphDfs(int i) {	// 역방향 그래프를 DFS 수행
		visited[i] = true;
		for(int v : reverseGraph[i]) {		// 역방향 그래프에서 i의 방문이 끝나고 방문해야하는 각 정점 v에 대해
			if(!visited[v]) reverseGraphDfs(v);	// 재귀호출
		}
		System.out.print(i+" ");			// 강연결 성분으로 구성된 정점 출력
	}
	
	public void kosarajuAlgorithm() {		// kosaraju 알고리즘을 통해 강연결성분 출력
		int cnt = 0;			// 강연결 성분의 개수
		for(int i = 0; i < N; i++) { reverseGraph[i] = new LinkedList<>(); }
		
		for(int i = 0; i < N; i++) {	// 그래프의 정점의 수만큼 반복
			for(int j : adjList[i]) {	// for each 구문으로 정점이 가리키는 값에 대해
				reverseGraph[j].add(i);	// 역방향그래프를 구성
			}
		}
		System.out.println("강 연결 성분  출력");				// 강연결 성분 출력
		for(int i = 0 ; i < N; i++) visited[i] = false;	// visited를 다시 false로 초기화
		for(int i = 0; i < N; i++) {					// 반복문을 통해 강연결 성분 출력
			int j = sequence.get(i);					// tsort를 통해 얻은 sequence를 가지고 
			if(!visited[j]) {							// reverseGraph에 대해 정점을 방문
				System.out.print( "["+ ++cnt +"] [");	// 방문 안된 정점들에 접근
				reverseGraphDfs(j);						// reverseGraphDfs를 통해 강연결 성분 출력
				System.out.println("]");
			}
		}
	}
}
