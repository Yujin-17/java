package Inheritance_ex01;

// �ڽ� Ŭ����
public class Student extends Person{
	private String major;
	
	public Student() {
		System.out.println("�л��Դϴ�.");
	}
	
	public Student(String name, String major) {
		super(name); // �θ� �����ڴ� �׻� ù�ٿ� �־�� �Ѵ�. 
		//super.name = name;
		//this.name = name;
		this.major = major;
	}
	
	// �������̵�(Override): �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������ �ϴ� �� 
	@Override
	public void introduce() {
		System.out.println("�� ������ " + this.major + "�Դϴ�.");
		super.introduce();
	}
}
