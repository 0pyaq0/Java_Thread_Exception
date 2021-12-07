package sec05.exam06_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
		
		// 메인 스레드가 종료하면 autoSaveThread스레드조 종료된다.
		

	}

}
