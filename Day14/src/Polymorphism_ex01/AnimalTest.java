package Polymorphism_ex01;

// 모든 클래스는 우리가 만든 자료형..
public class AnimalTest {

	public static void main(String[] args) {

		// Animal animal = new Animal();

		// 캐스팅 문법
		int number = (int) 1.5;
		// 자바는 단일상송 -> 부모가 하나

		// up casting(업캐스팅): 자식 -> 부모로 캐스팅
		// 1. 부모클래스의 메소드를 사용할 수 있다.
		// 2. 부모클래스에 있는 메소드를 오버라이드 한 메소드로 사용할 수 있다.
		// 3. 자식클래스에만 있는 메소드는 사용할 수 없다.
		Animal animal = new Dog();
		animal.cry();
		animal.eat();
		// animal.grooming(); 사용불가

		// down casting: 부모 -> 자식 캐스팅
		// 1. 자식클래스가 여러개이기 때문에 명확하게 캐스팅 문법을 명시해주어야 한다. 
		// 2. 어떤 자식 클래스인지 instanceof 명령어를 사용해서 검사해야 한다. 
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.cry();
			cat.eat();
			cat.grooming();
		} else if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.cry();
			dog.eat();
			dog.lash();
		}

	}

}
