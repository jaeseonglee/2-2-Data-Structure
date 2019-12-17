package Number3;
import java.util.Arrays;

public class SelectionTest {
	public static void main (String[] args) {
		Selection s = new Selection();
		GenData gd = new  GenData();
		
		int []arr = gd.getRandIntArr(10, 0, 100);
		System.out.println(Arrays.toString(arr));
		s.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
