package constructor_quiz04_correct;

public class OmeCardTest {

	public static void main(String[] args) {
		//�ǽ��� �帧
		OmrCard omrCard = new OmrCard();
		omrCard.setName("�ź���");
		omrCard.setStudentId(20200302);
		omrCard.setAnswer(5, 2, 1, 4, 4);
		
		OmrCardReader reader = new OmrCardReader(5, 1, 1, 3, 4);
		reader.printScoreInfo(omrCard);
	}

}
