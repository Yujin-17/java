package loop_ex;

public class Ex03 {

	public static void main(String[] args) {

		// break�� : break�� ���� ���� ���� ����� �ݺ������� �������´�. 
		
		// ���ѷ������� �ټ��� ��� 0 ~ 4 => 5
		int i = 0;
		while (true) { // 0 1 2 3 4      5
			if (i ==5 ) {  // 0 1 2 3 4
				break;
			}
			System.out.println("���ѷ��� " + i );
			i++;
		}
		
		// for�� ���ѷ��� 
		for (int j = 0 ; ; j++) { // ���ǿ� true�� �ְų� ������ ������ ���ѷ��� 
			if( j == 5 ) {
			break;
		}
		System.out.println(j);
	}
		
		
		// continue: skip. �Ʒ� �ڵ���� �������� �ʰ� ��� ������ ���� ����. 
		
		// 1 ~ 10 4�� ����� ���� ������� �ʱ�.
		// 1 2 3 5 6 7 9 10
		
		for(int j = 1; j < 11; j++) {
			if (j % 4 != 0) { // 4�� ����� �ƴ� �� 
				System.out.print(j + " ");
			}
		}System.out.println();
	
		//2. continue
		for(int j = 1; j < 11 ; j++) {
			// 4�� ��� �� �� 
			if(j % 4 == 0) {
				// ����� �ǳʶڴ�. >> continue���� �����ڸ��� �ٽ� ���������� �ö�. 
				continue;
			}
			System.out.print(j + " ");
		}
		
	}
}