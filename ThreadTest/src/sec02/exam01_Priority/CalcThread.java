package sec02.exam01_Priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name); // ������ �̸��� ����
		// this.setName(name);
	}
	
	@Override
	public void run() {
		for(long i=0; i<3000000000l; i++) {} // ������ ���� 
		System.out.println(getName());
	}

}
