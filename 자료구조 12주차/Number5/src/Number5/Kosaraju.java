/** Q5 : Kosaraju.java, KosarajuTest.java 
 *  �ۼ��� : 2019.11.18 ~ 11.25
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : Kosaraju �˰����� ���� �����Ἲ���� ã�� ���α׷�
 */
package Number5;
import java.util.*;

public class Kosaraju {
	int N;							// �׷����� ���� ��
	boolean[] visited;				// DFS ���� �� �湮���� üũ ��
	List<Integer>[] adjList;		// ��������Ʈ ������  �Է� �׷���
	List<Integer> sequence;			// ���� ���� ������ ���� ����Ʈ
	List<Integer>[] reverseGraph;	// �׷����� ������ ������ ������ �׷���
	public Kosaraju(List<Integer>[] graph) { // ������
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>();
		reverseGraph = new List[N];
		for(int i = 0 ; i < N; i++) visited[i] = false;		// �迭 �ʱ�ȭ
	}
	
	public List<Integer> tsort() {		// ���������� ���� DFS ����
		for(int i = 0; i < N; i++) if(!visited[i]) dfs(i);
		Collections.reverse(sequence);	// sequence�� �������� �����
		return sequence;
	}
	
	public void dfs(int i) {			// DFS ����
		visited[i] = true;
		for(int v : adjList[i]) {		// i�� �湮�� ������ ������ �湮�ؾ��ϴ� �� ���� v�� ����
			if(!visited[v]) dfs(v);
		}
		sequence.add(i);				// i���� �����ϴ� ������ ���̻� �����Ƿ� i�� sequence�� �߰�
	}
	
	private void reverseGraphDfs(int i) {	// ������ �׷����� DFS ����
		visited[i] = true;
		for(int v : reverseGraph[i]) {		// ������ �׷������� i�� �湮�� ������ �湮�ؾ��ϴ� �� ���� v�� ����
			if(!visited[v]) reverseGraphDfs(v);	// ���ȣ��
		}
		System.out.print(i+" ");			// ������ �������� ������ ���� ���
	}
	
	public void kosarajuAlgorithm() {		// kosaraju �˰����� ���� �����Ἲ�� ���
		int cnt = 0;			// ������ ������ ����
		for(int i = 0; i < N; i++) { reverseGraph[i] = new LinkedList<>(); }
		
		for(int i = 0; i < N; i++) {	// �׷����� ������ ����ŭ �ݺ�
			for(int j : adjList[i]) {	// for each �������� ������ ����Ű�� ���� ����
				reverseGraph[j].add(i);	// ������׷����� ����
			}
		}
		System.out.println("�� ���� ����  ���");				// ������ ���� ���
		for(int i = 0 ; i < N; i++) visited[i] = false;	// visited�� �ٽ� false�� �ʱ�ȭ
		for(int i = 0; i < N; i++) {					// �ݺ����� ���� ������ ���� ���
			int j = sequence.get(i);					// tsort�� ���� ���� sequence�� ������ 
			if(!visited[j]) {							// reverseGraph�� ���� ������ �湮
				System.out.print( "["+ ++cnt +"] [");	// �湮 �ȵ� �����鿡 ����
				reverseGraphDfs(j);						// reverseGraphDfs�� ���� ������ ���� ���
				System.out.println("]");
			}
		}
	}
}
