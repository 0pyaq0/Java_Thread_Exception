package sec01.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		// ù��° ���
		
		// Thread thread = new BeepThread(); �Ǵ�
		// BeepThread thread = new BeepThread();
		// thread.start();
		// BeepThreadŬ������ �ִ� run()�޼ҵ尡 ����
		
		// �ι�° ���		
		Thread thread = new Thread() { // �͸��� ��ü
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
					// sleep(500) 1000�� 1�ʷ� ����. 500�̸� 0.5�� ����
				}
			}
		};
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500) 1000�� 1�ʷ� ����. 500�̸� 0.5�� ����
		}
	}
}
