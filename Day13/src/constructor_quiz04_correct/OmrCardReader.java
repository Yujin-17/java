package constructor_quiz04_correct;

public class OmrCardReader {

	private int[] correctAnswer = new int[5]; //��¥ ���� 
	
	// ��¥ ������ '�����'�κ��� �Է� ���� => Ȯ�强�� ���� 
	public OmrCardReader(int a, int b, int c, int d, int e) {
		this.correctAnswer[0] = a;
		this.correctAnswer[1] = b;
		this.correctAnswer[2] = c;
		this.correctAnswer[3] = d;
		this.correctAnswer[4] = e;
	}
	
	// ī�带 �о ����� ������ ���� ���
	public void printScoreInfo(OmrCard omrCard) {
		System.out.println("�̸�: " + omrCard.getName());
		System.out.println("�й�: " + omrCard.getStudenId());
		
		int score = 0;
		for(int i = 0; i < this.correctAnswer.length; i++) {
			if(this.correctAnswer[i] == omrCard.getAnswer()[i]) {
				score += 20;
			}
		}
		System.out.println("����: " + score);
	}
}
