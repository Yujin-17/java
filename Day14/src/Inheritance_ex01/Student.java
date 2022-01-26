package Inheritance_ex01;

// 자식 클래스
public class Student extends Person{
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		super(name); // 부모 생성자는 항상 첫줄에 있어야 한다. 
		//super.name = name;
		//this.name = name;
		this.major = major;
	}
	
	// 오버라이드(Override): 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것 
	@Override
	public void introduce() {
		System.out.println("내 전공은 " + this.major + "입니다.");
		super.introduce();
	}
}
