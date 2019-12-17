import java.util.Random;

public class Q03 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * �迭 arr�� ����� ��� ���ڵ� �߿���
		 * Ȧ���� ���� ����� odd_total�� �����ϰ�
		 * ¦���� ���� ����� even_total�� �����ϴ�
		 * ���α׷��� �ۼ�
		 */
		int odd_total = 0;
		int even_total = 0;		


		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even_total += arr[i];
			}else {
				odd_total += arr[i];
			}
			
		}

				
		// ������ �͹̳ο� ���
		System.out.println("��� Ȧ���� �� = " + odd_total);
		System.out.println("��� ¦���� �� = " + even_total);
	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}	
}
