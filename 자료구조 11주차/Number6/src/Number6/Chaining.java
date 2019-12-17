/** Q6 : Chaining.java, ChainingTest.java 
 *  작성일 : 2019.11.11 ~ 11.17
 *  작성자 : 20165153 이재성
 * 	프로그램 설명 : 폐쇄주소방식을 구현한 프로그램
 */
package Number6;

public class Chaining <K, V> {
	private int M = 13;				// 테이블 크기
	private Node[] a = new Node[M];	// 해시 테이블
	
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
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next) {	// 연결리스트 탐색
			if(key.equals(x.key)) return (V) x.data;	// 탐색 성공
		}
		return null;	// 탐색 실패
	}
	
	public void put (K key, V data) {	// 삽입 연산
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
		for(int i =0; i< a.length; i++ ) {	// (중첩)반복문을 통해 출력ㄴ
			result = a[i];			// result에 현재 인덱스의 Node 저장
			System.out.print(i);	// 현재 인덱스 출력
			while(result != null) {	// result Node가 null이 아니라면
				System.out.print("-->[" + result.key + "," + result.data + "]");	// 값 출력
				result = result.next;		// result에 result 다음 노드를 저장
			}
			System.out.println();	// 현재 인덱스 배열에 저장된 모든 값이 출력되면 줄바꿈 
		}
	}
}
