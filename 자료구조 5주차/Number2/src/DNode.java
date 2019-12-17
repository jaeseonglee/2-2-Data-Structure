/**	Q2 : DNode.java, DList.java, main.java
 *  작성일 : 2019.09.26 ~ 09.29
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 이중연결리스트, 강의자료에 있는 DList를 구현한 프로그램
 */
public class DNode <E> {		//  DNode 클래스
	private E		item;
	private DNode	previous;	// 이전의 노드를 가리키는 previous
	private DNode	next;		// 다음 노드를 가리키는 next
	public DNode(E newItem, DNode p, DNode q) {	// 노드 생성자
		item 	 = newItem;
		previous = p;
		next 	 = q;
	}
	// 각 멤버 변수의 gettet와 setter 메소드
	public E	 getItem()		{return item;}	
	public DNode getPrevious()	{return previous;}
	public DNode getNext()		{return next;}
	public void  setItem(E newItem)	  {item 	= newItem;}
	public void  setPrevious(DNode p) {previous = p;}
	public void  setNext(DNode q)	  {next 	= q;}
}