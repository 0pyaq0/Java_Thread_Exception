package sec01.exam02_ThreadName;

public class ThreadB extends Thread {
	public ThreadB() {
		this.setName("ThreadB"); // 스레드 이름을 변경
		// this.setName("ThreadB");
		// 프로젝트 디버깅(수정 및 오류를 찾아서 수정)을 쉽게 하기 위해서 
	}
	
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
