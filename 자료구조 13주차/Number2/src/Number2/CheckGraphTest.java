package Number2;

public class CheckGraphTest {
	public static void main(String [] args) {
		CheckGraph cg = new CheckGraph();
		//[Task 1]
		int graph1[][] = { {0, 2, 3, 0},
						   {7, 0, 0, 4},
						   {6, 0, 0, 9},
						   {0, 1, 3, 0} };
		
		System.out.println("그래프 1 : " + cg.isReverseSame(graph1));
		
		AdjList adj1 = new AdjList(4);
		adj1.addEdge(0, 1, 2);		adj1.addEdge(0, 2, 3);
		adj1.addEdge(1, 0, 7);		adj1.addEdge(1, 3, 4);
		adj1.addEdge(2, 0, 6);		adj1.addEdge(2, 3, 9);
		adj1.addEdge(3, 1, 1);		adj1.addEdge(3, 2, 3);		
		
		System.out.println();
		System.out.println("그래프 1 : " + cg.isReverseSame(adj1.getAdjList()));
		
		//[Task 2]
		int graph2[][] = { {0, 2, 3, 0},
						   {7, 0, 0, 4},
						   {6, 0, 0, 9},
						   {0, 0, 3, 0} };
		
		System.out.println("그래프 2 : " + cg.isReverseSame(graph2));
		
		AdjList adj2 = new AdjList(4);
		adj2.addEdge(0, 1, 2);		adj2.addEdge(0, 2, 3);
		adj2.addEdge(1, 0, 7);		adj2.addEdge(1, 3, 4);
		adj2.addEdge(2, 0, 6);		adj2.addEdge(2, 3, 9);
		adj2.addEdge(3, 2, 3);		
		
		System.out.println();
		System.out.println("그래프 2 : " + cg.isReverseSame(adj2.getAdjList()));
		
		//[Task 3]
		int graph3[][] = { {0, 1, 4, 0},
						   {1, 0, 0, 2},
						   {4, 0, 0, 3},
						   {0, 2, 3, 0} };
		
		System.out.println("그래프 3 : " + cg.isReverseSame(graph3));
		
		AdjList adj3 = new AdjList(4);
		adj3.addEdge(0, 1, 1);		adj3.addEdge(0, 2, 4);
		adj3.addEdge(1, 0, 1);		adj3.addEdge(1, 3, 2);
		adj3.addEdge(2, 0, 4);		adj3.addEdge(2, 3, 3);
		adj3.addEdge(3, 1, 2);		adj3.addEdge(3, 2, 3);		
		
		System.out.println();
		System.out.println("그래프 3 : " + cg.isReverseSame(adj3.getAdjList()));
		

		//[Task 4]
				int graph4[][] = { {0, 1, 4, 0},
								   {1, 0, 0, 2},
								   {4, 0, 0, 3},
								   {0, 2, 3, 0} };
				
				System.out.println("그래프 4 : " + cg.isReverseSame(graph4));
				
				AdjList adj4 = new AdjList(4);
				adj4.addEdge(0, 1, 1);		adj4.addEdge(0, 2, 4);
				adj4.addEdge(1, 0, 1);		adj4.addEdge(1, 3, 2);
				adj4.addEdge(2, 0, 4);		adj4.addEdge(2, 3, 3);
				adj4.addEdge(3, 1, 2);		adj4.addEdge(3, 2, 3);		
				
				System.out.println();
				System.out.println("그래프 4 : " + cg.isReverseSame(adj4.getAdjList()));
		
		
	}
}
