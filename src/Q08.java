import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {
		int[] arr1 = {1,1,2}; // ���ĵ� �迭. �ߺ��� ���� ����
		int[] arr2 = {0,0,1,1,1,2,2,3,3,4};  // ���ĵ� �迭. �ߺ��� ���� ����

		System.out.println("arr1 : ");
		System.out.println("- before : " + Arrays.toString(arr1));
		System.out.println("- after : " + Arrays.toString(cleanup(arr1)));

		System.out.println("arr2 : ");
		System.out.println("- before : " + Arrays.toString(arr2));
		System.out.println("- after : " + Arrays.toString(cleanup(arr2)));
	}
	public static int[] cleanup(int[] arr) {
		/*
		 * ���ĵ� int �迭�� �Է����� �־����ϴ�.
		 * cleanup �Լ��� ���ĵ� �迭���� �ߺ��Ǵ� ���� ������ ���ο� �迭�� �����մϴ�.
		 * ��, �ߺ��� ���� ������ �� �߿��� �Ѱ��� ����� �������� �����մϴ�.
		 * ��) �Է� : {1,1,2} => ��� {1,2}
		 * ��) �Է� : {1,1,2,2} => ��� {1,2}
		 * ��) �Է� : {1,1} => ��� {1}
		 */
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
	
		
		
	}
}
