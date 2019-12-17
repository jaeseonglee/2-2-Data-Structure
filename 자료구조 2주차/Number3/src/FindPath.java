/**	Q4 : FindPath.java
 *  작성일 : 2019.09.05~06
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 주어진 지도(map)의 출발 지점에서 방향을 찾아가는 프로그램 
 * 				재귀함수를 통해 길을 찾을 수 있는지 없는지를 판단한다.
 */
import java.util.*;

public class FindPath {		// 지도가 출구로 나갈 수 있는지 판단하는 FindPath 클래스
	public static void main(String [] args) {		// main 메소드
		// 0000 = no path
		// 1000 = left
		//  100 = right
		//   10 = go up
		//    1 = down
		int [][]map1 = { {	0, 100,0},		// 강의 자료의 주어진 지도 
						 {100,  10,0},
						 { 10,	 0,0}};
		int [][]map2 = { {	0,1000,0},
				 		 {100,  10,0},
				 		 { 10,	 0,0}};
		
		final int NROW = 3;			// 행열의 크기와
		final int NCOL = 3;
		final int START_X =0;		// 시작지점과
		final int START_Y =2;
		final int END_X =2;			// 도착지점의 (X,Y)값을 
		final int END_Y =0;			// final을 통해 상수로 지정해준다.
		
		if( findPath(map1,NROW,NCOL,START_X,START_Y,END_X,END_Y) == 1 ) System.out.println("I found a path");
		else System.out.println("There is no such a path");
		
		if( findPath(map2,NROW,NCOL,START_X,START_Y,END_X,END_Y) == 1 ) System.out.println("I found a path");
		else System.out.println("There is no such a path");
		// 각각의 주어진 지도를 findPath메소드를 통해 결과를 출력한다.
	}
	
	public static int findPath(int [][]map,int nRow, int nCol,int startX, int startY,int endX, int endY) {
		// 주어진 지도(2차원 배열)이 출구로 나갈 수 있는지 없는지 알아내는 재귀함수(메소드)
		if(map[startY][startX] == 0) {		// 지도가 0의 값을 갖으면 위의 주석을 통해 길이 없음을 알 수 있다.
			if( (startX == endX) && (startY == endY) ) {  //그렇다면 도착지점인지를 확인하고
				return 1;			// 도착했다면 1(ture)을 반환,
			} else return 0;		// 아니라면 0(false)를 반환한다.
		} else if ( startX < 0 || startX  >2 || startY < 0 || startY  >2 ) {
			System.out.println("지도를 벗어남!");		// 지도에 나타난 곳을 넘는 경우 지도를 벗어났다고 출력하고,
			return 0;		// 0을 반환
		}
		else {		// 길이 없는게 아니라면 다음 조건문을 따른다.
			if(map[startY][startX] == 1) {		// 내려가는 경우(1), 시작지점을 한칸 내리기 때문에
				return findPath(map,nRow, nCol,startX, startY+1, endX,endY);// startY값의 증가한 경우를 반환
			}
			if(map[startY][startX] == 10) {		// 올라가는 경우(10), 시작시점을 한칸 올리기 때문에
				return findPath(map,nRow, nCol,startX, startY-1, endX,endY);// startY값의 감소한 경우를 반환
			}
			if(map[startY][startX] == 100) {	// 오른쪽으로 가는 경우(100), 시작지점이 한칸 오른쪽으로 가기 때문에
				return findPath(map,nRow, nCol,startX+1, startY, endX,endY);// startX값의 증가한 경우를 반환
			}
			if(map[startY][startX] == 1000) {	// 왼쪽으로 가는 경우(1000), 시작지점이 한칸 왼쪽으로 가기 때문에
				return findPath(map,nRow, nCol,startX-1, startY, endX,endY);// startX값의 감소한 경우를 반환
			}
		}
		
		return 0;	//두 조건문에 따라 각각의 값을 반환하기 때문에 이 코드에 도달하지는 않지만 명시적으로 필요하기 때문에 코딩 
	}
}
