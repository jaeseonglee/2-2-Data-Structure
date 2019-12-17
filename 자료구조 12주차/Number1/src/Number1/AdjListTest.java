package Number1;
public class AdjListTest {
	public static void main(String []args) {
		AdjList adj = new AdjList(4);
		
		adj.addEdge(0, 1);		adj.addEdge(0, 2);		adj.addEdge(1, 0);		adj.addEdge(1, 2);
		adj.addEdge(1, 3);		adj.addEdge(2, 0);		adj.addEdge(2, 1);		adj.addEdge(2, 3);
		adj.addEdge(3, 1);		adj.addEdge(3, 2);
		adj.print();
	}
}
