package Inheritance_ex01;

public class InheritanceTest {

	public static void main(String[] args) {

//		Person person = new Person("신보람");
//		
//		person.introduce();
		// 상속관계에서 부모 생성자가 먼저 불린 후 자식 생성자가 불려진다. 
		Student student = new Student("이유진", "바이오자원");
		student.introduce();
		
	}

}

