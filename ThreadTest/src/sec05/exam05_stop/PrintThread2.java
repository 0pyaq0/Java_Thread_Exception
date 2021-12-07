package sec05.exam05_stop;

public class PrintThread2 extends Thread {
	@Override
	public void run() {
// 방법1
/*		
		try {		
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); // InterruptedException예외가 발생되면
				// catch문장으로 실행 위치가 바뀐다.
				// while문을 빠져나간다.
			}
		} catch (InterruptedException e) {}
*/
// 방법2
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) { // Thread클래스 안에
				// interrupted()라는 클래스(정적)메소드가 실행될때 인터럽트가 발생하면
				// true값을 반환한다.
				// 실행 클래스에서 interrupt()를 실행하지 않으면 interrupted()는 false가 된다
				break;
			}
		}

		
		
		
		
		
		
		
		System.out.println("자원정리");
		System.out.println("실행 종료");
		
		
		
	}
}
