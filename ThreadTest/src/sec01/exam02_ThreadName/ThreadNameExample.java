package sec01.exam02_ThreadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA를 생성한 스레드:" + Thread.currentThread().getName());
		System.out.println("작업 스레드 이름 : " + mainThread.getName());
		threadA.start(); // ThreadA클래스에 있는 run()메소드가 실행
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadB를 생성한 스레드:" + Thread.currentThread().getName());
		System.out.println("작업 스레드 이름 : " + mainThread.getName());
		threadB.start();
		

	}

}
