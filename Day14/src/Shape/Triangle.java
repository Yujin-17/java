package Shape;

public class Triangle extends Shape {
	protected int base;
	protected int height;

	public Triangle(int base, int height) {

	}
	@Override
	public void printArea() {
		System.out.println("������ �ﰢ���̸� ���̴� " + this.base * this.height / 2);
	}
}
