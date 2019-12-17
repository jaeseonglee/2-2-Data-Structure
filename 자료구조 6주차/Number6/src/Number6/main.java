package Number6;

public class main {
	public static void main( String []args) {
		ListStack<Double> stack = new ListStack<Double>();		// 실수타입으로 객체생성
		
		//String arr[] = {"81", "37", "-211", "+"," 15", "-", "/"}; 
		//System.out.printf("%.3f",   stack.calc(arr)); // 실수를 반환하는 calc메소드, 3자리까지 출력해준다.
		
		// task 2의 경우 연산자가 2개인데 값이 2개라서 임의로 값 하나 추가하여 계산
		String arr2[] = {"20.5", "10.2", "+", "10.0", "*"}; 
		System.out.printf("%.3f",   stack.calc(arr2));
	}
}
