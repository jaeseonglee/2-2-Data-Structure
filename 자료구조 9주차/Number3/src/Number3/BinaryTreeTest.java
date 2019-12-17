package Number3;
import java.util.*;
public class BinaryTreeTest {
	public static void main(String [] args) {
		BinaryTree tA = new BinaryTree(); // 강의 자료에 있는 것처럼 두 트리 생성
		BinaryTree tB = new BinaryTree();
		
		tA.insertValue(100); 		tA.insertValue(200);		tA.insertValue(300);		tA.insertValue(400);
		tA.insertValue(500);		tA.insertValue(600);		tA.insertValue(700);		tA.insertValue(800);
		
		tB.insertValue(1); 		tB.insertValue(2);		tB.insertValue(3);		tB.insertValue(300);
		tB.insertValue(7);		tB.insertValue(9);		tB.insertValue(70);		tB.insertValue(600);
		tB.insertValue(700);
		
		System.out.print("레벨순회: ");	// tA의 레벨순회
		tA.levelorder(tA.getRoot());
		System.out.println();
		
		System.out.print("레벨순회: ");	// tB의 레벨순회
		tB.levelorder(tB.getRoot());
		System.out.println();
		System.out.println();	// 줄바꿈
		
		LinkedList<Node> list = tA.subTreeCompare(tB); 
		// subTreeCompare메소드를 통해 각각의 두 트리에서 같은 서브트리가 있는지 확인, 리턴된 LinkedList를 저장할 LinkedList를 선언 및 초기화
		
		for(int i = 0; i< list.size(); i++) {	// 반복문을 통해 출력
			System.out.println("Found a matching subtree "+ (i+1) +":");
			tA.levelorder(list.get(i));	// LinkedList의 각 항목에 접근, 각 항목마다 하나의 노드(트리)이므로 레벨순회를 통해 출력
			System.out.println();	// 줄바꿈
		}
	}
}
