package sec05.exam05_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1(false);
		
		printThread.start();
		
		try {
			Thread.sleep(1000); // 1�� ���� ���� ������ �Ͻ� ����
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
		

	}

}
