package sec05.exam05_stop;

public class InterruptExample {
	public static void main(String[] args) {
		PrintThread2 thread = new PrintThread2();
		
		thread.start();
		
		try {
			Thread.sleep(1000); // main�����带 1�ʵ��� �Ͻ� ����
		} catch (InterruptedException e) {}
		
		thread.interrupt(); // PrintThread2Ŭ������ �ִ� run()�޼ҵ忡
		// while�� �ȿ� Thread.sleep(1)�� ������ InterruptedException���ܰ�
		// �߻��Ѵ�/
	}

}
