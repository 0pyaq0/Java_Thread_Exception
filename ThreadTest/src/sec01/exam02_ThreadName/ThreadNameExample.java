package sec01.exam02_ThreadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA�� ������ ������:" + Thread.currentThread().getName());
		System.out.println("�۾� ������ �̸� : " + mainThread.getName());
		threadA.start(); // ThreadAŬ������ �ִ� run()�޼ҵ尡 ����
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadB�� ������ ������:" + Thread.currentThread().getName());
		System.out.println("�۾� ������ �̸� : " + mainThread.getName());
		threadB.start();
		

	}

}
