package Number5;

public class main {
	public static void main(String[] args) {
		ListStack<String> stack = new ListStack<String>();
		//String s1 = "A*(B+C/D)";
		//System.out.println(stack.getPostEq(s1));
		//String s2 = "(A+B)*(C-D)";
		//System.out.println(stack.getPostEq(s2));
		String s3 = "A+B+C*(B+C*D)/D";
		System.out.print(stack.getPostEq(s3));
	}
}
