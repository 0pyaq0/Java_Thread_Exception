package sec06_user_define_exception_message;

public class Account {
	private int balance; // 은행 잔고
	
	public Account() {}

	public int getBalance() {  
		return balance;
	}

	public void deposit(int money) { // 입금
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException { // 출금
		if(balance < money) { // 조건이 만족한다는 것은 잔고가 부족
			throw new BalanceInsufficientException("잔고부족 : " + (money-balance) + " 모자람" ); // 강제로 예외 발생
		}
		balance -= money;
	}
	
	
	

}
