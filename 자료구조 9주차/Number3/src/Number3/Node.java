/**	Q3 : Node.java, BinaryTree.java, BinaryTreeTest.java 
 *  �ۼ��� : 2019.10.29
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �� ����Ʈ���� ���Ͽ� ���� ���� Ʈ���� ������ Ž���ϴ� ���α׷�
 */
package Number3;
public class Node<Key extends Comparable<Key>> {
	private	Key		item;		// Key�� ���׸�Ÿ������ ���
	private	Node<Key>	left;
	private Node<Key>	right;
	public Node (Key newItem, Node lt, Node rt) {	// ��� ������
		item = newItem; left = lt; right = rt;}
	public Key	getKey()	{return item;}
	public Node<Key> getLeft()	{return left;}
	public Node<Key> getRight()	{return right;}
	public void setKey(Key newItem)	{item = newItem;}
	public void setLeft(Node<Key> lt) {left = lt;}
	public void setRight(Node<Key> rt) {right = rt; }
}