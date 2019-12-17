/**	Q4 : FindPath.java
 *  �ۼ��� : 2019.09.05~06
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �־��� ����(map)�� ��� �������� ������ ã�ư��� ���α׷� 
 * 				����Լ��� ���� ���� ã�� �� �ִ��� �������� �Ǵ��Ѵ�.
 */
import java.util.*;

public class FindPath {		// ������ �ⱸ�� ���� �� �ִ��� �Ǵ��ϴ� FindPath Ŭ����
	public static void main(String [] args) {		// main �޼ҵ�
		// 0000 = no path
		// 1000 = left
		//  100 = right
		//   10 = go up
		//    1 = down
		int [][]map1 = { {	0, 100,0},		// ���� �ڷ��� �־��� ���� 
						 {100,  10,0},
						 { 10,	 0,0}};
		int [][]map2 = { {	0,1000,0},
				 		 {100,  10,0},
				 		 { 10,	 0,0}};
		
		final int NROW = 3;			// �࿭�� ũ���
		final int NCOL = 3;
		final int START_X =0;		// ����������
		final int START_Y =2;
		final int END_X =2;			// ���������� (X,Y)���� 
		final int END_Y =0;			// final�� ���� ����� �������ش�.
		
		if( findPath(map1,NROW,NCOL,START_X,START_Y,END_X,END_Y) == 1 ) System.out.println("I found a path");
		else System.out.println("There is no such a path");
		
		if( findPath(map2,NROW,NCOL,START_X,START_Y,END_X,END_Y) == 1 ) System.out.println("I found a path");
		else System.out.println("There is no such a path");
		// ������ �־��� ������ findPath�޼ҵ带 ���� ����� ����Ѵ�.
	}
	
	public static int findPath(int [][]map,int nRow, int nCol,int startX, int startY,int endX, int endY) {
		// �־��� ����(2���� �迭)�� �ⱸ�� ���� �� �ִ��� ������ �˾Ƴ��� ����Լ�(�޼ҵ�)
		if(map[startY][startX] == 0) {		// ������ 0�� ���� ������ ���� �ּ��� ���� ���� ������ �� �� �ִ�.
			if( (startX == endX) && (startY == endY) ) {  //�׷��ٸ� �������������� Ȯ���ϰ�
				return 1;			// �����ߴٸ� 1(ture)�� ��ȯ,
			} else return 0;		// �ƴ϶�� 0(false)�� ��ȯ�Ѵ�.
		} else if ( startX < 0 || startX  >2 || startY < 0 || startY  >2 ) {
			System.out.println("������ ���!");		// ������ ��Ÿ�� ���� �Ѵ� ��� ������ ����ٰ� ����ϰ�,
			return 0;		// 0�� ��ȯ
		}
		else {		// ���� ���°� �ƴ϶�� ���� ���ǹ��� ������.
			if(map[startY][startX] == 1) {		// �������� ���(1), ���������� ��ĭ ������ ������
				return findPath(map,nRow, nCol,startX, startY+1, endX,endY);// startY���� ������ ��츦 ��ȯ
			}
			if(map[startY][startX] == 10) {		// �ö󰡴� ���(10), ���۽����� ��ĭ �ø��� ������
				return findPath(map,nRow, nCol,startX, startY-1, endX,endY);// startY���� ������ ��츦 ��ȯ
			}
			if(map[startY][startX] == 100) {	// ���������� ���� ���(100), ���������� ��ĭ ���������� ���� ������
				return findPath(map,nRow, nCol,startX+1, startY, endX,endY);// startX���� ������ ��츦 ��ȯ
			}
			if(map[startY][startX] == 1000) {	// �������� ���� ���(1000), ���������� ��ĭ �������� ���� ������
				return findPath(map,nRow, nCol,startX-1, startY, endX,endY);// startX���� ������ ��츦 ��ȯ
			}
		}
		
		return 0;	//�� ���ǹ��� ���� ������ ���� ��ȯ�ϱ� ������ �� �ڵ忡 ���������� ������ ��������� �ʿ��ϱ� ������ �ڵ� 
	}
}
