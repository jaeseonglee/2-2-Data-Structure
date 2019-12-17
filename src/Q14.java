import java.util.Random;

public class Q14 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		
		System.out.println("���� ū �� ���� �� = " + twoLargestSum(arr));
	}
	public static int twoLargestSum(int[] arr) {
		/*
		 * �Է� : ������ ����� �迭 (�ߺ��� ���� ����. ���ĵǾ� ���� ����)
		 * ��� : �迭���� ���� ū ���� 2���� ��
		 * ��) �Է� : {1,2} => ��� : 3
		 * ��) �Է� : {2,1,2} => ��� : 4
		 * ��) �Է� : {4,2,1,3} => ��� : 7
		 */
		
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
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
