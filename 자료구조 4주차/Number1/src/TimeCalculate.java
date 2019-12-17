/**	�ڷᱸ�� 4����
 * 	Q1 : TimeCalculate.java
 *  �ۼ��� : 2019.09.19 ~ 09.20
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ����ð�,�����ð�,�����ð�,�������ð�,�������ð��� ���� �ҿ�Ǵ� �ð��� ����Ͽ� ����ϴ� ���α׷�
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
	//1)	����ð��� �ҿ�Ǵ� fConstant(int[] arr) �Լ��� �����ϼ���. �ð��� �����ؼ� �͹̳ο� ����ϼ���.
	public static void fConstant(int[] arr) {
		int n = arr.length;
	}
	
	//2)	�����ð��� �ҿ�Ǵ� fLinear(int[] arr) �Լ��� �����ϼ���. �ð��� �����ؼ� �͹̳ο� ����ϼ���.
	public static void fLinear(int[] arr) {
		int n = 0;
		for(int i=0; i< arr.length; i++) {
			n += arr[i];
		}
	}
	
	//3)	�����ð��� �ҿ�Ǵ� fQuadratic(int[] arr) �Լ��� �����ϼ���. �ð��� �����ؼ� �͹̳ο� ����ϼ���.
	public static void fQuadratic(int[] arr) {
		int n =0;
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				n += arr[i];
			}
		}
	}
	
	//4)	�������ð��� �ҿ�Ǵ� fCubic(int[] arr) �Լ��� �����ϼ���. �ð��� �����ؼ� �͹̳ο� ����ϼ���.
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
	//5)	�������ð��� �ҿ�Ǵ� fFourth(int[] arr) �Լ��� �����ϼ���. �ð��� �����ؼ� �͹̳ο� ����ϼ���
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
