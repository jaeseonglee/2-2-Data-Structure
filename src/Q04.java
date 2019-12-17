import java.util.Random;

public class Q04 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * 배열 arr에 저장된 숫자들 중에서, 
		 * 더했을 때 target_sum이 되는 "서로 다른" 두개의 숫자가 
		 * 있으면 "합이 ??이 되는 두 숫자가 있습니다 (?,?)" 라고 출력하고,
		 * 만약 없으면 "합이 ??이 되는  두 숫자가 없습니다." 라고 출력
		 * 두 숫자를 출력할때는 반드시 작은 숫자가 먼저 나와야함.
		 * 정답이 여러개인 경우, 그 중에서 하나만 출력
		 * 
		 * 예) 배열에 {1,2,3}이 저장되어 있음
		 * target_sum = 3인 경우,  "합이 3이 되는 두 숫자가 있습니다 (1,2)" 라고 출력
		 * target_sum = 10인 경우, "합이 10이 되는 두 숫자가 없습니다." 라고 출력
		 */
		int target_sum = 13;


		
		/* 여기에 들어갈 코드를 작성하세요 */
		int cnt = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+ 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target_sum ) {
					if(arr[i] < arr[j]) {
						System.out.println("합이 "+ target_sum+"이 되는 두 숫자가 있습니다 ("+ arr[i] +","+arr[j] +")");
					}else {
						System.out.println("합이 "+ target_sum+"이 되는 두 숫자가 있습니다 ("+ arr[j] +","+arr[i] +")");
					}
					cnt++;
					break;
				}
			}
			if(cnt != 0) {
				break;
			}
		}
		합이 10이 되는 두 숫자가 없습니다.
		if( cnt ==0) {
			System.out.println("합이 "+target_sum+"이 되는 두 숫자가 없습니다.");
		}

	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}	
}
