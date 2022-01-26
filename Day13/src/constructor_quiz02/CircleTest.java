package constructor_quiz02;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(8);
		System.out.println("원의 넓이: " + c1.calculateArea());
		System.out.println("원의 둘레: " + c1.calculateRound());
		System.out.println("원의 25개 넓이: "+ c1.calculateArea(25));
	}

}
