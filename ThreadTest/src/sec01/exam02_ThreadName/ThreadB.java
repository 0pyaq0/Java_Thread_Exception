package sec01.exam02_ThreadName;

public class ThreadB extends Thread {
	public ThreadB() {
		this.setName("ThreadB"); // ������ �̸��� ����
		// this.setName("ThreadB");
		// ������Ʈ �����(���� �� ������ ã�Ƽ� ����)�� ���� �ϱ� ���ؼ� 
	}
	
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
