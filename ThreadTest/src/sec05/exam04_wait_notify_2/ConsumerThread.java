package sec05.exam04_wait_notify_2;

public class ConsumerThread extends Thread {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() { // 데이터를 읽어오는 스레드
		for(int i=1; i<=3; i++) {
			String data = dataBox.getData();
		}
	}
}




