package sec04.exam01_state;

public class StatePrintThread extends Thread { // TargetThread스레드의 상태를 출력
	private Thread targetThread;
	// private TargetThread targetThread;

	public StatePrintThread(Thread targetThread) { // Thread targetThread = new TargetThread()
		
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 :" + state);
			
			if(state == Thread.State.NEW) { // targetThread작업 스레드가 처음 만들어 졌을때
				targetThread.start(); // TargetThread클래스에 있는 run()메소드가 호출
			}
			if(state == Thread.State.TERMINATED) {
				break; // while문을 빠져나간다. 스레드가 종료
			}
			
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			}catch(Exception e) {}
		}
	}
}











