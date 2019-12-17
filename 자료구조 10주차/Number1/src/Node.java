/**	자료구조 10주차
 * 	Q1 : Node.java, BST.java, BSTtest.java 
 *  작성일 : 2019.10.31 ~ 11.05
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 이진탐색트리의 구현과  강의자료와 같이 메소드 호출하는 프로그램
 */
public class Node <Key extends Comparable<Key>, Value> {
	private Key		id;
	private Value	name;
	private Node	left,right;
	public Node(Key newId, Value newName) { // 노드 생성자
		id	 = newId;
		name = newName;
		left = right = null;
	}
	// getter setter 메소드들
	public Key getKey()		{ return id; }
	public Value getValue() { return name; }
	public Node getLeft()	{ return left; }
	public Node getRight()	{ return right; }
	public void setKey(Key newId) { id = newId;}
	public void setValue(Value newName) { name = newName; }
	public void setLeft(Node newLeft) { left = newLeft; }
	public void setRight(Node newRight) {right = newRight; }
}
