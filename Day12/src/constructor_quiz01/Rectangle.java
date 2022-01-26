package constructor_quiz01;

public class Rectangle {

	
	// 필드
	
	private int width;
	private int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 "+ width + "cm, 세로 "+height + "cm 사각형이 만들어졌습니다.");
	}
	
	
	//메소드
	public int area() {
		return this.width * this.height;
	}
	
	public int round() {
		return this.width *2 + this.height * 2;
	
	}
}
