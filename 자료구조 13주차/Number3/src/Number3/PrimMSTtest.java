package Number3;
import java.util.*;

public class PrimMSTtest {
	public static void main(String []args) {
		List<Edge>[] adjList = new List[7];
		for(int i = 0; i < 7; i++) { adjList[i] = new LinkedList(); }
		
		adjList[0].add(new Edge(1,9));		adjList[0].add(new Edge(2,10));
		
		adjList[1].add(new Edge(0,9));		adjList[1].add(new Edge(3,10));
		adjList[1].add(new Edge(4,5));		adjList[1].add(new Edge(6,3));
		
		adjList[2].add(new Edge(0,10));		adjList[2].add(new Edge(3,9));
		adjList[2].add(new Edge(4,7));		adjList[2].add(new Edge(5,2));
		
		adjList[3].add(new Edge(1,10));		adjList[3].add(new Edge(2,9));
		adjList[3].add(new Edge(5,4));		adjList[3].add(new Edge(6,8));
		
		adjList[4].add(new Edge(1,5));		adjList[4].add(new Edge(2,7));
		adjList[4].add(new Edge(6,1));
		
		adjList[5].add(new Edge(2,2));		adjList[5].add(new Edge(3,4));
		adjList[5].add(new Edge(6,6));
		
		adjList[6].add(new Edge(1,3));		adjList[6].add(new Edge(3,8));
		adjList[6].add(new Edge(4,1));		adjList[6].add(new Edge(5,6));
		
		PrimMST p = new PrimMST(adjList);
		p.print();
	}
}
