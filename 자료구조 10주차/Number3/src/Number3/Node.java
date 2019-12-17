/** Q3 : Node.java, BST.java, BSTtest.java 
 *  �ۼ��� : 2019.10.31 ~ 11.05
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �ε��� ���� ����  BST�� k��° Key���� ã�� kthSmallest�޼ҵ带 ������ ���α׷�
 */
package Number3;

public class Node <Key extends Comparable<Key>, Value> {
	private Key		id;
	private Value	name;
	private Node	left,right;
	public Node(Key newId, Value newName) { // ��� ������
		id	 = newId;
		name = newName;
		left = right = null;
	}
	// getter setter �޼ҵ��
	public Key getKey()		{ return id; }
	public Value getValue() { return name; }
	public Node getLeft()	{ return left; }
	public Node getRight()	{ return right; }
	public void setKey(Key newId) { id = newId;}
	public void setValue(Value newName) { name = newName; }
	public void setLeft(Node newLeft) { left = newLeft; }
	public void setRight(Node newRight) {right = newRight; }
}