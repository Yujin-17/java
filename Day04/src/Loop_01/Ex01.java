package Loop_01;

public class Ex01 {

	public static void main(String[] args) {

		//while������ �ȳ� 3������ 
		
		int i = 0; // ī���� ���� 
		while ( i < 3 ) {   // 
			System.out.println("�ȳ�" + i);
			// i = i + 1;
//			i += 1;  // ���� ���� ������
			// i++; // ���� ������ (����)
			 ++i; // ���� ������ (����) 
		}
		
		
		// ++i, i++ ������ 
		int number = 15;
		System.out.println("number:" + number ); // 15
		System.out.println("++number" + (++number)); // 16
		System.out.println("number++" + (number++)); // 16
		System.out.println("number:" + number); //17
		
	}

}
