package Inheritance_ex01;

// �θ� Ŭ���� , Super Class
public class Person {
	protected String name;
	
	public Person() {
		System.out.println("����~~");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("�Ķ���� �ִ� Person ������");
		
	}
	
	public void introduce() {
		// �� �̸��� 00�Դϴ�.
		System.out.println("�� �̸��� " + this.name + "�Դϴ�.");
	}

}
