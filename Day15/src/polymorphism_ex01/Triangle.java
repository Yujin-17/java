package polymorphism_ex01;

public class Triangle extends Shape {

	private int base; // �غ�
	private int height; // ����
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	@Override
	public void printArea() {
		System.out.println("������ �ﰢ���̸� ���̴� "+ this.base*this.height/2);
	}
}
