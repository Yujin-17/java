package loop_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 0 ~ 4 :  5��
		int i = 0;
		while (i < 5) {
			System.out.println("���콺 " + i);
			i += 1;
		}
		
		// 1 ~ 5: 5�� 
		i = 1;
		while (i <= 5) {
			System.out.println("�ڸ� " + i);
			i++;
		}
		
		
		// 5 ~ 0 : 6�� 
		i = 5;
		while ( i >= 0 ) {
			System.out.println("������ " + i);
			i--;
			//i -= 1;
		}
		
		// 1+2+3+4+.....+10 �հ�
		
		i = 1;
		int sum = 0;
		while ( i < 11) {
			// sum = sum + i;
			sum += i;
			i++;
			System.out.println(sum);
		}
	}

}
