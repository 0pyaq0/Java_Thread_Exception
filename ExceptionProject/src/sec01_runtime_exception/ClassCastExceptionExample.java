package sec01_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		//Animal animal = new Dog(); // up-casting발생
		//Dog dog = (Dog) animal; // down-casting
		//Cat cat = (Cat) animal; // ClassCastException 예외 발생
		// 다운 캐스팅 할수 없다.
		//Dog dog =new Dog();
		//ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(cat);
					

	}
	public static void ChangeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println("다운 캐스팅이 잘 되었음");
		} else {
			System.out.println("Dog으로 변환이 어렵습니다.");
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
