/**	자료구조 4주차
 * 	Q1 : TimeCalculate.java
 *  작성일 : 2019.09.19 ~ 09.20
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 상수시간,선형시간,제곱시간,세제곱시간,네제곱시간이 각각 소요되는 시간을 계산하여 출력하는 프로그램
 */
public class TimeCalculate {		
	public static void main(String [] args) {
		int[] arr = new int[300];
		for(int i = 0 ; i < arr.length ; i++ ) arr[i] = 0;
		long beforeTime = System.currentTimeMillis();
		//fConstant(arr);
		//fLinear(arr);
		//fQuadratic(arr);
		//fCubic(arr);
		fFourth(arr);
		long afterTime = System.currentTimeMillis();
		long diffTimeMilliSecond = afterTime-beforeTime;
		System.out.println("Time diff (ms): " + diffTimeMilliSecond);

	}
	//1)	상수시간이 소요되는 fConstant(int[] arr) 함수를 구현하세요. 시간을 측정해서 터미널에 출력하세요.
	public static void fConstant(int[] arr) {
		int n = arr.length;
	}
	
	//2)	선형시간이 소요되는 fLinear(int[] arr) 함수를 구현하세요. 시간을 측정해서 터미널에 출력하세요.
	public static void fLinear(int[] arr) {
		int n = 0;
		for(int i=0; i< arr.length; i++) {
			n += arr[i];
		}
	}
	
	//3)	제곱시간이 소요되는 fQuadratic(int[] arr) 함수를 구현하세요. 시간을 측정해서 터미널에 출력하세요.
	public static void fQuadratic(int[] arr) {
		int n =0;
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				n += arr[i];
			}
		}
	}
	
	//4)	세제곱시간이 소요되는 fCubic(int[] arr) 함수를 구현하세요. 시간을 측정해서 터미널에 출력하세요.
	public static void fCubic(int[] arr) {
		int n =0;
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					n += arr[i];
				}
			}
		}
	}
	//5)	네제곱시간이 소요되는 fFourth(int[] arr) 함수를 구현하세요. 시간을 측정해서 터미널에 출력하세요
	public static void fFourth(int[] arr) {
		int n =0;
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					for(int o=0; o<arr.length; o++) {
						n += arr[i];
					}
				}
			}
		}
	}
}
