package constructor_quiz04;

public class OmrCardTest {

	public static void main(String[] args) {
//		3. OmrCardTest 클래스
//		- OMR 카드와 카드 리더기 객체를 만드는 클래스
//		- OmrCard 객체에는 정답을 입력한다.
//		- OmrCardReader 객체에는 위에서 만든 OmrCard를 넣어 결과를 받는다.
//		이름: 신보람
//		학번: 20200302
//		점수: 80점
		OmrCard O1 = new OmrCard();
		
		OmrCardReader OR1 = new OmrCardReader();
		
		O1.Answer5();
		System.out.println("OMR 정답을 입력하세요 5문제");
		OR1.Answer5();
		
		O1.setStudentName("신보람");
		O1.setStudentNumber(20200302);
		
		System.out.println("이름: " + O1.getStudentName());
		System.out.println("학번: " + O1.getStudentNumber());
		System.out.println("점수: " );
		
		
		
		
		
	}

}
