package Number3;
import java.util.*;
public class BinaryTree	<Key extends Comparable<Key>>{
	private Node root;
	public BinaryTree()		{ root = null; }	// Ʈ�� ������
	public Node getRoot()	{ return root; }
	public void setRoot(Node newRoot)	{ root = newRoot;}	
	public boolean isEmpty()	{ return root == null; }
	
	public void insertValue(Key newItem) {		// Ʈ���� ���� �ִ� insertValue �޼ҵ�, �����ڷ��� ������ȸ�� �����Ͽ� �ۼ���
		Queue<Node> q = new LinkedList<Node>();		// ť �ڷᱸ��
		Node newNode = new Node(newItem,null,null);	// �Ű������� ��Ʈ�� ���� (����)Ʈ��
		Node t;		// �ӽ� ��� ����
		
		if(isEmpty()) {	// ���� ����Ʈ���� �ƹ��͵� ���ٸ� 
			setRoot(newNode);	// newNode ���� ��Ʈ�� �ȴ�
			return ;		// �޼ҵ� ����
		}
		
		q.add(root);	// ť�� ��Ʈ�� ����
		while(!q.isEmpty()) {	// ť�� �����ϴ� �� ���� �ݺ�
			t = q.remove();		// ť�� ����տ� �ִ� ��� ����
			if (t.getLeft() != null) 	// ������ null�� �ƴ϶��
				q.add(t.getLeft());		// ť�� ���� �ڽ� ����
			if(t.getRight() != null) 	// �������� null�� �ƴ϶��
				q.add(t.getRight());	// ť�� ������ �ڽ� ����
			if( t.getLeft() == null) {	// ������ null�̸� 
				t.setLeft(newNode);		// newNode ���� ���� �ڽ��� �ǰ�
				break;					// �ݺ����� ���� ������
			}	
			if( t.getRight() == null) {	// ������ null�ƴϰ� �������� null�̸� 
				t.setRight(newNode);	// newNode ���� ������ �ڽ��� �ǰ�
				break;					// �ݺ����� ���� ������
			}		
		}
	}
	
	public void preorder(Node n) {	// Ʈ���� ������ȸ�ϴ� preorder �޼ҵ�
		if(n != null) {
			System.out.print(n.getKey()+ " ");	// ���  n �湮
			preorder(n.getLeft());	// n�� ���� ����Ʈ���� ��ȸ�ϱ� ����
			preorder(n.getRight());	// n�� ������ ����Ʈ���� ��ȸ�ϱ� ����
		}
	}

	public void inorder(Node n) {	// ������ȸ �ϴ� inorder �޼ҵ�
		if(n != null ) {
			inorder(n.getLeft());	// n�� ���� ����Ʈ���� ��ȸ�ϱ� ����
			System.out.print(n.getKey() + " ");	// ���  n �湮
			inorder(n.getRight()); // n�� ������ ����Ʈ���� ��ȸ�ϱ� ����
		}
	}

	public void postorder(Node n) {	// ������ȸ�ϴ� postorder �޼ҵ�
		if(n != null) {
			postorder(n.getLeft());	// n�� ���� ����Ʈ���� ��ȸ�ϱ� ����
			postorder(n.getRight());// n�� ������ ����Ʈ���� ��ȸ�ϱ� ����
			System.out.print(n.getKey() + " ");// ���  n �湮
		}
	}

	public void levelorder(Node root) {	// ������ȸ�ϴ� levelorder �޼ҵ�
		Queue<Node> q = new LinkedList<Node>();	// ť �ڷᱸ�� �̿�
		Node t;
		q.add(root);	// ��Ʈ ��� ť�� ����
		while(!q.isEmpty()) {
			t = q.remove();	// ť���� ���� �տ� �ִ� ��� ����
			System.out.print(t.getKey() + " ");	// ���ŵ� ��� ���(�湮)
			if (t.getLeft() != null)	// ���ŵ� ���� �ڽ���  null�� �ƴϸ�
				q.add(t.getLeft());		// ť�� ���� �ڽ� ����
			if(t.getRight() != null)	// ���ŵ� ������ �ڽ��� null�� �ƴϸ�
				q.add(t.getRight());	// ť�� ������ �ڽ� ����
		}
	}
	
	public int size(Node n) {	// n�� ��Ʈ�� �ϴ� (����)Ʈ���� �ִ� ��� �� 
		if(n == null)
			return 0;	// null�̸� 0 ����
		else
			return (1+ size( n.getLeft() ) + size(n.getRight() ));
	}
	
	public int height(Node n) {	// n�� ��Ʈ�� �ϴ� (����)Ʈ���� �ִ� ����
		if(n == null)
			return 0;	// null�̸� 0 ����
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}
	
	public static boolean isEqual(Node n, Node m) { // �� Ʈ���� ���ϼ� �˻�
		if(n == null || m == null) 	// ���߿� �ϳ��� null�̸�
			return n == m;			// �Ѵ� null�̸� true, �ƴϸ� false
		if(n.getKey().compareTo(m.getKey()) != 0)	// �Ѵ� null�� �ƴϸ� item ��
			return false;
		
		return (isEqual(n.getLeft(), m.getLeft()) &&	// item�� ������ ���� �ڽ� ���ȣ��
				isEqual(n.getRight(), m.getRight()));	// ������ �ڽ� ���ȣ��
	}
	
	public LinkedList<Node> subTreeCompare(BinaryTree t) {	// ���� ����Ʈ���� ������ Ȯ���ϴ� subTreeCompare �޼ҵ�
		LinkedList<Node> LinkedList = new LinkedList<Node>(); // ���� Ÿ���� LinkedList<Node>...�̹Ƿ� ���� �� �ʱ�ȭ
		Queue<Node> q = new LinkedList<Node>();		// �� Ʈ���� ���ϱ� ���� ť �ΰ� ����
		Queue<Node> q2= new LinkedList<Node>();	
		Node temp;		// �ӽ� ��� 2�� ����
		Node temp2;
		
		q.add(root);	// ��Ʈ ��� ť�� ����
		while(!q.isEmpty()) {	// �� ��ü�� �ݺ���
			temp = q.remove();	// ť���� ���� �տ� �ִ� ��� ����
			q2.add(t.getRoot());	// �Ű������� ��Ʈ ��� ť�� ����
			
			while(!q2.isEmpty()) {	// �Ű����� ��ü�� �ݺ���
				temp2 = q2.remove();	// ť���� ���� �տ� �ִ� ��� ����
				if(isEqual(temp,temp2)) { // isEqual�޼ҵ带 ���� �� ���(Ʈ��)�� ��
					LinkedList.add(temp); // isEqual�� ���� ��Ʈ�� �� ���� Ʈ������ ���� Ʈ���� ã���� LinkedList�� �߰����ش�
				}
				if (temp2.getLeft() != null)	// ������ȸ�� ����ϰ� 
					q2.add(temp2.getLeft());	// ť�� ���� �Ǵ� 	
				if(temp2.getRight() != null)	// ������ �ڽ��� null���� Ȯ���ؼ� 
					q2.add(temp2.getRight());	// ť�� �׾��ش�
			}
			if (temp.getLeft() != null)		// �ٱ��ʿ� �ݺ�����
				q.add(temp.getLeft());		// ������ȸ���� ����ߴ� �� ó��
			if(temp.getRight() != null)		// �ڽ��� null���� Ȯ���ؼ�
				q.add(temp.getRight());		// ť�� �׾��ش�
		}
 		return LinkedList;		// ��ø �ݺ����� ���� �׸��� �߰��� LinkedList�� �������ش�.
	}
}