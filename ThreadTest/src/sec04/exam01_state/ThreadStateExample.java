package sec04.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		TargetThread targetThread = new TargetThread();
		StatePrintThread statePrintThread = new StatePrintThread(targetThread);
		// ���� 2������ ��ſ� 
		// StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		// StatePrintThread(new TargetThread());���� new TargetThread()�� ��ü 
		
		statePrintThread.start();
		// StatePrintThreadŬ������ �ִ�
		// run()�޼ҵ� ȣ��

	}

}
