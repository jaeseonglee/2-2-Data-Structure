package Number4;

public class BSTtest {
	public static void main(String [] args) {
		BST<Integer, Integer> bst4 = new BST<Integer, Integer>();
		BST<Integer, Integer> bst5 = new BST<Integer, Integer>();
		
		Node root4 = new Node(50,50);
		root4.setLeft(new Node(25,25));
		root4.getLeft().setLeft(new Node(10,10));
		root4.getLeft().setRight(new Node(30,30));
		
		root4.setRight(new Node(75,75));
		root4.getRight().setLeft(new Node(60,60));		
		root4.getRight().setRight(new Node(80,80));
		
		bst4.setRoot(root4);
		bst4.print();
		System.out.println(bst4.checkBST());

		Node root5 = new Node(50,50);
		root5.setLeft(new Node(25,25));
		root5.getLeft().setLeft(new Node(10,10));
		root5.getLeft().setRight(new Node(30,30));
		
		root5.setRight(new Node(75,75));
		root5.getRight().setLeft(new Node(80,80));		
		root5.getRight().setRight(new Node(60,60));
		
		bst5.setRoot(root5);
		bst5.print();
		System.out.println(bst5.checkBST());

	}
}
