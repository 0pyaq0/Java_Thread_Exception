package sec05.exam04_wait_notify_2;

public class DataBox {
	private String data=null;
	
	public synchronized String getData() { // �����͸� ������
		if(this.data == null) {
			try { wait(); } catch (InterruptedException e) { }
			// ���� �����带 �Ͻ����� ���·� ����� �ش�.
		}
		String returnValue = data; // �����Ͱ� ������ ���
		System.out.println("ConsummerThread�� ���� ������ :"+returnValue);
		data = null;
		notify(); // �ٸ� �����带 ������ ���·� �����Ѵ�.
		
		return returnValue;
	}
	
	public synchronized void setData(String data) { // �����͸� �����Ҷ� 
		if(this.data != null) {
			try { wait(); } catch (InterruptedException e) { }
			// ���� �����带 �Ͻ����� ���·� ����� �ش�.
		}
		this.data = data;
		System.out.println("ProducerThread�� ������(����) ������ :" + data);
		notify(); // �ٸ� �����带 ������ ���·� �����Ѵ�.
	}
}