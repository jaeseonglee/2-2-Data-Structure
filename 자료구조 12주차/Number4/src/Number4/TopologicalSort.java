/** Q4 : TopologicalSort.java, TopologicalSortTest.java 
 *  �ۼ��� : 2019.11.18 ~ 11.25
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ���������� ��Ÿ�� ���α׷�. ������ ����� �־��� �� ������ ���������� �˾ƾ��ϹǷ� ��������Ʈ��
 *				�� �������� �����ϴ� �������� ����Ʈ�� �ٲپ����
 */
package Number4;
import java.util.*;

public class TopologicalSort {
	int N;							// �׷����� ���� ��
	boolean[] visited;				// DFS ���� �� �湮���� üũ ��
	List<Integer>[] adjList;		// ��������Ʈ ������  �Է� �׷���
	List<Integer> sequence;			// ���� ���� ������ ���� ����Ʈ
	public TopologicalSort(List<Integer>[] graph) { // ������
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>();
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
}
