package Number1;
import java.util.*;

public class MyGraph {
	public int[][] getAdjMatrixFromAdjList(List<Edge>[] l) {	// 인접 리스트에서 인접행렬(2차원 배열)로 변환
		int [][] arr = new int[l.length][l.length];				// 인접리스트의 크기만큼 생성			
		for(int i = 0; i < l.length; i++ ) {					// 중첩 반복문을 통해서
			for(int j = 0; j < l[i].size(); j++) {				// 리스트가 갖고있는 값의 인덱스만 초기화해준다
				arr[i][l[i].get(j).adjvertex] = l[i].get(j).weight;
			}
		}
		return arr;
	}
	
	public List<Edge>[] getAdjListFromAdjMatrix(int[][] m) {// 인접행렬에서 인접 리스트로 변화
		List<Edge>[] adj = new List[m.length];				// 인접행렬의 크기만큼 생성 
		for(int i = 0; i < m.length; i++ ) {				// 중첩 반북문을 통해
			adj[i] = new LinkedList<>();
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] != 0)
					adj[i].add(new Edge(j,m[i][j]));		// 인접 행렬이 갖는 값으로 초기화
			}
		}
		return adj;
	}
	
	public void print(int [][] m) {				// 인접 행렬 출력
		System.out.println("AdjMatrix : ");
		for(int i = 0; i < m.length; i++) {
			System.out.print(m[i][0]);
			for(int j = 1; j < m[i].length; j++) {
				System.out.print(", " + m[i][j]);
			}
			System.out.println();		// 행의 출력이 끝나면 줄바꿈
		}
	}
	
	public void print(List<Edge>[] l) {		// 인접리스트 출력
		System.out.println("AdjList : ");
		for(int i = 0; i < l.length; i++) {
			System.out.print("[" + i + "]");
			for(int j = 0; j < l[i].size(); j++) {		// 각각의 리스트가 갖는 Edge의 값만 출력
				System.out.print(" => " + l[i].get(j).adjvertex + "(" +l[i].get(j).weight + ")" );
			}
			System.out.println();	
		}
	}
}
