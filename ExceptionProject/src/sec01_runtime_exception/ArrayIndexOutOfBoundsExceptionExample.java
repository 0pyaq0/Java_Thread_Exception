package sec01_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
/*		
		String data1 = args[0]; // ArrayIndexOutOfBoundsException���� �߻�
		// run Configurations���� Argument�ǿ��� �Է� �޴� ��� �����ʹ� ���ڿ��̴�.\
		// ��) 100 ab300 ---> ���ڿ�
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
*/
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
					
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("������");
			System.out.print("C:javajava ArrayIndexOutOfBoundsExceptionExample ��1 ��2");
		}
	}
}




