package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("������", "19990717","����");
//		p1.name = "������";
//		p1.berth = "19990717";
//		p1.gender = "����";
		
		p1.setName("������");
		p1.setBirth("19990717");
		p1.setGender("����");

		p1.greet();
		p1.walk();
		p1.introduce();
		p1.printAge();
	}

}
