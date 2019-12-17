import java.util.Random;

public class Q05 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * Q4와 동일하게, 합이 target_sum 이 되는 서로 다른 두개의 숫자 찾기
		 * 단, 시간 복잡도가 O(N) 이 되어야 함.
		 */
		int target_sum = 13;


		
		/* 여기에 들어갈 코드를 작성하세요 */	
	
		

	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}	
}
