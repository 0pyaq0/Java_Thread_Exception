package sec05.exam05_stop;

public class InterruptExample {
	public static void main(String[] args) {
		PrintThread2 thread = new PrintThread2();
		
		thread.start();
		
		try {
			Thread.sleep(1000); // main스레드를 1초동안 일시 정지
		} catch (InterruptedException e) {}
		
		thread.interrupt(); // PrintThread2클래스에 있는 run()메소드에
		// while문 안에 Thread.sleep(1)을 만나면 InterruptedException예외가
		// 발생한다/
	}

}
