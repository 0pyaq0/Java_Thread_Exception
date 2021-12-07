package sec03.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // user1 작업스레드 객체 생성
		user1.setCalculator(calculator);
		user1.start(); // calculator객체의 memory값을 run()메소드에 의해서
		// 100으로 저장한다.
		
		User2 user2 = new User2(); // user2 작업스레드 객체 생성
		user2.setCalculator(calculator);
		user2.start();// calculator객체의 memory값을 run()메소드에 의해서
		// 50으로 저장한다.
		
		
	}

}
