package sec06_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		
		// 출금하기
		try {
			// account.withdraw(8000);
			account.withdraw(15000); // 출금금액 15000원
			System.out.println("잔고 : " + account.getBalance());
		} catch(BalanceInsufficientException e) {
			System.out.println("예외발생");
		}
		

	}

}
