package loop_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 0 ~ 4 :  5번
		int i = 0;
		while (i < 5) {
			System.out.println("마우스 " + i);
			i += 1;
		}
		
		// 1 ~ 5: 5번 
		i = 1;
		while (i <= 5) {
			System.out.println("자몽 " + i);
			i++;
		}
		
		
		// 5 ~ 0 : 6번 
		i = 5;
		while ( i >= 0 ) {
			System.out.println("오렌지 " + i);
			i--;
			//i -= 1;
		}
		
		// 1+2+3+4+.....+10 합계
		
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
