package constructor_quiz01;

public class RectangelTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(30, 50);
		
		System.out.println("����:" + r1.area() + "cm^2");
		System.out.println("�ѷ�:" + r1.round() + "cm");

		Rectangle r2 = new Rectangle(10, 10);
		
		System.out.println("����:" + r2.area() + "cm^2");
		System.out.println("�ѷ�:" + r2.round() + "cm");
		
	}

}
