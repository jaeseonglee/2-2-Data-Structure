import java.util.Arrays;

public class Q15 {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3},
					 	 { 4, 5, 6},
						 { 7, 8, 9}};
		
		int[][] mat2 = { { 5, 1, 9,11},
				         { 2, 4, 8,10},
				         {13, 3, 6, 7},
				         {15,14,12,16}};
		
		int[][] mat1_rotate = rotateMatrix(mat1);
		int[][] mat2_rotate = rotateMatrix(mat2);
		
		printMatrix(mat1_rotate);
		printMatrix(mat2_rotate);
	}
	public static int[][] rotateMatrix(int[][] m) {
		/*
		 * �Է� : ���(= 2���� �迭). ���� ������ ���� ������ ���� ���� �ְ�, �ٸ� ���� ����.
		 * ��� : ����� �ð�������� 90�� ȸ���� ����� ����
		 * ��)
		 *	�Է� = 
		 *	[
		 *  	[1,2,3],
		 *  	[4,5,6],
		 * 		[7,8,9]
		 *	],
		 *
		 *	��� =
		 *	[
		 * 		[7,4,1],
		 * 		[8,5,2],
		 *		[9,6,3]
		 *	]
		 */
		
		
		/* ���⿡ �� �ڵ带 �ۼ��ϼ��� */
		int res[][] = new int[m.length][m.length];
		for(int i = 0 ; i< m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				res[i][j] = m[ m.length -1 - j ][i];
			}
		}
		
		return res;
		
	}	
	public static void printMatrix(int[][] m) {
		for(int i = 0 ; i < m.length ; i++ )
			System.out.println(Arrays.toString(m[i]));
		System.out.println();
	}
}
