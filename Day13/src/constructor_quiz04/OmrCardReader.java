package constructor_quiz04;

import java.util.Scanner;

public class OmrCardReader {
//	2. OmrCardReader 클래스
//	＊객체 생성 시 문제의 정답 5개를 입력받아 정답 배열에 저장해둔다.
//	＊OmrCard 하나를 입력받아서 이름, 학번, 점수(100점 만점)를 출력한다.
	
	
	// 필드
	private int[] answer = new int[5];
	
	// 생성자 
//	public OmrCardReader(int[] answer) {
//		this.answer = answer;
//		return; 
//	}
	
	
	// getter
	public int[] getAnswer() {
		return this.answer;
	}
	// setter
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	
	// 메소드
	void Answer5() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("답 5가지를 입력해주세요");
		this.answer[0] = scan.nextInt();
		this.answer[1] = scan.nextInt();
		this.answer[2] = scan.nextInt();
		this.answer[3] = scan.nextInt();
		this.answer[4] = scan.nextInt();
		
		OmrCard O = new OmrCard();

		
		
		for(int i= 0 ; i < answer.length;i++) {
			if(O.getAnswer()[i] == this.answer[i]) {
				
			}
		}
		
		
		scan.close();
}
}
