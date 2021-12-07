package sec03.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		// 메소드 앞에 synchronized를 붙이면 작업스레드가 먼저 이 메소드를
		// 실행하면 다른 작업 스레드들은 이 메소드에 접근이 불가하다.
		this.memory = memory; 
		
		try {
			Thread.sleep(2000);// 2초 연기
		} catch (InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
		// Thread.currentThread()는 현재 실행되고 있는 스레드
		// .getName()는 현재 실행되고 있는 스레드 이름 
	}
}