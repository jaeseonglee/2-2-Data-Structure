package Number2;

public class BSTtest {
	public static void main(String [] args) {
		BST<Integer, Integer> bst2 = new BST<Integer, Integer>(60, 60);
		bst2.put(50, 50); 		bst2.put(70, 70);		bst2.put(20, 20);		bst2.put(10, 10); 
		bst2.put(40, 40); 		bst2.put(25, 25);		bst2.put(45, 45);		bst2.put(30, 30); 		
		
		bst2.print();
		
		bst2.deleteMax();  // 최댓값 삭제후 출력을 3번 반복 실행
		bst2.print();
		
		bst2.deleteMax();
		bst2.print();
		
		bst2.deleteMax();
		bst2.print();
	}
}
