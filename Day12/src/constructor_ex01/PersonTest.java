package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("이유진", "19990717","여자");
//		p1.name = "이유진";
//		p1.berth = "19990717";
//		p1.gender = "여자";
		
		p1.setName("이유진");
		p1.setBirth("19990717");
		p1.setGender("여자");

		p1.greet();
		p1.walk();
		p1.introduce();
		p1.printAge();
	}

}
