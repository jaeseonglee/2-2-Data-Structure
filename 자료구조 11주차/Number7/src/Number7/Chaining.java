/** Q7 : Chaining.java, RehashChainingTest.java 
 *  작성일 : 2019.11.17
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 재해시를 위해 폐쇄주소방식을 활용한 프로그램
 */
package Number7;

public class Chaining  <K, V> {
	private int M = 5;				// 테이블 크기 Q7에서는 5로 설정됨
	private Node[] a = new Node[M];	// 해시 테이블
	private int cnt = 0;			// Q7 적재율 계산을 위한 cnt 변수
	
	public static class Node {	//	Node 클래스
		private Object  key;
		private Object  data;
		private Node	next;
		public Node(Object newkey, Object newdata, Node ref) {	// 생성자
			key  = newkey;
			data = newdata;
			next = ref;
		}
		public Object getKey()  { return key; }
		public Object getData() { return data; }
	}
	
	private int hash(K key) {		// 해시코드
		return (key.hashCode() & 0x7fffffff) % M;	// 나눗셈 연산 
	}
	public V get(K key) {
		checkRehash();		// Q7 get메소드에서 적재율 계산
		
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next) {	// 연결리스트 탐색
			if(key.equals(x.key)) return (V) x.data;	// 탐색 성공
		}
		return null;	// 탐색 실패
	}
	
	public void put (K key, V data) {	// 삽입 연산
		checkRehash();					// Q7 put메소드에서 적재율 계산
		
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next)
			if(key.equals(x.key)) {	// 이미 key 존재
				x.data = data;		// 데이터만 갱신
				return;
			}
		a[i] = new Node(key, data,a[i]);	// 연결 리스트의 첫 노드로 삽입
	}

	public void print() {		// Node 배열을 출력하는 print문
		System.out.println("\n해시 테이블:");	
		Node result;		// 임시 Node 생성
		for(int i =0; i< a.length; i++ ) {	// (중첩)반복문을 통해 출력
			result = a[i];			// result에 현재 인덱스의 Node 저장
			System.out.print(i);	// 현재 인덱스 출력
			while(result != null) {	// result Node가 null이 아니라면
				System.out.print("-->[" + result.key + "," + result.data + "]");	// 값 출력
				result = result.next;		// result에 result 다음 노드를 저장
			}
			System.out.println();	// 현재 인덱스 배열에 저장된 모든 값이 출력되면 줄바꿈 
		}
	}
	
	private void checkRehash() {		// 적재율을 계산하는 checkRehash 메소드
		cnt = 0;						// 현재 cnt를 0으로 초기화 시키고
		for(int i = 0; i < a.length; i++ ) {	// 반복문을 통해서
			if(a[i] != null) cnt++; 	// 배열에 실질적으로 저장된 항목들을 계산
		}
		if( (cnt >= (double)M *0.75) ||  (cnt <= (double)M *0.25)) rehash();	// 적재율에 따라 재해시메소드 호출
	}
	
	private void rehash()  {			// 재해시하는 rehash메소드
		int temp = M;					// 현재의 크기를 저장하는 임시 변수 temp
		if(cnt >= (double)M *0.75 ) {	// 적재율이 0.75을 초과하면
			M *= 2; 					// 크기를 두배로 늘려준다
			System.out.println("테이블의 사이즈를 "+ temp +"에서 "+ M +"로 변경합니다.");
			Node[] t = new Node[M];		// 새로운 배열 선언
			for(int i = 0; i < temp; i++) {	// 반복문을 통해
				t[i] = a[i];				// 값을 저장
			}
			a = (Node[]) t;	 			// a를 t로 초기화
		} else {						// rehash를 호출하는 조건에 의해 0.25 아래로 떨어지면
			if( M == 5 )	return;		// 이때 최소 크기인 5에 해당하면 메소드 종료 >> 5의 배수로만 크기가 조절되기 때문.
			M = (int) M / 2; 			// 크기를 반으로 줄여준다
			System.out.println("테이블의 사이즈를 "+ temp +"에서 "+ M +"로 변경합니다.");
			Node[] t = new Node[M];		// 새로운 배열 선언
			for(int i = 0; i< M; i++) {		// 반복문을 통해
				t[i] = a[i];				// 값을 저장
			}
			a = (Node[]) t;	 				// a를 t로 초기화
		}
	}
	public void delete(K key) {			// 삭제 연산을 위한 delete 메소드
		for(int i = 0; i < a.length; i++ ) {// 반복문을 통해 삭제, 삭제에 실패하면 그냥 반복문을 빠져나온다 
			if(a[i] == null) continue;
			if( key.equals(a[i].key) ) {	// 입력된 key 값과 같은 Node의 key가 있다면
				a[i] = null;				// Node 삭제
				break;						// 반복문 종료
			}
		}		
		checkRehash();						// 삭제연산에 따라 적재율 계산
	}
}