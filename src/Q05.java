import java.util.Random;

public class Q05 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * Q4�� �����ϰ�, ���� target_sum �� �Ǵ� ���� �ٸ� �ΰ��� ���� ã��
		 * ��, �ð� ���⵵�� O(N) �� �Ǿ�� ��.
		 */
		int target_sum = 13;


		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */	
	
		

	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}	
}
