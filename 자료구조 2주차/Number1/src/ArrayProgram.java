/**	자료구조 2주차
 * 	Q2 : ArrayProgram.java
 *  작성일 : 2019.09.05~06
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 1부터 100까지 순차적으로 저장된 배열 생성 및 
 * 				그 배열에서 입력받은 정수를 서로 다른 3개의 숫자의 합으로 나타내는 프로그램 
 * 				하나만의 결과 출력과 여러 결과 출력 조정 가능.
 */

import java.util.*;		// Scanner 사용을 위한 라이브러리

public class ArrayProgram {						// ArrayProgram 클래스
	public static void main(String []args) {	// main 메소드
		Scanner input = new Scanner(System.in);	// Scanner 변수 생성
		int [] arr = new int[100];				// 1부터 100까지 저장하기 위한 배열 생성 
		int num =0;								// 입력받을 int형 변수 num 생성 및 0으로 초기화
		
		for(int i =0; i< arr.length; i++) {		// for문을 통해 배열에 1부터 100까지 초기화 
			arr[i] = i+1;
		}
		System.out.println("입력받은 정수가 서로 다른 3개의 정수의 합을 구하는 프로그램!!");
		System.out.print("정수를 입력해주세요 : ");	// 정수를 입력해달라고 출력
		num = input.nextInt();					// 키보드로부터 정수를 입력받는다.	
		
		findResult(arr,num);					// findResult 메소드를 통해 결과 출력
	}
	
	public static void findResult(int []arr, int num ) {// 배열과 정수를 매개변수로 갖는 findResult 메소드
														// 출력만 하기 때문에 void형으로 선언
		int count = 0;								// count가 증가하지 않으면 답을 찾지 못했다고 출력
		outer_loop:									// 하나만의 결과를 출력하기 위해 3중 for문을 한번에 빠져나갈 outer_loop 지정
		for(int i = num; i > 1; i--) {				
			for(int j = i-1; j > 1; j--) {			// 3중 for문을 통해 입력받은 정수를 이루는 서로 다른 정수 3개를 탐색
				for(int k = j-1; k >= 1; k--) {
					if( (arr[i-1] + arr[j-1] + arr[k-1] ) == num) {	// 서로 다른 정수 3개를 찾으면
						System.out.println( arr[i-1] +" "+ arr[j-1] +" " + arr[k-1]+"의 합은 "+ num +" 입니다.");
						count++;					// 그 정수들을 출력과 함께 count 증가
									// 답이 항상 1과 2와 나머지 숫자로 출력되기 때문에
						//break;	// 여기서 선언되는 break를 통해 하나만의 결과가 아닌 여러 값을 보고 싶을때는 주석처리를 해제한다.
						break outer_loop;			// if문을 통해 답을 출력하면 3중 for문을 빠져나가기 위해 반복 종료 
					}
				}
			}
		}
		
		if(count == 0) {System.out.println(num+"의 값을 서로 다른 3개의 정수의 합으로 찾지 못했습니다.");}
		// 모든 반복문이 끝나더라도 답을 찾지 못해서 count값이 증가하지 않았다면 답을 찾지 못했다고 출력
		// 5이하의 정수는 이 조건문에 해당되어 출력된다.
	}
	
}
