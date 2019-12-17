import java.util.*;
public class BSTtest {
	public static void main(String [] args) {
		BST<Integer, Integer> bst1 = new BST<Integer, Integer>(60, 60);
 		bst1.put(50, 50); 		bst1.put(70, 70);		bst1.put(20, 20);		bst1.put(10, 10); 
 		bst1.put(40, 40); 		bst1.put(25, 25);		bst1.put(45, 45);		bst1.put(30, 30); 		
 		// 1�� bst1 ���� �� Ʈ�� ����, �����ڷῡ 45�� 40��ġ�� �ٲ�� ���� 40�� ���� put
 		
		bst1.print();	// 2��,3�� print���� �� ȣ��
		System.out.println("Searching for 45 yields : "+ bst1.get(45)); // 4�� bst1.get(45) ȣ�� �� ���
		
		bst1.put(45, 99);	// 5�� ȣ���� 4�� ����
		System.out.println("Searching for 45 yields : "+ bst1.get(45));
	
		System.out.println("Min value : "+ bst1.min());	// 6�� min ȣ�� �� ���
	
		bst1.deleteMin();	// 7�� deleteMin ȣ�� �� 6�� ����
		System.out.println("Min value : "+ bst1.min());
	
		bst1.delete(25);
		bst1.delete(35);
		bst1.delete(45);
		bst1.print();		// 8�� 25,35,45�� Ű ���� ������ ��� ���� �� print
	}
}
