package class_quiz01;
//설계도, 자료형
public class StudentData {
	//속성 : 필드
	String name;
	String className;
	int age;
	String phoneNumber;
	
	//행위, 기능 : 메소드 
	void isAdult(){
		if(this.age >= 20) {
			System.out.println(this.name + "은 성인입니다.");
		}else {
			System.out.println(this.name + "은 미성년자입니다.");
		}
	}
	
}
