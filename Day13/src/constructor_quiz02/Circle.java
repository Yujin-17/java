package constructor_quiz02;

public class Circle {

	// �Ӽ�: �ʵ�
	private int radius;
	
	// ����, ���: �޼ҵ�
	
	// ������
	public Circle (int radius) {
		this.radius = radius;
	}
	
	// ���� ���ϱ�
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	// �ѷ� ���ϱ�
	public double calculateRound() {
		return this.radius * 2 * Math.PI;
	}
	// ������ ���� ���� 
	// overloading: �޼ҵ� �̸��� ������ �Ķ������ ������ �ٸ��ų�
	// �Ķ������ Ÿ���� �ٸ� ���
	// �ٸ� �޼ҵ�� �����ϰ� ��ġ�ϴ� �޼ҵ�� �ڵ� ȣ�� �Ǵ� �� 
	public double calculateArea(int count) { // Ȯ�强�� ���� �Ķ���ͷ� ���� ����
		return this.calculateArea() * count;
		
	}
}
