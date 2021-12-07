package sec03_multi_catch;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1]; // ArrayIndexOutOfBoundsException예외가 발생하면
			// catch(ArrayIndexOutOfBoundsException e){ }문장을 실행
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // NumberFormatException예외가 발생하면
			// catch(NumberFormatException e) {} 문장을 실행
			int result = value1+value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(Exception e) { // 모든 예외를 잡을수 있다.
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행 하세요.");
		}
	}
}