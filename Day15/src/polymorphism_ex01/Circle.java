package polymorphism_ex01;

public class Circle extends Shape{

	private int radian;
	
	public Circle(int radian) {
		this.radian = radian;
	}
	@Override
	public void printArea() {
		System.out.println("������ �ﰢ���̸� ���̴� " + this.radian*this.radian/2);
	}
}
