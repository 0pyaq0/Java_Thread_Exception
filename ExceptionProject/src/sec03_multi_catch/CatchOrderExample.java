package sec03_multi_catch;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1]; // ArrayIndexOutOfBoundsException���ܰ� �߻��ϸ�
			// catch(ArrayIndexOutOfBoundsException e){ }������ ����
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // NumberFormatException���ܰ� �߻��ϸ�
			// catch(NumberFormatException e) {} ������ ����
			int result = value1+value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		}catch(Exception e) { // ��� ���ܸ� ������ �ִ�.
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� ���� �ϼ���.");
		}
	}
}