package constructor_quiz01;

public class Rectangle {

	
	// �ʵ�
	
	private int width;
	private int height;
	
	// ������
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("���� "+ width + "cm, ���� "+height + "cm �簢���� ����������ϴ�.");
	}
	
	
	//�޼ҵ�
	public int area() {
		return this.width * this.height;
	}
	
	public int round() {
		return this.width *2 + this.height * 2;
	
	}
}
