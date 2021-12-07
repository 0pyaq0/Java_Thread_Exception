package sec03.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		// �޼ҵ� �տ� synchronized�� ���̸� �۾������尡 ���� �� �޼ҵ带
		// �����ϸ� �ٸ� �۾� ��������� �� �޼ҵ忡 ������ �Ұ��ϴ�.
		this.memory = memory; 
		
		try {
			Thread.sleep(2000);// 2�� ����
		} catch (InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
		// Thread.currentThread()�� ���� ����ǰ� �ִ� ������
		// .getName()�� ���� ����ǰ� �ִ� ������ �̸� 
	}
}