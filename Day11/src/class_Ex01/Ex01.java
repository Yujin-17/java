package class_Ex01;

public class Ex01 {

	public static void main(String[] args) {
		// ���� �ǽ�  �帧
		ScoreData sd1 = new ScoreData(); //  sd1 => ��ü(Object), 
										 //			ScoreData�� instance
		// �ʵ忡 �� �ֱ� 
		sd1.score = 85;
		sd1.subject = "����";
		sd1.ranking = 7;
		
		// �ʵ� �� ����ϱ� 
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.ranking);
		
		sd1.printScoreInfo();
		
		ScoreData sd2 = new ScoreData();
		
		
		
		
	}

}
