package sec05.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // toolkit按眉 积己
		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("厄");
			
			try {
				Thread.sleep(3000); // 3檬 老矫 沥瘤
			} catch (InterruptedException e) {}
			
		}
		

	}

}
