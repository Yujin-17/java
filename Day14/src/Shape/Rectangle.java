package Shape;

public class Rectangle extends Shape {

	protected int width;
	protected int length;

	public Rectangle(int width, int length) {
	}
	@Override
	public void printArea() {
		System.out.println("도형은 사각형이며 넓이는 " + this.width * this.length);
	}
}
