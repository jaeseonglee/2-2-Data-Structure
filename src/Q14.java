import java.util.Random;

public class Q14 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		
		System.out.println("가장 큰 두 수의 합 = " + twoLargestSum(arr));
	}
	public static int twoLargestSum(int[] arr) {
		/*
		 * 입력 : 정수가 저장된 배열 (중복된 값이 있음. 정렬되어 있지 않음)
		 * 출력 : 배열에서 가장 큰 숫자 2개의 합
		 * 예) 입력 : {1,2} => 출력 : 3
		 * 예) 입력 : {2,1,2} => 출력 : 4
		 * 예) 입력 : {4,2,1,3} => 출력 : 7
		 */
		
		
		
		/* 여기에 들어갈 코드를 작성하세요 */
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j++) {
				if( arr[i] > arr[j]) {
					int tenp = arr[j];
					arr[j] = arr[i];
					arr[i] = arr[j];
				}
			}
		}
		
		return arr[arr.length] + arr[arr.length -1];
	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}
}
