package class_Ex01;

// 설계도, 새로운 데이터타입(자료형)
public class ScoreData {
	// 1. 속성: 멤버변수, 필드(field),
	int score;
	String subject; 
	int ranking;
	
	// 2. 행위, 기능: 메소드(method)
	void printScoreInfo() {
		System.out.println("과목명: " + this.subject); // this -> 내클래스에 있는 필드. 
		System.out.println("점수: " + this.score);
		System.out.println("등수: " + this.ranking);
	}
}
