/** Q2 : LinearProbing2.java, LinearProbingTest2.java 
 *  작성일 : 2019.11.11 ~ 11.17
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : LinearProbing 클래스에서 delete 메소드를 추가한 프로그램
 */
package Number2;

public class LinearProbing2 <K,V> {
	private int M = 13;		// 테이블 크기
	private K[] a = (K[]) new Object[M]; // 해시 테이블
	private V[] d = (V[]) new Object[M]; // key관련 데이터 저장
	private int hash(K key) {		// 해시코드
		return (key.hashCode() & 0x7fffffff) % M;	// 나눗셈 함수
	}
	
	public void put(K key, V data) {	// 삽입 연산
		int initialpos = hash(key);		// 초기 위치
		int i = initialpos, j = 1;
		do {
			if (a[i] == null ) {	// 삽입 위치 발견
				a[i] = key;			// key를 해시테이블에 저장
				d[i] = data;		// key관련 데이터를 동일한 인덱스하에 저장
				return;
			}
			if (a[i].equals(key) ) { // 이미 key 존재:
				d[i] = data;		// 데이터만 갱신
				return;
			}
			i = (initialpos + j++ ) % M;	// i = 다음 위치
		}while( i != initialpos);		// 현재 i가 초기위치와 같게되면 루프 종료
	}

	public V get(K key) {		// 탐색 연산
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if( a[i].equals(key) ) return d[i];
			i = (initialpos + j++) % M;
		} while(a[i] != null && 	// a[i]가 null(=비어있음) 이면 stop(못찾음)
				i != initialpos);	// 처음 위치로 돌아왔다면 stop (못찾음)
		return null;
	}

	public void print() {
		System.out.print("\n해시 테이블:\n\t");
		for(int i =0; i< a.length; i++ ) {
			System.out.print(i+"\t");
		}
		System.out.print("\n\t");
		for(int i =0; i< 13; i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();
	}
	
	public V delete(K key) {		// 항목을 삭제하는 delete 메소드
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if( a[i].equals(key) ) {	// 삭제할 항목을 발견
				V temp = d[i];	// 삭제할 항목의 데이터 저장
				int num = (initialpos + j++) % M;	// 충돌이 발생한 다음 위치의 항목의 인덱스 저장
				a[i] = a[num];	// 현재 삭제할 항목의 데이터대신
				d[i] = d[num];	// 충돌이 발생한 다음위치의 데이터로 저장
				a[num] = null;	// 원래 자리는 null로 초기화
				d[num] = null;
				return temp;	// 삭제된 항목을 반환
			}
			i = (initialpos + j++) % M;
		} while(a[i] != null && 	// a[i]가 null(=비어있음) 이면 stop(못찾음)
				i != initialpos);	// 처음 위치로 돌아왔다면 stop (못찾음)
		return null;
	}
	
}