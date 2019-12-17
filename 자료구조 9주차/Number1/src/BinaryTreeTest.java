
public class BinaryTreeTest {
	public static void main(String [] args) {
		BinaryTree t1 = new BinaryTree();	// ����Ʈ�� �ΰ� ����
		BinaryTree t2 = new BinaryTree();
		
		// ���� �ڷ�� ���� ������ Ʈ���� ����
		t1.insertValue(100); 		t1.insertValue(200);		t1.insertValue(300);		t1.insertValue(400);
		t1.insertValue(500);		t1.insertValue(600);		t1.insertValue(700);		t1.insertValue(800);
		
		t2.insertValue(100);		t2.insertValue(200);		t2.insertValue(300);		t2.insertValue(400);
		t2.insertValue(500);		t2.insertValue(600);		t2.insertValue(700);		t2.insertValue(800);
		
		System.out.println("Ʈ�� ��� �� = "+t1.size(t1.getRoot()));
		System.out.println("Ʈ�� ���� = "+t1.height(t1.getRoot()));
		System.out.print("������ȸ: ");
		t1.preorder(t1.getRoot());
		System.out.println();
		
		System.out.print("������ȸ: ");
		t1.inorder(t1.getRoot());
		System.out.println();
		
		System.out.print("������ȸ: ");
		t1.postorder(t1.getRoot());
		System.out.println();
		
		System.out.print("������ȸ: ");
		t1.levelorder(t1.getRoot());
		System.out.println();
		
		System.out.print("���ϼ� �˻�: ");
		System.out.println( t1.isEqual(t1.getRoot(), t2.getRoot() )); 
	}
}
