package sec01.exam01_createthread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000�� 1�ʷ� ����. 500�̸� 0.5�� ����
		}
		
	}

}
