package Condition_01;

import java.util.Scanner;
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int i = scan.nextInt();
//		
//		if (i < 10) {
//			System.out.println("10보다 작다");
//		}else if(i == 10){
//			System.out.println("같다");
//		}
//			System.out.println("10보다 크다");
//		
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if(a > b) {
//			System.out.println("a가 더 큽니다");
//		}else if(a < b) {
//			System.out.println("b가 더 큽니다");
//		}System.out.println("같습니다");
		
		
//		System.out.println("성적을 입력하세요");
//		int score = scan.nextInt();
//		
//		if (score >= 70) {
//			System.out.println("합격입니다.");
		
		int number = scan.nextInt();
		
		boolean isEven = number % 2 == 0;
		
		if (isEven) {
			System.out.println("짝수");
		}else System.out.println("홀수");
	}
	
	

}
