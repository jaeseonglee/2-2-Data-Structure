
public class BinaryTreeTest {
	public static void main(String [] args) {
		BinaryTree t1 = new BinaryTree();	// 이진트리 두개 생성
		BinaryTree t2 = new BinaryTree();
		
		// 강의 자료와 같은 구조의 트리를 생성
		t1.insertValue(100); 		t1.insertValue(200);		t1.insertValue(300);		t1.insertValue(400);
		t1.insertValue(500);		t1.insertValue(600);		t1.insertValue(700);		t1.insertValue(800);
		
		t2.insertValue(100);		t2.insertValue(200);		t2.insertValue(300);		t2.insertValue(400);
		t2.insertValue(500);		t2.insertValue(600);		t2.insertValue(700);		t2.insertValue(800);
		
		System.out.println("트리 노드 수 = "+t1.size(t1.getRoot()));
		System.out.println("트리 높이 = "+t1.height(t1.getRoot()));
		System.out.print("전위순회: ");
		t1.preorder(t1.getRoot());
		System.out.println();
		
		System.out.print("중위순회: ");
		t1.inorder(t1.getRoot());
		System.out.println();
		
		System.out.print("후위순회: ");
		t1.postorder(t1.getRoot());
		System.out.println();
		
		System.out.print("레벨순회: ");
		t1.levelorder(t1.getRoot());
		System.out.println();
		
		System.out.print("동일성 검사: ");
		System.out.println( t1.isEqual(t1.getRoot(), t2.getRoot() )); 
	}
}
