package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * ��ø �ݺ���: �ݺ��� �ȿ� �ݺ��� 
		 * 		�ٱ� �ݺ���: õõ�� ����. ��Ʈ  (��)
		 * 		���� �ݺ���: ���� ����. Ƚ�� (��)
		 */
		
		// ����Ʈ 10ȸ
		
		for(int i = 1; i < 11; i++) {
			System.out.println("����Ʈ "+ i);
		}
		
		// ����Ʈ 3��Ʈ 10ȸ�� 
		for (int i = 1; i<4; i++) { // ��Ʈ 1 2 3
			for(int j = 1; j < 11; j++) {
				System.out.println("����Ʈ " + j + "��Ʈ" + i);
			}
		}
		// ����¥�� �� 5�� ���
		// *****
//		for (int i = 0; i < 5 ; i++) {
//			System.out.print("*");
//		}

		// ����¥�� �� 5���� 3�� ���
		for ( int i = 0; i <3; i++) {   // ���� ����
			for(int j = 0 ; j < 5 ; j++) { // ���� ����
				System.out.print("*");
			}
			System.out.println(); // �� ���� ������ ������ �ٹٲ� 
		}
}
}
