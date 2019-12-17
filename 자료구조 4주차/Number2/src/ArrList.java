import java.util.NoSuchElementException;	// 예외 발생을 위한 전처리문
public class ArrList <E> { // 제네릭을 이용해서 클래스를 구현 
	private E a[];		// 제네릭 타입으로 입력되는 배열을 생성
	private int size;	// 항목 수
	public ArrList() {	// 생성자
		a = (E[]) new Object[1]; // 1개의 값을 갖는 배열로 생성	
		size = 0;	// 0으로 초기화
	}
	
	public E peek(int k) {		// 제네릭 메소드 peek
		if(size==0 || k>= size)	// size 의 값이 0이거나 매개변수 k가 찾는 위치가 size보다 크면 
			throw new NoSuchElementException();	// 예외 발생
		return a[k];
	}
	
	public boolean isEmpty() { // size가 0이면 true를 반환하는 isEmpty 메소드
		if(size==0) return true;
		return false;
	}
	
	public void insertLast(E newItem) { // 가장 뒤에 새 항목 삽입
		if(size == a.length)		// 배열에 빈 공간이 없으면
			resize(2*a.length);		// 배열의 크기를 2배로 늘려준다.
		a[size++] = newItem;		// 마지막에 새항목을 삽입한다.
	}
	public void	insert (E newItem, int k) {	// 새 항목을 k-1번째 항목 다음에 삽입
		if(size == a.length)		// 배열에 빈 공간이 없으면
			resize(2*a.length);		// 배열의 크기를 2배로 늘려준다.
		for(int i=size-1; i>= k; i--) a[i+1] = a[i];	// 항목들을 한칸 뒤로 이동
		a[k] = newItem;
		size++;
	}
	public void insert( E newItem) {// insert 메소드 오버로딩으로써, 몇번째 삽입할지가 없으면
		insertLast(newItem);		// 마지막 항목에 추가한다.
	}
	private void resize(int newSize) {	// 배열의 크기를 조절하는 resize 메소드
		Object[] t = new Object[newSize];// newSize 크기의 새로운 배열 t 생성
		for(int i=0; i<size; i++)
			t[i] = a[i];	// 배열 s를 배열 t로 복사
		a = (E[]) t;		// 배열 t를 배열 s로 이동
	}
	
	public E delete(int k) {	// k번째 항목을 삭제하는 delete 메소드
		if(isEmpty()) throw new NoSuchElementException();
		E item = a[k];
		for(int i = k; i< size; i++) a[i] = a[i+1];	// 한칸씩 앞으로 이동
		size--;
		if(size > 0 && size <= a.length/4)	// 배열이 전체 크기의 1/4만 사용되면
			resize(a.length/2);			// 배열을 1/2로 축소시킴
		return item;
	}
	
	public void print() {		// 배열을 출력하는 print 메소드
		for(int i =0; i< a.length; i++) {
			if(i<size) System.out.print(a[i]+"\t");
			else System.out.print("null\t");
		}
		System.out.println();
	}
}