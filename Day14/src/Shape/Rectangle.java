package Shape;

public class Rectangle extends Shape {

	protected int width;
	protected int length;

	public Rectangle(int width, int length) {
	}
	@Override
	public void printArea() {
		System.out.println("������ �簢���̸� ���̴� " + this.width * this.length);
	}
}
