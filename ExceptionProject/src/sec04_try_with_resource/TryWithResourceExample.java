package sec04_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try ( FileInputStream fis = new FileInputStream("file.txt") ){ // 이 문장의 의미는 file을 자동으로
			// 닫아 준다.
			
			fis.read();
			throw new Exception();
			// 강제적으로 예외를 발생시킴
			// 예외처리 전에 close()메소드를 호출한다.
			
			// 프로그램이 종료될때 
			// FileInputStream클래스의 close()메소드가 
			// 자동으로 호출된다.
		} catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다");
		}
	}

}
