package Number2;

public class BinaryTreeTest {
	public static void main(String [] args) {
		BinaryTree t1 = new BinaryTree();
		t1.insertValue(100); 		t1.insertValue(200);		t1.insertValue(300);		t1.insertValue(400);
		t1.insertValue(500);		t1.insertValue(600);		t1.insertValue(700);		t1.insertValue(800);
		t1.arrayPrint(t1.btree2intarr());	// t1�� ����Ʈ���� �迭�� �ٲٰ� ����Ѵ�
		
		BinaryTree tNew = new BinaryTree();		// Task2
		tNew.intarr2btree(t1.btree2intarr());	// t1���� ������� �迭 ����
		System.out.print("������ȸ : ");
		tNew.levelorder(tNew.getRoot());	// ���� ��ȸ ������� ���
		
	}
}
