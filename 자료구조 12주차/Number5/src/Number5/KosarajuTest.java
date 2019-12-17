package Number5;
import java.util.*;

public class KosarajuTest {
	public static void main(String [] args) {
		List<Integer>[] list = new List[10];
		for(int i = 0; i < 10; i++) { list[i] = new LinkedList<>(); }		
		
		list[0].add(1);		list[0].add(3);		list[1].add(7);		list[2].add(8);
		list[3].add(5); 	list[3].add(6);		list[4].add(1);		list[5].add(1);
		list[5].add(4);		list[6].add(0);		list[7].add(4);		list[8].add(6);
		list[8].add(7); 	list[8].add(9);		list[9].add(2);
		
		Kosaraju k = new Kosaraju(list);
		System.out.println("위상정렬:\n" + k.tsort() + "\n");
		k.kosarajuAlgorithm();
	}
}
