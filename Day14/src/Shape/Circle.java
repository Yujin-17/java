package Shape;

public class Circle extends Shape {
	protected int radius;

	public Circle(int radius) {

	}
	@Override
	public void printArea() {
		System.out.println("������ ���̸� ���̴� " + (3.14 * 3.14 * radius));
	}
}
