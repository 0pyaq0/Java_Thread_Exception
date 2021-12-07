package sec04.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		TargetThread targetThread = new TargetThread();
		StatePrintThread statePrintThread = new StatePrintThread(targetThread);
		// 위의 2개문장 대신에 
		// StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		// StatePrintThread(new TargetThread());에서 new TargetThread()는 객체 
		
		statePrintThread.start();
		// StatePrintThread클래스에 있는
		// run()메소드 호출

	}

}
