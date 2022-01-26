package constructor_quiz04_correct;

public class OmrCardReader {

	private int[] correctAnswer = new int[5]; //진짜 정답 
	
	// 진짜 정답을 '사용자'로부터 입력 받음 => 확장성을 위해 
	public OmrCardReader(int a, int b, int c, int d, int e) {
		this.correctAnswer[0] = a;
		this.correctAnswer[1] = b;
		this.correctAnswer[2] = c;
		this.correctAnswer[3] = d;
		this.correctAnswer[4] = e;
	}
	
	// 카드를 읽어서 사람의 정보와 점수 출력
	public void printScoreInfo(OmrCard omrCard) {
		System.out.println("이름: " + omrCard.getName());
		System.out.println("학번: " + omrCard.getStudenId());
		
		int score = 0;
		for(int i = 0; i < this.correctAnswer.length; i++) {
			if(this.correctAnswer[i] == omrCard.getAnswer()[i]) {
				score += 20;
			}
		}
		System.out.println("점수: " + score);
	}
}
