
public class Q09 {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "I am dreaming of a white Christmas";
		
		System.out.println(str1 + " : " + lastWorldLength(str1));
		System.out.println(str2 + " : " + lastWorldLength(str2));
	}
	public static int lastWordLength(String s) {
		/*
		 * 입력으로 String s 문자열이 주어진다.
		 * 문자열 s는 영어 대문자, 소문자, 공백으로 구성된다.
		 * 가장 마지막 단어의 길이를 리턴하는 프로그램을 작성하세요.
		 * 예) 입력이 "Nice to meet you"이면, 출력은 3이다.
		 *    왜냐하면, 가장 마지막 단어는 "you"이고, "you"의 길이는 3이니까.
		 * 예) 입력이 "Hello"이면, 출력은 5이다.
		 *    왜냐하면, "Hello"가 처음이자 마지막 단어이기 때문이다.
		 *    "Hello" 단어의 길이는 5
		 * 예) 입력이 "Hello World"이면, 출력은 5이다.
		 *    왜냐하면, 마지막 단어는 "World"이고, 그 길이는 5니까.
		 */
		
		
		
		/* 여기에 들어갈 코드를 작성하세요 */
		int cnt = 0;
		for(int i = 0; i< s.length(); i++) {
			cnt++;
			if(s.contains(i) == ' ') {
				cnt = 0;
			}
			
		}
		return cnt;
		
	}
}
