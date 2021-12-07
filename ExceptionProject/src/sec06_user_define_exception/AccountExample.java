package sec06_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�:"+account.getBalance());
		
		// ����ϱ�
		try {
			// account.withdraw(8000);
			account.withdraw(15000); // ��ݱݾ� 15000��
			System.out.println("�ܰ� : " + account.getBalance());
		} catch(BalanceInsufficientException e) {
			System.out.println("���ܹ߻�");
		}
		

	}

}
