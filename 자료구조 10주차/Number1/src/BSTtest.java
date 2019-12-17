import java.util.*;
public class BSTtest {
	public static void main(String [] args) {
		BST<Integer, Integer> bst1 = new BST<Integer, Integer>(60, 60);
 		bst1.put(50, 50); 		bst1.put(70, 70);		bst1.put(20, 20);		bst1.put(10, 10); 
 		bst1.put(40, 40); 		bst1.put(25, 25);		bst1.put(45, 45);		bst1.put(30, 30); 		
 		// 1번 bst1 생성 및 트리 구현, 강의자료에 45와 40위치가 바뀐것 같아 40을 먼저 put
 		
		bst1.print();	// 2번,3번 print구현 및 호출
		System.out.println("Searching for 45 yields : "+ bst1.get(45)); // 4번 bst1.get(45) 호출 및 출력
		
		bst1.put(45, 99);	// 5번 호출후 4번 실행
		System.out.println("Searching for 45 yields : "+ bst1.get(45));
	
		System.out.println("Min value : "+ bst1.min());	// 6번 min 호출 및 출력
	
		bst1.deleteMin();	// 7번 deleteMin 호출 및 6번 실행
		System.out.println("Min value : "+ bst1.min());
	
		bst1.delete(25);
		bst1.delete(35);
		bst1.delete(45);
		bst1.print();		// 8번 25,35,45의 키 값을 가지는 노드 삭제 후 print
	}
}
