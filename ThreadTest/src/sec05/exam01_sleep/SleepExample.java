package sec05.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // toolkit��ü ����
		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("��");
			
			try {
				Thread.sleep(3000); // 3�� �Ͻ� ����
			} catch (InterruptedException e) {}
			
		}
		

	}

}
