/** Q5 : DoubleHashing.java, DoubleHashingTest.java 
 *  작성일 : 2019.11.11 ~ 11.17
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 이중해싱을 구현한 프로그램
 */
package Number5;

public class DoubleHashing <K,V> {
	private int N =0, M =13;
	private K[] a = (K[]) new Object[M];
	private V[] dt = (V[]) new Object[M];
	private int hash(K key) { 	
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public void put(K key, V data) {
		int initialpos = hash(key);	// 초기 위치
		int i = initialpos;	
		int j = 1;
		int d = (7 - (int)key % 7);	// 두번째 해시 함수, d(key) = 7- key % 7
		do {
			if(a[i] == null) {		// 삽입 위치 발견
				a[i] = key;			// key를 해시테이블에 저장
				dt[i] = data; N++;	// key관련 데이터 저장
				return;
			}
			if(a[i].equals(key)) {	// 이미 key존재
				dt[i] = data;		// 데이터만 갱신
				return;
			}
			i = (initialpos + j*d) % M;	// i = 다음 위치
			j++;
		}while(N < M);
	}
	
	public V get(K key) {
		int initialpos = hash(key);	// 초기 위치
		int i = initialpos;
		int j = 1;
		int d = (7 - (int)key % 7);
		while(a[i] != null) {		// 탐색 성공
			if(a[i].equals(key))
				return dt[i];
			i = (initialpos + j * d) % M;	// i = 다음 위치
			j++;
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