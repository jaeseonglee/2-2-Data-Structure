package Number6;
import java.util.Arrays;

public class QuickTest {
	public static void main (String [] args) {
		Quick q = new Quick();
		GenData gd = new  GenData();
		
		int []arr = gd.getRandIntArr(10, 0, 100);
		System.out.println(Arrays.toString(arr));
		q.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
