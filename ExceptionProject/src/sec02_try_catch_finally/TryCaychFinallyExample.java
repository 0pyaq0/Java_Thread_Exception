package sec02_try_catch_finally;

public class TryCaychFinallyExample {

	public static void main(String[] args) {
		
		try {
			
			Class clazz = Class.forName("java.lang.String");
			//Class clazz = Class.forName("java.lang.String2"); 
			// ClassNotFoundException ���ܰ� �߻��ϱ� ������ catch �������� 
			// ������ �ű��.
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}
		
	}
}
