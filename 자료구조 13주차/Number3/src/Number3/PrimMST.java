package Number3;
import java.util.List;

public class PrimMST {
	int N;				// 그래프 정점의 수
	List<Edge>[] graph;
	
	public PrimMST(List<Edge>[] adjList) {	// 생성자
		N = adjList.length;
		graph = adjList;
	}
	
	public int[] mst (int s) {		// Prim 알고리즘, s는 시작 정점
		boolean[] visited = new boolean[N];	// 방문한정점은 true로
		int[] D = new int [N];
		int[] previous = new int[N];	// 최소신장트리의 간선으로 확정될 때 간선의 다른 쪽 (트리)끝점
		for(int i = 0; i < N; i++) {	// 초기화
			visited[i] = false;
			previous[i] = -1;
			D[i] = Integer.MAX_VALUE;	// D[i]를 최댓값으로 초기화
		}
		previous[s] = 0;				// 시작 정점 s의 관련 정보 초기화
		D[s] = 0;
		for(int k = 0; k < N; k++) {	// 방문안된 정점들의 D원소들 중에서 최솟값가진 정점 minVertex
			int minVertex = -1;
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < N; j++ ) {
				if((!visited[j]) && (D[j] < min)) {
					min = D[j];
					minVertex = j;
				}
			}
			visited[minVertex] = true;
			for(Edge i : graph[minVertex]) {	// minVertex에 인접한 각 정점의 D의 원소 갱신
				if(!visited[i.adjvertex]) {		// 트리에 아직 포함 안된 정점이면
					int currentDist = D[i.adjvertex];
					int newDist = i.weight;
					if(newDist < currentDist) {
						D[i.adjvertex] = newDist;	// minVertex의 연결된 정점들의 D원소 갱신
						previous[i.adjvertex] = minVertex;	// 트리 간선 추출을 위해
					}
				}
			}
		}
		return previous;		// 최소 신장 트리 간선 정보 리턴
	}
	
	public void print() {		// prim 알고리즘을 통해 얻은 결과를  출력
		int result = Integer.MAX_VALUE;	// 최소신장트리의 간선 중앙치 합
		int sum = 0;			// result에 저장할 합 변수
		int index = 0;			// index값을 저장할 변수
		int temp[] = new int[N];// mst()메소드의 반환값을 저장할 temp 배열
		
		for(int i = 0 ; i < graph.length; i++ ) {	// 삼중for문을 통해 sum을 구한다
			sum = 0;								// 매반복마다 sum을 초기화
			temp = mst(i);							// temp에 mst(i)의 반환값 저장
			for( int j = 0; j < temp.length; j++) {	
				if(j == temp[j]) continue;			// temp[j]가 가리키는 정점이 현재의 인덱스와 같다면 continue
				for(int k = 0; k< graph[j].size(); k++) {	
					if(graph[j].get(k).adjvertex == temp[j]) {	// 그래프가 가리키는 정점과 temp[j]가 가리키는 정점이 같으면
						sum += graph[j].get(k).weight;			// 그 가중치를 sum에 추가
					}
				}
			}
			if(result > sum) {			// 안쪽의 중첩 반복문을 통해 얻은 sum값이 result보다 작으면
				result = sum;			// 그값으로 초기화하고			
				index = i;				// index를 저장
			}
		}	
		temp = mst(index);				// 삼중 for문을 통해 얻은 index값으로 temp를 초기화
		System.out.println("최소신장트리 간선");			
		for(int i  = 0 ;  i < temp.length; i++) {
			if(index == i) continue;	// index 정점에서 prim알고리즘을 시작했기 때문에 출력하려는 정점이 같으면 continue
			System.out.print("(" + i + "," + temp[i] +") ");		// 최소 신장트리 출력
		}
		System.out.println("\n\n최소신장트리의 간선 중앙치 합 = " + result);	// result 출력
	}
}