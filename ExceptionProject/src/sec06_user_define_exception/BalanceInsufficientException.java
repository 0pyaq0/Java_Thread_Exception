package sec06_user_define_exception;

public class BalanceInsufficientException extends Exception {
// �Ϲ����� �����̸� Exception�� ��� �ް�
// ���� �����̸� RuntimeException�� ��ӹ޴´�.
	
	public BalanceInsufficientException() {} // �⺻������
	
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
