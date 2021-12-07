package sec06_user_define_exception;

public class Account {
	private int balance; // ���� �ܰ�
	
	public Account() {}

	public int getBalance() {  
		return balance;
	}

	public void deposit(int money) { // �Ա�
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException { // ���
		if(balance < money) {
			throw new BalanceInsufficientException(); // ������ ���� �߻�
		}
		balance -= money;
	}
	
	
	

}
