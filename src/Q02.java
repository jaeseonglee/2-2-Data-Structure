import java.util.Random;

public class Q02 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * 배열 arr에 저장된 모든 숫자를 더한 결과를 total 변수에
		 * 저장하는 프로그램을 작성.
		 */
		int total = 0;		
		

		
		/* 여기에 들어갈 코드를 작성하세요 */		
		
		for(int i = 0; arr.length; i++) {
			total += arr[i];
		}
		
		// 총합을 터미널에 출력
		System.out.println("총 합 = " + total);
	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}
}
