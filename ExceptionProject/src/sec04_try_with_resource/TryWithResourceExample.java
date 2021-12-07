package sec04_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try ( FileInputStream fis = new FileInputStream("file.txt") ){ // �� ������ �ǹ̴� file�� �ڵ�����
			// �ݾ� �ش�.
			
			fis.read();
			throw new Exception();
			// ���������� ���ܸ� �߻���Ŵ
			// ����ó�� ���� close()�޼ҵ带 ȣ���Ѵ�.
			
			// ���α׷��� ����ɶ� 
			// FileInputStreamŬ������ close()�޼ҵ尡 
			// �ڵ����� ȣ��ȴ�.
		} catch(Exception e) {
			System.out.println("����ó�� �ڵ尡 ����Ǿ����ϴ�");
		}
	}

}
