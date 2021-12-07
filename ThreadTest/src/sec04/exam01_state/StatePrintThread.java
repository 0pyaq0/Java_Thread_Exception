package sec04.exam01_state;

public class StatePrintThread extends Thread { // TargetThread�������� ���¸� ���
	private Thread targetThread;
	// private TargetThread targetThread;

	public StatePrintThread(Thread targetThread) { // Thread targetThread = new TargetThread()
		
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� :" + state);
			
			if(state == Thread.State.NEW) { // targetThread�۾� �����尡 ó�� ����� ������
				targetThread.start(); // TargetThreadŬ������ �ִ� run()�޼ҵ尡 ȣ��
			}
			if(state == Thread.State.TERMINATED) {
				break; // while���� ����������. �����尡 ����
			}
			
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			}catch(Exception e) {}
		}
	}
}











