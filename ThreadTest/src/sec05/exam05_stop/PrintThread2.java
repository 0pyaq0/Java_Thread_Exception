package sec05.exam05_stop;

public class PrintThread2 extends Thread {
	@Override
	public void run() {
// ���1
/*		
		try {		
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1); // InterruptedException���ܰ� �߻��Ǹ�
				// catch�������� ���� ��ġ�� �ٲ��.
				// while���� ����������.
			}
		} catch (InterruptedException e) {}
*/
// ���2
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) { // ThreadŬ���� �ȿ�
				// interrupted()��� Ŭ����(����)�޼ҵ尡 ����ɶ� ���ͷ�Ʈ�� �߻��ϸ�
				// true���� ��ȯ�Ѵ�.
				// ���� Ŭ�������� interrupt()�� �������� ������ interrupted()�� false�� �ȴ�
				break;
			}
		}

		
		
		
		
		
		
		
		System.out.println("�ڿ�����");
		System.out.println("���� ����");
		
		
		
	}
}
