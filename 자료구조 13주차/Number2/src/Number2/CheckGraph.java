package Number2;

import java.util.*;

public class CheckGraph {
	public boolean isReverseSame(int[][] G) {	// ���� ����� ������ ��� 
		boolean result = true;					// ����� ���� �� �ʱ�ȭ
		int reverseArr[][] = new int[G.length][G[0].length]; 	// GR�� ��Ÿ���� �������
		
		System.out.println("G : ");				// �׷��� G ���
		for(int i = 0 ; i < G.length; i++) {
			System.out.print(G[i][0]);
			for(int j = 1; j < G[i].length; j++) {
				System.out.print(", " + G[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < reverseArr.length; i++) {		// GR�� ���ϴ� ��ø �ݺ���
			for(int j = 0; j < reverseArr[0].length; j++) {
				reverseArr[i][j] = G[j][i];
			}
		}
		
		System.out.println("\nGR : ");				// �׷��� GR���
		for(int i = 0 ; i < reverseArr.length; i++) {
			System.out.print(reverseArr[i][0]);
			for(int j = 1; j < reverseArr[i].length; j++) {
				System.out.print(", " + reverseArr[i][j]);
				if(reverseArr[i][j] != G[i][j]) { result = false; }	// �׷��� GR�� ����ϸ鼭 ������ Ȯ���Ѵ�
			}
			System.out.println();
		}
		System.out.println();
		return result;				// �ݺ����� ���� ���� ��� ��ȯ
	}
	
	public boolean isReverseSame (List<Edge>[] G) {	// ���� ����Ʈ�� ������ ���
		boolean result = true;						// ����� ���� �� �ʱ�ȭ
		List<Edge>[] reverseList = new List[G.length];	// ���� ����Ʈ ���� ��
		for(int i = 0 ; i < G.length; i++) { reverseList[i] = new LinkedList<>(); } // ������ �ε����� ���� �ʱ�ȭ 
		
		System.out.println("G : ");					// �׷��� G ���
		for(int i = 0 ; i < G.length; i++) {
			System.out.print("[" + (i + 1) + "]");	// �־��� �׷����� �������� 1~4�����̹Ƿ� ��¿����� +1 ���ش�
			for(int j = 0; j < G[i].size(); j++) {	
				System.out.print(" => " + (G[i].get(j).adjvertex + 1) + "(" +G[i].get(j).weight + ")" );
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < G.length; i++) {			// GR�� ���ϴ� ��ø �ݺ���
			for(int j = 0; j < G[i].size(); j++) {
				reverseList[G[i].get(j).adjvertex ].add(new Edge(i, G[i].get(j).weight) ); 
			}
		}
		
		// ���� ����Ʈ�� ��� �������� ��� ������ ����Ʈ�� ���� ���ϴ� ��찡 �����ϱ� ������ ���� ��ķ� ����� ���
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
		
		System.out.println("\nGR : ");						// �׷��� GR���
		for(int i = 0 ; i < reverseList.length; i++) {
			System.out.print("[" + (i + 1) + "]");			// �־��� �׷����� �������� 1~4�����̹Ƿ� ��¿����� +1 ���ش�
			for(int j = 0; j < reverseList[i].size(); j++) {
				System.out.print(" => " + (reverseList[i].get(j).adjvertex + 1)+"(" +reverseList[i].get(j).weight + ")");
			}
			System.out.println();
		}
		System.out.println();
		return result;
	}
}
