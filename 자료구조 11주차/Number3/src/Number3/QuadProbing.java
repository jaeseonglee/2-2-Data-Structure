/** Q3 : QuadProbing.java, QuadProbingTest.java 
 *  작성일 : 2019.11.11 ~ 11.17
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 이차조사를 구현한 프로그램
 */
package Number3;

public class QuadProbing <K,V> {
	private int N =0, M =13;		// 항목 수 N, 테이블 크기 M;
	private K[] a = (K[]) new Object[M];	// 해시 테이블
	private V[] d = (V[]) new Object[M];	// key관련 데이터 저장
	private int hash(K key) {		// 해시코드
		return (key.hashCode() & 0x7fffffff) % M;	// 나눗셈 함수
	}
	
	public void put (K key, V data) {	// 삽입 연산
		int initialpos = hash(key);		// 초기 위치
		int i = initialpos, j = 1; 
		do {
			if(a[i] == null) {	// 삽입 위치 발견
				a[i] = key;		// key를 해시테이블에 저장
				d[i] = data; N++;	// key관련 데이터 저장
				return;
			}
			if(a[i].equals(key)) {	// 이미 key 존재
				d[i] = data;		// data데이터만 갱신
				return;
			}
			i = (initialpos + j * j++) % M; // i = 다음 위치
		} while(N < M);
	}
	
	public V get(K key) {		// 탐색 연산
		int initialpos = hash(key);
		int i = initialpos , j = 1;
		while( a[i] != null) {	// a[i]가 empty가 아니면
			if(a[i].equals(key))
				return d[i];	// 탐색 성공
			i = (initialpos + j * j++) % M;	// i = 다음 위치
		}
		return null;	// 탐색 실패
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
}
