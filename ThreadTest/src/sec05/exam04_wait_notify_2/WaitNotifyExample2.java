package sec05.exam04_wait_notify_2;

public class WaitNotifyExample2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		
		producerThread.start();
		consumerThread.start();

	}

}
