package sec04.exam01_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<10000000000l; i++) { } // �������, RUNNABLE 
		
		try {
			Thread.sleep(1500); // 1.5�� �Ͻ� ����. TIME_WAITING 
		} catch (InterruptedException e) {}
		
		for(long i=0; i<10000000000l; i++) { } // �������, RUNNABLE 
		
	}

}
