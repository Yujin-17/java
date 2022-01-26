package loop_ex;

public class Ex02 {

	public static void main(String[] args) {

		// do-while 문 : 조건이 거짓이어도 한번은 수행한다. 
		
		// 3번 반복 0 1 2 => 3번 
		int i = 0;
		do {
			System.out.println("do while" + i);
			i++;
		} while (i < 3);
		
		// while문 
		// 0 ~ 4 => 5번 
		i = 0;
		while ( i < 5 ) {
			System.out.println(i);
			i++;
		}
		
		
		// for (초기식; 조건 ; 증감식) {}
		// 1 ~ 5 : 5번 
		for (int j = 1 ; j < 6 ; j++) {
			System.out.println("for" + j);
		}
		System.out.println(" ");
		// 5~ 1 : 5번
		for( int j = 5; j >= 1 ; j--) {
			System.out.println("for" + j);
		}
		
		// 1+2+3+....+10 합계
		int sum = 0;
		for(int j = 1; j < 11; j++) {
			sum += j;
			System.out.println(sum);
		}
	}
}
