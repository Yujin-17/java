package constructor_quiz04;

import java.util.Scanner;

public class OmrCard {
//1. OmrCard Ŭ����
//	�������� ���������� ���� ������ �� 5���̴�.(���� 1~5�߿� �ϳ��� ���� ����)
//	���й��� �̸��� �Է� �޴´�.
//	��������� �л��� �� 5���� �Է¹޴� �޼ҵ带 �����.
	
	// �ʵ�
	private int studentNumber;
	private String studentName;
	private int[] answer= new int[5];
	
//	// ������
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
	
	// �޼ҵ� 
	void Answer5() {
		this.answer[0] = 3;
		this.answer[1] = 4;
		this.answer[2] = 5;
		this.answer[3] = 1;
		this.answer[4] = 2;
		
		
		
		
		
	}

	
	
}
