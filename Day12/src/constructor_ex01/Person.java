package constructor_ex01;
// ������(Constructor)
public class Person {
	// �Ӽ�: ��� ���� �Ǵ� field
	// ����ȭ(hiding)
	private String birth;
	private String gender;
	private String name;

	// ���: method
	
	// ������(Constructor): ��ü�� ������ �� �ڵ����� �ҷ����� Ư���� �޼ҵ� 
	// ����Ÿ���� �������� �ʴ´�. 
	public Person() {
		System.out.println("����~");
	}
	
	// ������ �����ε�(Overloading) : ���� �̸��� ���� �޼ҵ� ��
							//	   �Ķ������ Ÿ���� �ٸ��ų�, ������ �ٸ��ų� 
	 						//	   ��ġ�ϴ� �޼ҵ尡 ���õȴ�. 
	public Person(String name, String birth, String gender) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		System.out.println("�Ķ���� ����¥�� ������ ȣ��");
	} 
	
	// ĸ��ȭ(encapsulation) - getter, setter
	public String getName() {
		return this.name;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public String getGender() {
		return this.getGender();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	void greet() {
		System.out.println("�ȳ��ϼ���");
	}

	void walk() {
		System.out.println("�ȱ�");
	}

	void introduce() {
		System.out.println("�� �̸��� " + name + "�̰� ������" + gender + "�̴�.");
	}

	void printAge() {
		int year = Integer.parseInt(birth.substring(0, 4));
		int age = 2021 - year + 1;
		System.out.println("���̴� " + age + "�� �̴�.");
	}
}
