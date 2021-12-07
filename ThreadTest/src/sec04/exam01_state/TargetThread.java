package sec04.exam01_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<10000000000l; i++) { } // 실행상태, RUNNABLE 
		
		try {
			Thread.sleep(1500); // 1.5초 일시 정지. TIME_WAITING 
		} catch (InterruptedException e) {}
		
		for(long i=0; i<10000000000l; i++) { } // 실행상태, RUNNABLE 
		
	}

}
