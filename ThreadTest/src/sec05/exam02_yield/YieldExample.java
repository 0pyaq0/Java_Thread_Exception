package sec05.exam02_yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {} // 3�� ����
		threadA.work = false;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {} // 3�� ����
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {} // 3�� ����
		threadA.stop = true;
		threadB.stop = true;
		
		
		
	}

}
