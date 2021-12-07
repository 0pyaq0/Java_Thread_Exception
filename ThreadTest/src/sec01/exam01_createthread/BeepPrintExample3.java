package sec01.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		// 첫번째 방식
		
		// Thread thread = new BeepThread(); 또는
		// BeepThread thread = new BeepThread();
		// thread.start();
		// BeepThread클래스에 있는 run()메소드가 실행
		
		// 두번째 방식		
		Thread thread = new Thread() { // 익명의 객체
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
					// sleep(500) 1000을 1초로 설정. 500이면 0.5초 지연
				}
			}
		};
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000을 1초로 설정. 500이면 0.5초 지연
		}
	}
}
