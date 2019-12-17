package Number4;
import java.util.Arrays;

public class InsertionTest {
	public static void main(String[] args) {
		Insertion i = new Insertion();
		GenData gd = new  GenData();
		
		int []arr = gd.getRandIntArr(10, 0, 100);
		System.out.println(Arrays.toString(arr));
		i.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
