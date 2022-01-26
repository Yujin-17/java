package Condition_ex;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("두 점수를 입력하세요");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		
//		double ave = (score1 + score2) / (double)2;
//		
//		if (ave >= 70) {
//			System.out.println("합격");
//		}else System.out.println("불합격");
//				
//	
		
//		System.out.println("세 개의 수를 입력하세요");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		
//		int max = a;
//		if (max < b) {
//			max = b;
//		} 
//		if (max < c) {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		
//		if (a > b) {
//			if (a > c) {
//				System.out.println(a);
//			}
//		}else if (b > a){
//			if (b > c) {
//				System.out.println(b);
//			}
//		}else System.out.println(c);
//		
		
//		System.out.println("점수1 :");
//		int a = scan.nextInt();
//		System.out.println("점수2 :");
//		int b = scan.nextInt();
//		
//		double ave = (double)(a+b) / 2;
//		
//		if(ave >= 60 && a >= 50 && b >= 50) {
//					System.out.println("합격");
//		}else if (ave >= 60 && (a <= 50 || b <= 50)) {
//			System.out.println("과락");
//		}else System.out.println("불합격");{
//		}
		
//		int year = scan.nextInt();
//		
//		if(year%4 == 0 && year%400 == 0) {
//			System.out.println("윤년");
//		}else if (year%4 == 0) {
//			System.out.println("윤년");
//		}else if (year%4 == 0 && year%100 != 0){
//			System.out.println("평년");
//		} else System.out.println("평년");
//		
//	
//		if (year % 400 == 0) {
//			System.out.println("윤년");
//		} else if(year % 100 == 0) {
//			System.out.println("평년");
//		} else if (year % 4 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
//		

		// 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않는 연도는 윤년이다. 
		// 또는 
		// 400으로 나누어 떨어지는 연도 
		// 윤년 
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
//		

		
		System.out.println("윷 상태를 입력하세요: ");
		int st1 = scan.nextInt();
		int st2 = scan.nextInt();
		int st3 = scan.nextInt();
		int st4 = scan.nextInt();
		
		int sum = st1 + st2 + st3 + st4;
		
		if (sum == 1 ) {
			System.out.println("도");
		}else if( sum == 2) {
			System.out.println("개");
		}else if( sum == 3) {
			System.out.println("걸");
		}else if( sum == 4) {
			System.out.println("윷");
		}else {
			System.out.println("모");
		}
	
	
		scan.close();
	}
}



