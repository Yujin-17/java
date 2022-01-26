package Shape;

public class Triangle extends Shape {
	protected int base;
	protected int height;

	public Triangle(int base, int height) {

	}
	@Override
	public void printArea() {
		System.out.println("도형은 삼각형이며 넓이는 " + this.base * this.height / 2);
	}
}
