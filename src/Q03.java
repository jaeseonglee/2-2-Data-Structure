import java.util.Random;

public class Q03 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * 배열 arr에 저장된 모든 숫자들 중에서
		 * 홀수만 더한 결과를 odd_total에 저장하고
		 * 짝수만 더한 결과를 even_total에 저장하는
		 * 프로그램을 작성
		 */
		int odd_total = 0;
		int even_total = 0;		


		
		/* 여기에 들어갈 코드를 작성하세요 */		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even_total += arr[i];
			}else {
				odd_total += arr[i];
			}
			
		}

				
		// 총합을 터미널에 출력
		System.out.println("모든 홀수의 합 = " + odd_total);
		System.out.println("모든 짝수의 합 = " + even_total);
	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}	
}
