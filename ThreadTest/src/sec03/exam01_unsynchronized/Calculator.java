package sec03.exam01_unsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory; // 처음에 user1이 memory에 값을 저장한 후에
		// 실행을 2초 연기하면 user2가 다시 이 메소드를 실행하기 때문에
		// memory변수에는 50이 저장된다
		
		try {
			Thread.sleep(2000);// 2초 연기
		} catch (InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
		// user1이 실행하면 50이 출력
		// user2이 실행하면 50이 출력
	}
}