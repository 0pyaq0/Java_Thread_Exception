package sec06_user_define_exception;

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
		if(balance < money) {
			throw new BalanceInsufficientException(); // 강제로 예외 발생
		}
		balance -= money;
	}
	
	
	

}
