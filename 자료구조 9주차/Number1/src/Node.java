/**	자료구조 9주차
 * 	Q1 : Node.java, BinaryTree.java, BinaryTreeTest.java 
 *  작성일 : 2019.10.24 ~ 10.27
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 완전이진트리를 구현한 프로그램, 강의 자료를 바탕으로 구현됨
 */
public class Node<Key extends Comparable<Key>> {
	private	Key		item;		// Key를 제네릭타입으로 사용
	private	Node<Key>	left;
	private Node<Key>	right;
	public Node (Key newItem, Node lt, Node rt) {	// 노드 생성자
		item = newItem; left = lt; right = rt;}
	public Key	getKey()	{return item;}
	public Node<Key> getLeft()	{return left;}
	public Node<Key> getRight()	{return right;}
	public void setKey(Key newItem)	{item = newItem;}
	public void setLeft(Node<Key> lt) {left = lt;}
	public void setRight(Node<Key> rt) {right = rt; }
}
