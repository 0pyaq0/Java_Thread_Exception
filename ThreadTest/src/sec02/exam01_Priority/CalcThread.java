package sec02.exam01_Priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name); // 스레드 이름을 설정
		// this.setName(name);
	}
	
	@Override
	public void run() {
		for(long i=0; i<3000000000l; i++) {} // 실행을 지연 
		System.out.println(getName());
	}

}
