package Condition_01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("두 점수를 입력하세요");
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if (a >= 70 && b >= 70) {
//			System.out.println("합격");
//		}
		
		
//		System.out.println("수를 입력하세요");
//		
//		int a = scan.nextInt();
//		
//		if (a % 2 == 0 && a % 3 == 0 ) {
//			System.out.println("2와 3의 공배수입니다.");
//		}
		System.out.println("1~10 사이의 수를 입력하세요: ");
		
		int a  = scan.nextInt();
		
		if(a < 1 || a > 10) {
			System.out.println("잘못 입력");
		}
		// validation check => 유효성 검사 
		scan.close();
		
		// 코딩 문제 사이트 추천 
		// 프로그래머스 - 좀 어려움 
		// 백준 
		// LeetCode(취직 하기 직전 보기 좋음/ 해외사이트)
		// 문제 많이많이 풀어보기 익숙해지자.
		// 남는시간 자바공부. 
		// 간단한건 손코딩으로도 해야함.
		// 자료구조 필수!
		// 알고리즘(정렬, Tree)
		// 네트워크
		// 운영체제 h
		
	}

}
