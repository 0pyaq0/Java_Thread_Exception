package sec01.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//BeepTask beepTask = new BeepTask();
		// ù��° ���
		//Thread thread = new Thread(beepTask);
		//thread.start();
		
		// �ι�° ���
		// �͸��� ��ü ���
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
					// sleep(500) 1000�� 1�ʷ� ����. 500�̸� 0.5�� ����
				}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000�� 1�ʷ� ����. 500�̸� 0.5�� ����
		}
	}
}
