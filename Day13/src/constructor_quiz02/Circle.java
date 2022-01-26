package constructor_quiz02;

public class Circle {

	// 속성: 필드
	private int radius;
	
	// 행위, 기능: 메소드
	
	// 생성자
	public Circle (int radius) {
		this.radius = radius;
	}
	
	// 넓이 구하기
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	// 둘레 구하기
	public double calculateRound() {
		return this.radius * 2 * Math.PI;
	}
	// 개수의 따른 넓이 
	// overloading: 메소드 이름은 같은데 파라미터의 개수가 다르거나
	// 파라미터의 타입이 다른 경우
	// 다른 메소드로 인지하고 일치하는 메소드로 자동 호출 되는 것 
	public double calculateArea(int count) { // 확장성을 위해 파라미터로 개수 받음
		return this.calculateArea() * count;
		
	}
}
