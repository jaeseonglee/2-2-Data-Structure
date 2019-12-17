package Number4;
import java.util.*;

public class TopologicalSortTest {
	public static void main(String [] args) {
		List<Integer>[] list = new List[9];
		for(int i = 0; i < 9; i++) { list[i] = new LinkedList<>(); }
		
		list[0].add(1);		list[2].add(0);		list[2].add(1);		list[1].add(3);
		list[1].add(4);		list[4].add(5);		list[5].add(3);		list[5].add(7);
		list[3].add(6);		list[6].add(7);		list[7].add(8);
		
		TopologicalSort tSort = new TopologicalSort(list);
		System.out.println("위상정렬:\n" + tSort.tsort());
	}
}
