package class_quiz01;

public class Person {
	//필드
	String name;
	String birth;
	String gender;
	//메소드
	void hello(){
		System.out.println("안녕하세요");
	}
	void walk() {
		System.out.println("현재 걷는 중 입니다");
	}
	void mine() {
		System.out.println("제 이름은 "+ this.name + "이고 성별은 "+ this.gender+ "입니다.");
	}
	void age() {
		String a = this.birth.substring(0, 4);
		int age = Integer.valueOf(a);
		System.out.println("나이는 " + ( 2021 - age + 1)+ "세 입니다.");
	}
}


