
public class Q13 {
	public static void main(String[] args) {
		int[] arr1 = {3,2,3};
		int[] arr2 = {2,2,1,1,1,2,2};
		
		System.out.println("arr1 : " + getMajorityElement(arr1));
		System.out.println("arr2 : " + getMajorityElement(arr2));
	}
	public static int getMajorityElement(int[] arr) {
		/*
		 * �Է� : ���� �迭 (���ĵǾ����� ����. �ߺ��Ǵ� ���ڰ� ����)
		 * ��� : �Է� �迭���� ���� ���� �����ϴ� ���ڸ� ��� 
		 *       (���� ���� �����ϴ� ���ڴ� �Ѱ� ���̶�� ����)
		 * ��: {3,2,3}������ ���� 3�� ���� ���� ���� �ϹǷ�, 3�� ����
		 * ��: {2,2,1,1,1,2,2}������ ���� 2�� ���� ���� �����ϹǷ�, 2�� ����
		 */
		
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		int result = 0;
		int num = arr[0];
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
			}
		}
		
		
	}
}
