package sec05.exam02_yield;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾�����");
			} else {
				Thread.yield();
				// ���� ������("ThreadB" ��ü�� ������ ���·� �����ÿ�
			}
		}
		System.out.println("ThreadB ����");
	}

}
