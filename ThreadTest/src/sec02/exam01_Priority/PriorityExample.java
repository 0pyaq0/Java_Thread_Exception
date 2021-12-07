package sec02.exam01_Priority;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			Thread thread = new CalcThread("thread"+i); // 
			if( i != 5 ) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
		// TODO Auto-generated method stub

	}

}
