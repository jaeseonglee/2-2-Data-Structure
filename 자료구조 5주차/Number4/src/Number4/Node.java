package Number4;
/** Q4 : Node.java, SList.java, main.java
 *  작성일 : 2019.09.29 (16hour↑)
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : SList에서 setAndOrderNodes 구현한 프로그램, 연결 리스트에 배열을 넣어주면 기존 값들을 지우고
 * 				배열을 오름차순으로 정렬하여 출력하는 프로그램 이자 두 연결 리스트를 합쳐 하나의 연결 리스트로 출력하는 프로그램
 */

		// 실습 1번을 기반으로 했기때문에 Number4 파일에서 패키지를 사용하여 구분해준다
public class Node <E>{		// Node 클래스 , 실습 1번과 같다
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