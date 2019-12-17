/**	Q7 : CNode.java, CList.java, main.java
 *  작성일 : 2019.09.30
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 리스트를 n번 rotate하는 rotateLeft메소드와 rotateRight메소드를 구현한 프로그램
 */
package Number7;
public class Node <E>{	// 단순연결리스트의 Node클래스와 동일하다
	private E 		item;// 객체가 갖는 정보
	private Node<E>	next;	// 다음 노드를 가리키는 레퍼런스
	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	// 각 멤버변수에 대한 getter setter메소드 
	public E		getItem() { return item; }
	public Node<E>	getNext() { return next; }
	public void		setItem(E newItem) 		{item = newItem;}
	public void 	setNext(Node<E> newNext){next = newNext;}
}