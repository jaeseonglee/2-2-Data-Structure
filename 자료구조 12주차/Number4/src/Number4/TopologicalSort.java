/** Q4 : TopologicalSort.java, TopologicalSortTest.java 
 *  작성일 : 2019.11.18 ~ 11.25
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 위상정렬을 나타낸 프로그램. 역방향 방법은 주어진 각 정점의 집입차수를 알아야하므로 인접리스트를
 *				각 정점으로 집입하는 정점들의 리스트로 바꾸어야함
 */
package Number4;
import java.util.*;

public class TopologicalSort {
	int N;							// 그래프의 정점 수
	boolean[] visited;				// DFS 수행 중 방문여부 체크 용
	List<Integer>[] adjList;		// 인접리스트 형태의  입력 그래프
	List<Integer> sequence;			// 위상 정렬 순서를 담을 리스트
	public TopologicalSort(List<Integer>[] graph) { // 생성자
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>();
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
}
