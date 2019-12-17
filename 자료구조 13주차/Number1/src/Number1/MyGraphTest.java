package Number1;
import java.util.*;

public class MyGraphTest {
	public static void main(String [] args) {
		int[][] adjMatrix = { {0, 1, 0, 2, 0, 0, 0, 0},
							  {1, 0, 4, 3, 1, 6, 0, 0},
							  {0, 4, 0, 0, 0, 1, 1, 2},
							  {2, 3, 0, 0, 5, 0, 0, 0},
							  {0, 1, 0, 5, 0, 0, 2, 0},
							  {0, 6, 1, 0, 0, 0, 0, 9},
							  {0, 0, 1, 0, 2, 0, 0, 1},
							  {0, 0, 2, 0, 0, 9, 1, 0} }; 	// 인접 행렬
		
		AdjList adj = new AdjList(8);						// 인접 리스트 
		adj.addEdge(0, 1, 1);		adj.addEdge(0, 3, 2);
		
		adj.addEdge(1, 0, 1);		adj.addEdge(1, 2, 4);		adj.addEdge(1, 3, 3);
		adj.addEdge(1, 4, 1);		adj.addEdge(1, 5, 6);
		
		adj.addEdge(2, 1, 4);		adj.addEdge(2, 5, 1);		adj.addEdge(2, 6, 1);		adj.addEdge(2, 7, 2);
		adj.addEdge(3, 0, 2);		adj.addEdge(3, 1, 3);		adj.addEdge(3, 4, 5);
		adj.addEdge(4, 1, 1);		adj.addEdge(4, 3, 5);		adj.addEdge(4, 6, 2);
		adj.addEdge(5, 1, 6);		adj.addEdge(5, 2, 1);		adj.addEdge(5, 7, 9);
		adj.addEdge(6, 2, 1);		adj.addEdge(6, 4, 2);		adj.addEdge(6, 7, 1);
		adj.addEdge(7, 2, 2);		adj.addEdge(7, 5, 9);		adj.addEdge(7, 6, 1);
		
		MyGraph mg = new MyGraph();							// MyGraph 생성	
		int[][] newMatrix = mg.getAdjMatrixFromAdjList(adj.getAdjList());	// 인접리스트에서 인접행렬로 변환
		AdjList newAdjList = new AdjList(8);
		newAdjList.setAdjList(mg.getAdjListFromAdjMatrix(adjMatrix));		// 인접행렬에서 인접리스트로 변환
		
		mg.print(newMatrix);			// 출력
		System.out.println();
		System.out.println();
		mg.print(newAdjList.getAdjList());
	}
}
