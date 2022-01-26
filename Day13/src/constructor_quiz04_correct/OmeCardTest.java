package constructor_quiz04_correct;

public class OmeCardTest {

	public static void main(String[] args) {
		//의식의 흐름
		OmrCard omrCard = new OmrCard();
		omrCard.setName("신보람");
		omrCard.setStudentId(20200302);
		omrCard.setAnswer(5, 2, 1, 4, 4);
		
		OmrCardReader reader = new OmrCardReader(5, 1, 1, 3, 4);
		reader.printScoreInfo(omrCard);
	}

}
