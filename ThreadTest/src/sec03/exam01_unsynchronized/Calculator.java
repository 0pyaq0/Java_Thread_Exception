package sec03.exam01_unsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory; // ó���� user1�� memory�� ���� ������ �Ŀ�
		// ������ 2�� �����ϸ� user2�� �ٽ� �� �޼ҵ带 �����ϱ� ������
		// memory�������� 50�� ����ȴ�
		
		try {
			Thread.sleep(2000);// 2�� ����
		} catch (InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
		// user1�� �����ϸ� 50�� ���
		// user2�� �����ϸ� 50�� ���
	}
}