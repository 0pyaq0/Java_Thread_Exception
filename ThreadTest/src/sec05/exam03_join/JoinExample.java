package sec05.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		// sumThread��ü�� �������� ������ ������ ���� main()�� ��¹��� ����ǰ�
		// main()�����尡 ����
		
		
		try { 
			sumThread.join(); 
			// sumThread��ü�� �����尡 ����ɶ� ���� main()�������� ������ ������Ų��.
			// sumThread��ü�� �����尡 ����Ǹ� main�����尡 ����ȴ�.
		} catch (InterruptedException e) {}
		
		System.out.println("1~100������ �� : " + sumThread.getSum());

	}

}
