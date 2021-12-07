package sec05.exam05_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1(false);
		
		printThread.start();
		
		try {
			Thread.sleep(1000); // 1초 동안 메인 스레드 일시 정지
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
		

	}

}
