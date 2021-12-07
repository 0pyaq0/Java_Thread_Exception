package sec03.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // user1 �۾������� ��ü ����
		user1.setCalculator(calculator);
		user1.start(); // calculator��ü�� memory���� run()�޼ҵ忡 ���ؼ�
		// 100���� �����Ѵ�.
		
		User2 user2 = new User2(); // user2 �۾������� ��ü ����
		user2.setCalculator(calculator);
		user2.start();// calculator��ü�� memory���� run()�޼ҵ忡 ���ؼ�
		// 50���� �����Ѵ�.
		
		
	}

}
