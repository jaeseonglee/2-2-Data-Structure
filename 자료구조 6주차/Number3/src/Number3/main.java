package Number3;

public class main {  // main 클래스
	public static void main (String [] args) {
		ListStack<Character> stack = new ListStack<Character>(); // 객체 생성
		
		//String str1 = "(ant+bee)*crab+{[ant*food]+(offset)}/gas";
		//System.out.println(stack.checkParentheses(str1));
		String str2 = "(ant+bee)*crab+[ant*food]+(offset)}/gas";
		System.out.println(stack.checkParentheses(str2));
	}
}
