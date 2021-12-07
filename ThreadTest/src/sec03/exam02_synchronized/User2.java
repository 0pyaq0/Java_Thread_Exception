package sec03.exam02_synchronized;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2"); // 스레드 이름을 설정
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
		// Calculator클래스의 memory변수에 50을 저장 
	}

}
