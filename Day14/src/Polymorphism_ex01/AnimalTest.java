package Polymorphism_ex01;

// ��� Ŭ������ �츮�� ���� �ڷ���..
public class AnimalTest {

	public static void main(String[] args) {

		// Animal animal = new Animal();

		// ĳ���� ����
		int number = (int) 1.5;
		// �ڹٴ� ���ϻ�� -> �θ� �ϳ�

		// up casting(��ĳ����): �ڽ� -> �θ�� ĳ����
		// 1. �θ�Ŭ������ �޼ҵ带 ����� �� �ִ�.
		// 2. �θ�Ŭ������ �ִ� �޼ҵ带 �������̵� �� �޼ҵ�� ����� �� �ִ�.
		// 3. �ڽ�Ŭ�������� �ִ� �޼ҵ�� ����� �� ����.
		Animal animal = new Dog();
		animal.cry();
		animal.eat();
		// animal.grooming(); ���Ұ�

		// down casting: �θ� -> �ڽ� ĳ����
		// 1. �ڽ�Ŭ������ �������̱� ������ ��Ȯ�ϰ� ĳ���� ������ ������־�� �Ѵ�. 
		// 2. � �ڽ� Ŭ�������� instanceof ��ɾ ����ؼ� �˻��ؾ� �Ѵ�. 
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
