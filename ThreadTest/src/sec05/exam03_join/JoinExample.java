package sec05.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		// sumThread객체의 스레드의 실행이 끝나기 전에 main()의 출력문이 실행되고
		// main()스레드가 종료
		
		
		try { 
			sumThread.join(); 
			// sumThread객체의 스레드가 종료될때 까지 main()스레드의 실행을 중지시킨다.
			// sumThread객체의 스레드가 종료되면 main스레드가 실행된다.
		} catch (InterruptedException e) {}
		
		System.out.println("1~100까지의 합 : " + sumThread.getSum());

	}

}
