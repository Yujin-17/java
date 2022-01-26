package nested_loop_ex;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		for(int i = 1; i < 7; i++) {
			System.out.println();
			for (int j = 1; j < 7; j++) {
				System.out.print("(" + i + " , " + j + ")" );
			}
		}
		System.out.println();
		
		for(int i =2 ; i < 10; i++) {
			for ( int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
		
		for(int i = 1 ; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i = 1; i < 6; i++) {
			System.out.println();
			for(int j = 5;j > i;j-- ) {
				System.out.print(" ");
				}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			}
		System.out.println();
		
		
		System.out.println("모래시계 크기를 입력하세요: ");
		 
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int  i, j ;
		
		// 모래시계 > 홀수행 홀수열 *
		for( i = 1; i <= size;i++) {
			if(i%2 == 1) {
				System.out.print("*");
			}else System.out.print("+");
		}System.out.print(" ");
		
		

		scan.close();
		
	}

}
