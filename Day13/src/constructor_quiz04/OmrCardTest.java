package constructor_quiz04;

public class OmrCardTest {

	public static void main(String[] args) {
//		3. OmrCardTest Ŭ����
//		- OMR ī��� ī�� ������ ��ü�� ����� Ŭ����
//		- OmrCard ��ü���� ������ �Է��Ѵ�.
//		- OmrCardReader ��ü���� ������ ���� OmrCard�� �־� ����� �޴´�.
//		�̸�: �ź���
//		�й�: 20200302
//		����: 80��
		OmrCard O1 = new OmrCard();
		
		OmrCardReader OR1 = new OmrCardReader();
		
		O1.Answer5();
		System.out.println("OMR ������ �Է��ϼ��� 5����");
		OR1.Answer5();
		
		O1.setStudentName("�ź���");
		O1.setStudentNumber(20200302);
		
		System.out.println("�̸�: " + O1.getStudentName());
		System.out.println("�й�: " + O1.getStudentNumber());
		System.out.println("����: " );
		
		
		
		
		
	}

}
