package Number5;
import java.util.Arrays;

public class MergeTest {
	public static void main (String [] args) {
		Merge m = new Merge();
		GenData gd = new  GenData();
		
		int []arr = gd.getRandIntArr(10, 0, 100);
		System.out.println(Arrays.toString(arr));
		m.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
