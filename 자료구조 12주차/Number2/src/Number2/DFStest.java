package Number2;
import java.util.*;

public class DFStest {
	public static void main(String [] args) {
		
		AdjList adj = new AdjList(10);
		adj.addEdge(0, 2);		adj.addEdge(0, 1);		adj.addEdge(1, 3);		adj.addEdge(1, 0);
		adj.addEdge(2, 3);		adj.addEdge(2, 0);		adj.addEdge(3, 9);		adj.addEdge(3, 8);
		adj.addEdge(3, 2);		adj.addEdge(3, 1);		adj.addEdge(4, 5);		adj.addEdge(5, 7);
		adj.addEdge(5, 6);		adj.addEdge(5, 4);		adj.addEdge(6, 7);		adj.addEdge(6, 5);
		adj.addEdge(8, 3);		adj.addEdge(9, 3);
		
		System.out.println("DFS �湮 ����:");
		DFS dfs =  new DFS(adj.getAdjList());
	}
}
