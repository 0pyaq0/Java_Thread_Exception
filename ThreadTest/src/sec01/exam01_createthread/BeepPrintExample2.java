package sec01.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//BeepTask beepTask = new BeepTask();
		// 첫번째 방식
		//Thread thread = new Thread(beepTask);
		//thread.start();
		
		// 두번째 방식
		// 익명의 객체 방식
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
					// sleep(500) 1000을 1초로 설정. 500이면 0.5초 지연
				}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000을 1초로 설정. 500이면 0.5초 지연
		}
	}
}
