import java.util.Random;

public class Q02 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * �迭 arr�� ����� ��� ���ڸ� ���� ����� total ������
		 * �����ϴ� ���α׷��� �ۼ�.
		 */
		int total = 0;		
		

		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */		
		
		for(int i = 0; arr.length; i++) {
			total += arr[i];
		}
		
		// ������ �͹̳ο� ���
		System.out.println("�� �� = " + total);
	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}
}
