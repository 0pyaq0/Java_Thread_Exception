package sec05.exam02_yield;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업내용");
			} else {
				Thread.yield(); 
				// 현재 스레드("ThreadA" 객체는 실행대기 상태로 보내시오
			}
		}
		System.out.println("ThreadA 종료");
	}

}
