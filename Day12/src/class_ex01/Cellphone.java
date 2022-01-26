package class_ex01;

// 설계도
public class Cellphone {

	//속성: 필드
	String maker = "samsung";
	String model = "galaxy";
	String color ="pink";
	int price=  100;
	
	// 행위, 기능: 메소드
	public void call() {
		System.out.println("전화하기");
	}
	
	public void camera() {
		System.out.println("카메라");
	}
	
	
}
