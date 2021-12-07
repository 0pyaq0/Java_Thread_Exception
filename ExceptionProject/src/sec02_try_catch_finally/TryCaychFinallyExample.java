package sec02_try_catch_finally;

public class TryCaychFinallyExample {

	public static void main(String[] args) {
		
		try {
			
			Class clazz = Class.forName("java.lang.String");
			//Class clazz = Class.forName("java.lang.String2"); 
			// ClassNotFoundException 예외가 발생하기 때문에 catch 문장으로 
			// 실행을 옮긴다.
			System.out.println("클래스를 찾았습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
		
	}
}
