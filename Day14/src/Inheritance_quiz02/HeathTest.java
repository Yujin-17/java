package Inheritance_quiz02;

public class HeathTest {

	public static void main(String[] args) {
		// 객체 생성, 이름, 몸무게, 키
		
		// 자식 클래스로 객체를 생성할 때 부모생성자가 먼저 호출된 뒤 자식생성자가 호출됨.
		// 자식 생성자에서 부모 생성자를 (우리가) 호출하지 않으면 자바에서 기본 생성자가 생성된다. 
		// 부모의 기본 생성자를 호출한다. 
		HeathRate rate1 = new HeathRate("박둘리", 160, 45);
		HeathRate rate2 = new HeathRate("홍길동", 168, 90);
		
		
		rate1.showInfo();
		rate2.showInfo();
		
		
	}

}

