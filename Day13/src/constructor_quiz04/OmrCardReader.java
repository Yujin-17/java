package constructor_quiz04;

import java.util.Scanner;

public class OmrCardReader {
//	2. OmrCardReader Ŭ����
//	����ü ���� �� ������ ���� 5���� �Է¹޾� ���� �迭�� �����صд�.
//	��OmrCard �ϳ��� �Է¹޾Ƽ� �̸�, �й�, ����(100�� ����)�� ����Ѵ�.
	
	
	// �ʵ�
	private int[] answer = new int[5];
	
	// ������ 
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
	
	// �޼ҵ�
	void Answer5() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� 5������ �Է����ּ���");
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
