package sec05.exam05_stop;

public class PrintThread1 extends Thread {
	private boolean stop;

	public PrintThread1(boolean stop) { // stop=false
		this.stop = stop;
	}
	
	
	public void setStop(boolean stop) { // stop=true
		this.stop = stop;
	}



	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
