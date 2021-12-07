package sec06_user_define_exception_message;

public class BalanceInsufficientException extends Exception {
// 일반적인 예외이면 Exception을 상속 받고
// 실행 오류이면 RuntimeException을 상속받는다.
	
	public BalanceInsufficientException() {} // 기본생성자
	
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
