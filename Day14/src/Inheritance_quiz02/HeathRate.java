package Inheritance_quiz02;

public class HeathRate extends HealthInfo {

	public HeathRate(String name, int height, int weight) {
		super(name, height, weight);
	}

	/*
	 * 표준체중:SW=(H-100)*0.9 비만도: B(%)=(W-SW)/SW * 100
	 * 
	 * 부모 클래스(HeathInfo.java)를 상속받는 비만도 계산 클래스를 설계한다.(HealthRate.java) 표준체중 계산하는
	 * 메소드를 정의한다. 비만 여부를 구하는 메소드를 정의한다. (비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중,
	 * 20%이상은 비만) 
	 * 출력 예시 (HealthTest.java) 박둘리님의 신장 160, 몸무게 45kg => 정상입니다. 
	 * 홍길동님의 신장168, 몸무게 90kg => 비만입니다.
	 */
	// 표준 체중 계산
	private double standardWeight() {
		return (super.height - 100) * 0.9;
	}

	// 비만도 계산
	private double getRate() {
		double sw = standardWeight();
		return (super.weight - sw) / sw * 100;

	}

	// 비만 여부 계산
	private String status() {

		double ratio = getRate();
		if (ratio < 10) {
			return "정상";
		} else if (ratio < 20) {
			return "과제충";
		} else return "비만";
		
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(status());
	}
}