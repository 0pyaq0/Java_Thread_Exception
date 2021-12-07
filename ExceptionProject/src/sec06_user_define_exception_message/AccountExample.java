package sec06_user_define_exception_message;

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
			//String message = e.getMessage();
			//System.out.println("getMessage()=" + message);
			System.out.println();
			//System.out.println("toString()=" + e.toString());
			e.printStackTrace(); // ���� �߻� ��θ� ����
		}
		

	}

}
