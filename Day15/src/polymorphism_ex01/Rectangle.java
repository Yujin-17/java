package polymorphism_ex01;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	@Override
	public void printArea() {
		System.out.println("도형은 사각형이며 넓이는 "+ this.height*this.width);
	}
}
