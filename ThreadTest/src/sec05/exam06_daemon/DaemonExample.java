package sec05.exam06_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println("���� ������ ����");
		
		// ���� �����尡 �����ϸ� autoSaveThread�������� ����ȴ�.
		

	}

}
