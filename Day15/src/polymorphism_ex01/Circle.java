package polymorphism_ex01;

public class Circle extends Shape{

	private int radian;
	
	public Circle(int radian) {
		this.radian = radian;
	}
	@Override
	public void printArea() {
		System.out.println("도형은 삼각형이며 넓이는 " + this.radian*this.radian/2);
	}
}
