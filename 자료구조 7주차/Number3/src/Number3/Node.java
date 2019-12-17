/**	Q3 : Node.java, ListQueue.java, main.java
 *  작성일 : 2019.10.21 ~ 10.22
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 큐의 평균을 구하는 프로그램, add와 remove만을 사용하여 값을 구한다.
 */
package Number3;

public class Node <E>{		// Node 클래스 
	private E 		item;	// 객체가 갖는 정보
	private Node<E>	next;	// 다음 노드를 가리키는 레퍼런스
	public Node(E newItem, Node<E> node) {	//생성자
		item = newItem;		// 매개변수로 들어온 값을 저장해준다
		next = node;
	}
	// 각 멤버변수에 대한 getter setter메소드 
	public E		getItem() { return item; }
	public Node<E>	getNext() { return next; }
	public void		setItem(E newItem) 		{item = newItem;}
	public void 	setNext(Node<E> newNext){next = newNext;}
}