import java.util.Random;

public class Q04 {
	static final int N = 10;
	static final int mySeed = 0;
	static final int RANDMAX = 10;

	public static void main(String[] args) {
		int[] arr = getArr();
		/*
		 * �迭 arr�� ����� ���ڵ� �߿���, 
		 * ������ �� target_sum�� �Ǵ� "���� �ٸ�" �ΰ��� ���ڰ� 
		 * ������ "���� ??�� �Ǵ� �� ���ڰ� �ֽ��ϴ� (?,?)" ��� ����ϰ�,
		 * ���� ������ "���� ??�� �Ǵ�  �� ���ڰ� �����ϴ�." ��� ���
		 * �� ���ڸ� ����Ҷ��� �ݵ�� ���� ���ڰ� ���� ���;���.
		 * ������ �������� ���, �� �߿��� �ϳ��� ���
		 * 
		 * ��) �迭�� {1,2,3}�� ����Ǿ� ����
		 * target_sum = 3�� ���,  "���� 3�� �Ǵ� �� ���ڰ� �ֽ��ϴ� (1,2)" ��� ���
		 * target_sum = 10�� ���, "���� 10�� �Ǵ� �� ���ڰ� �����ϴ�." ��� ���
		 */
		int target_sum = 13;


		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		int cnt = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+ 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target_sum ) {
					if(arr[i] < arr[j]) {
						System.out.println("���� "+ target_sum+"�� �Ǵ� �� ���ڰ� �ֽ��ϴ� ("+ arr[i] +","+arr[j] +")");
					}else {
						System.out.println("���� "+ target_sum+"�� �Ǵ� �� ���ڰ� �ֽ��ϴ� ("+ arr[j] +","+arr[i] +")");
					}
					cnt++;
					break;
				}
			}
			if(cnt != 0) {
				break;
			}
		}
		���� 10�� �Ǵ� �� ���ڰ� �����ϴ�.
		if( cnt ==0) {
			System.out.println("���� "+target_sum+"�� �Ǵ� �� ���ڰ� �����ϴ�.");
		}

	}
	public static int[] getArr() {
		Random r = new Random(mySeed);
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++ ) arr[i] = r.nextInt(RANDMAX);
		return arr;
	}	
}
