package Inheritance_ex01;

// 부모 클래스 , Super Class
public class Person {
	protected String name;
	
	public Person() {
		System.out.println("응애~~");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("파라미터 있는 Person 생성자");
		
	}
	
	public void introduce() {
		// 내 이름은 00입니다.
		System.out.println("내 이름은 " + this.name + "입니다.");
	}

}
