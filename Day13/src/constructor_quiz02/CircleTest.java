package constructor_quiz02;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(8);
		System.out.println("���� ����: " + c1.calculateArea());
		System.out.println("���� �ѷ�: " + c1.calculateRound());
		System.out.println("���� 25�� ����: "+ c1.calculateArea(25));
	}

}
