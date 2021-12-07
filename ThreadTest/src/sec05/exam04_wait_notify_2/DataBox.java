package sec05.exam04_wait_notify_2;

public class DataBox {
	private String data=null;
	
	public synchronized String getData() { // 데이터를 읽을때
		if(this.data == null) {
			try { wait(); } catch (InterruptedException e) { }
			// 현재 스레드를 일시정지 상태로 만들어 준다.
		}
		String returnValue = data; // 데이터가 존재할 경우
		System.out.println("ConsummerThread가 읽은 데이터 :"+returnValue);
		data = null;
		notify(); // 다른 스레드를 실행대기 상태로 변경한다.
		
		return returnValue;
	}
	
	public synchronized void setData(String data) { // 데이터를 저장할때 
		if(this.data != null) {
			try { wait(); } catch (InterruptedException e) { }
			// 현재 스레드를 일시정지 상태로 만들어 준다.
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한(저장) 데이터 :" + data);
		notify(); // 다른 스레드를 실행대기 상태로 변경한다.
	}
}