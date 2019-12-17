package Number1;
import java.util.*;

public class MyGraph {
	public int[][] getAdjMatrixFromAdjList(List<Edge>[] l) {	// ���� ����Ʈ���� �������(2���� �迭)�� ��ȯ
		int [][] arr = new int[l.length][l.length];				// ��������Ʈ�� ũ�⸸ŭ ����			
		for(int i = 0; i < l.length; i++ ) {					// ��ø �ݺ����� ���ؼ�
			for(int j = 0; j < l[i].size(); j++) {				// ����Ʈ�� �����ִ� ���� �ε����� �ʱ�ȭ���ش�
				arr[i][l[i].get(j).adjvertex] = l[i].get(j).weight;
			}
		}
		return arr;
	}
	
	public List<Edge>[] getAdjListFromAdjMatrix(int[][] m) {// ������Ŀ��� ���� ����Ʈ�� ��ȭ
		List<Edge>[] adj = new List[m.length];				// ��������� ũ�⸸ŭ ���� 
		for(int i = 0; i < m.length; i++ ) {				// ��ø �ݺϹ��� ����
			adj[i] = new LinkedList<>();
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] != 0)
					adj[i].add(new Edge(j,m[i][j]));		// ���� ����� ���� ������ �ʱ�ȭ
			}
		}
		return adj;
	}
	
	public void print(int [][] m) {				// ���� ��� ���
		System.out.println("AdjMatrix : ");
		for(int i = 0; i < m.length; i++) {
			System.out.print(m[i][0]);
			for(int j = 1; j < m[i].length; j++) {
				System.out.print(", " + m[i][j]);
			}
			System.out.println();		// ���� ����� ������ �ٹٲ�
		}
	}
	
	public void print(List<Edge>[] l) {		// ��������Ʈ ���
		System.out.println("AdjList : ");
		for(int i = 0; i < l.length; i++) {
			System.out.print("[" + i + "]");
			for(int j = 0; j < l[i].size(); j++) {		// ������ ����Ʈ�� ���� Edge�� ���� ���
				System.out.print(" => " + l[i].get(j).adjvertex + "(" +l[i].get(j).weight + ")" );
			}
			System.out.println();	
		}
	}
}
