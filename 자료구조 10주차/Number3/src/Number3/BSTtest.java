package Number3;

public class BSTtest {
	public static void main(String [] args) {
		BST<Integer, Integer> bst3 = new BST<Integer, Integer>(60, 60);
		bst3.put(50, 50); 		bst3.put(70, 70);		bst3.put(20, 20);		bst3.put(10, 10); 
		bst3.put(40, 40);		bst3.put(25, 25);		bst3.put(45, 45); 		bst3.put(30, 30); 		
 		bst3.print();
 		
		for(int i=0;i<5;i++)  System.out.println(i+"번째 작은 값 : "+bst3.kthSmallest(i));	// 반복문을 통해 0~4번째 작은 Key값 출력 
	}
}
