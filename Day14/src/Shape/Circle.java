package Shape;

public class Circle extends Shape {
	protected int radius;

	public Circle(int radius) {

	}
	@Override
	public void printArea() {
		System.out.println("도형은 원이며 넓이는 " + (3.14 * 3.14 * radius));
	}
}
