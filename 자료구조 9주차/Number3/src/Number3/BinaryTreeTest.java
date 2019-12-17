package Number3;
import java.util.*;
public class BinaryTreeTest {
	public static void main(String [] args) {
		BinaryTree tA = new BinaryTree(); // ���� �ڷῡ �ִ� ��ó�� �� Ʈ�� ����
		BinaryTree tB = new BinaryTree();
		
		tA.insertValue(100); 		tA.insertValue(200);		tA.insertValue(300);		tA.insertValue(400);
		tA.insertValue(500);		tA.insertValue(600);		tA.insertValue(700);		tA.insertValue(800);
		
		tB.insertValue(1); 		tB.insertValue(2);		tB.insertValue(3);		tB.insertValue(300);
		tB.insertValue(7);		tB.insertValue(9);		tB.insertValue(70);		tB.insertValue(600);
		tB.insertValue(700);
		
		System.out.print("������ȸ: ");	// tA�� ������ȸ
		tA.levelorder(tA.getRoot());
		System.out.println();
		
		System.out.print("������ȸ: ");	// tB�� ������ȸ
		tB.levelorder(tB.getRoot());
		System.out.println();
		System.out.println();	// �ٹٲ�
		
		LinkedList<Node> list = tA.subTreeCompare(tB); 
		// subTreeCompare�޼ҵ带 ���� ������ �� Ʈ������ ���� ����Ʈ���� �ִ��� Ȯ��, ���ϵ� LinkedList�� ������ LinkedList�� ���� �� �ʱ�ȭ
		
		for(int i = 0; i< list.size(); i++) {	// �ݺ����� ���� ���
			System.out.println("Found a matching subtree "+ (i+1) +":");
			tA.levelorder(list.get(i));	// LinkedList�� �� �׸� ����, �� �׸񸶴� �ϳ��� ���(Ʈ��)�̹Ƿ� ������ȸ�� ���� ���
			System.out.println();	// �ٹٲ�
		}
	}
}
