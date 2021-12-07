package sec01.exam01_createthread;

import java.awt.Toolkit;

// 싱글 스레드
public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000을 1초로 설정. 500이면 0.5초 지연
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000을 1초로 설정. 500이면 0.5초 지연
		}
	}
}
