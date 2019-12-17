package Number2;

public class BinaryTreeTest {
	public static void main(String [] args) {
		BinaryTree t1 = new BinaryTree();
		t1.insertValue(100); 		t1.insertValue(200);		t1.insertValue(300);		t1.insertValue(400);
		t1.insertValue(500);		t1.insertValue(600);		t1.insertValue(700);		t1.insertValue(800);
		t1.arrayPrint(t1.btree2intarr());	// t1의 이진트리를 배열로 바꾸고 출력한다
		
		BinaryTree tNew = new BinaryTree();		// Task2
		tNew.intarr2btree(t1.btree2intarr());	// t1으로 만들어진 배열 전달
		System.out.print("레벨순회 : ");
		tNew.levelorder(tNew.getRoot());	// 레벨 순회 방식으로 출력
		
	}
}
