package polymorphism_ex01;
// 부모클래스
public class Shape {
	
	protected String name;
	protected double area;

	public void printArea() {
		System.out.println("도형은 "+ this.name + "이며 넓이는 "+ this.area + "cm^2입니다.");
		
	}
}
