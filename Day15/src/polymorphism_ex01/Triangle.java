package polymorphism_ex01;

public class Triangle extends Shape {

	private int base; // 밑변
	private int height; // 높이
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	@Override
	public void printArea() {
		System.out.println("도형은 삼각형이며 넓이는 "+ this.base*this.height/2);
	}
}
