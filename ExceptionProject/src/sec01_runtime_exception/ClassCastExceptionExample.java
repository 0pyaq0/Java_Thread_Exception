package sec01_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		//Animal animal = new Dog(); // up-casting�߻�
		//Dog dog = (Dog) animal; // down-casting
		//Cat cat = (Cat) animal; // ClassCastException ���� �߻�
		// �ٿ� ĳ���� �Ҽ� ����.
		//Dog dog =new Dog();
		//ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(cat);
					

	}
	public static void ChangeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println("�ٿ� ĳ������ �� �Ǿ���");
		} else {
			System.out.println("Dog���� ��ȯ�� ��ƽ��ϴ�.");
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
