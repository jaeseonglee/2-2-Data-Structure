package Number2;

import java.util.*;

public class CheckGraph {
	public boolean isReverseSame(int[][] G) {	// 인접 행렬을 뒤집을 경우 
		boolean result = true;					// 결과값 선언 및 초기화
		int reverseArr[][] = new int[G.length][G[0].length]; 	// GR를 나타내는 인접행렬
		
		System.out.println("G : ");				// 그래프 G 출력
		for(int i = 0 ; i < G.length; i++) {
			System.out.print(G[i][0]);
			for(int j = 1; j < G[i].length; j++) {
				System.out.print(", " + G[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < reverseArr.length; i++) {		// GR를 구하는 중첩 반복문
			for(int j = 0; j < reverseArr[0].length; j++) {
				reverseArr[i][j] = G[j][i];
			}
		}
		
		System.out.println("\nGR : ");				// 그래프 GR출력
		for(int i = 0 ; i < reverseArr.length; i++) {
			System.out.print(reverseArr[i][0]);
			for(int j = 1; j < reverseArr[i].length; j++) {
				System.out.print(", " + reverseArr[i][j]);
				if(reverseArr[i][j] != G[i][j]) { result = false; }	// 그래프 GR를 출력하면서 조건을 확인한다
			}
			System.out.println();
		}
		System.out.println();
		return result;				// 반복문을 통해 얻은 결과 반환
	}
	
	public boolean isReverseSame (List<Edge>[] G) {	// 인접 리스트를 뒤집을 경우
		boolean result = true;						// 결과값 선언 및 초기화
		List<Edge>[] reverseList = new List[G.length];	// 인접 리스트 선언 및
		for(int i = 0 ; i < G.length; i++) { reverseList[i] = new LinkedList<>(); } // 각각의 인덱스에 대해 초기화 
		
		System.out.println("G : ");					// 그래프 G 출력
		for(int i = 0 ; i < G.length; i++) {
			System.out.print("[" + (i + 1) + "]");	// 주어진 그래프의 정점들이 1~4까지이므로 출력에서는 +1 해준다
			for(int j = 0; j < G[i].size(); j++) {	
				System.out.print(" => " + (G[i].get(j).adjvertex + 1) + "(" +G[i].get(j).weight + ")" );
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < G.length; i++) {			// GR를 구하는 중첩 반복문
			for(int j = 0; j < G[i].size(); j++) {
				reverseList[G[i].get(j).adjvertex ].add(new Edge(i, G[i].get(j).weight) ); 
			}
		}
		
		// 인접 리스트의 경우 뒤집었을 경우 각각의 리스트의 길이 변하는 경우가 존재하기 때문에 인접 행렬로 결과값 계산
		int [][] tempArr1 = new int[G.length][G.length];					
		for(int i = 0; i < tempArr1.length; i++ ) {					
			for(int j = 0; j < G[i].size(); j++) { tempArr1[i][j] = G[i].get(j).weight;	}
		}
		int [][] tempArr2 = new int[reverseList.length][reverseList.length];					
		for(int i = 0; i < tempArr1.length; i++ ) {					
			for(int j = 0; j < reverseList[i].size(); j++) {
				tempArr2[i][j] = reverseList[i].get(j).weight;
				if(tempArr1[i][j] != tempArr2[i][j]) {
					result = false;
					break;
				}
			}
		}
		
		System.out.println("\nGR : ");						// 그래프 GR출력
		for(int i = 0 ; i < reverseList.length; i++) {
			System.out.print("[" + (i + 1) + "]");			// 주어진 그래프의 정점들이 1~4까지이므로 출력에서는 +1 해준다
			for(int j = 0; j < reverseList[i].size(); j++) {
				System.out.print(" => " + (reverseList[i].get(j).adjvertex + 1)+"(" +reverseList[i].get(j).weight + ")");
			}
			System.out.println();
		}
		System.out.println();
		return result;
	}
}
