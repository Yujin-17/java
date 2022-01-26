package constructor_quiz04;

import java.util.Scanner;

public class OmrCard {
//1. OmrCard 클래스
//	＊문제는 객관식으로 문제 개수는 총 5개이다.(답은 1~5중에 하나만 선택 가능)
//	＊학번과 이름을 입력 받는다.
//	＊순서대로 학생의 답 5개를 입력받는 메소드를 만든다.
	
	// 필드
	private int studentNumber;
	private String studentName;
	private int[] answer= new int[5];
	
//	// 생성자
//	public OmrCard(int studentNumber, String studentNamer) {
//		this.studentNumber = studentNumber;
//		this.studentName = studentName;
//		
//	}
	
	// getter
	public int[] getAnswer() {
		return this.answer;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public int getStudentNumber() {
		return this.studentNumber;
	}
	
	// setter
	public void setAnswer(int[] answer1) {
		this.answer = answer1;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// 메소드 
	void Answer5() {
		this.answer[0] = 3;
		this.answer[1] = 4;
		this.answer[2] = 5;
		this.answer[3] = 1;
		this.answer[4] = 2;
		
		
		
		
		
	}

	
	
}
