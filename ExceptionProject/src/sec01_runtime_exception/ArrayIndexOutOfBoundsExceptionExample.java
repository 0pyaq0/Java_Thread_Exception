package sec01_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
/*		
		String data1 = args[0]; // ArrayIndexOutOfBoundsException예외 발생
		// run Configurations에서 Argument탭에서 입력 받는 모든 데이터는 문자열이다.\
		// 예) 100 ab300 ---> 문자열
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
*/
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
					
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("실행방법");
			System.out.print("C:javajava ArrayIndexOutOfBoundsExceptionExample 값1 값2");
		}
	}
}




