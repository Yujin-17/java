package loop_ex;

public class Ex02 {

	public static void main(String[] args) {

		// do-while �� : ������ �����̾ �ѹ��� �����Ѵ�. 
		
		// 3�� �ݺ� 0 1 2 => 3�� 
		int i = 0;
		do {
			System.out.println("do while" + i);
			i++;
		} while (i < 3);
		
		// while�� 
		// 0 ~ 4 => 5�� 
		i = 0;
		while ( i < 5 ) {
			System.out.println(i);
			i++;
		}
		
		
		// for (�ʱ��; ���� ; ������) {}
		// 1 ~ 5 : 5�� 
		for (int j = 1 ; j < 6 ; j++) {
			System.out.println("for" + j);
		}
		System.out.println(" ");
		// 5~ 1 : 5��
		for( int j = 5; j >= 1 ; j--) {
			System.out.println("for" + j);
		}
		
		// 1+2+3+....+10 �հ�
		int sum = 0;
		for(int j = 1; j < 11; j++) {
			sum += j;
			System.out.println(sum);
		}
	}
}
