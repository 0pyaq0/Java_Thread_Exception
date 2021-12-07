package sec04_try_with_resource;

public class FileInputStream implements AutoCloseable  {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;// file="file.txt"
	}
	
	public void read() {
		System.out.println(file+"�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"�� �ݽ��ϴ�.");
	}
}