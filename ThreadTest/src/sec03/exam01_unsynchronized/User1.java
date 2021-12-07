package sec03.exam01_unsynchronized;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // 스레드 이름을 설정
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100); 
		// Calculator클래스의 memory변수에 100을 저장 
	}

}
