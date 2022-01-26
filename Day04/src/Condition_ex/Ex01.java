package Condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		if-else문 
		System.out.println("몸무게를 입력하세요: ");
		int weight = scan.nextInt();
//		
//		//만약에 몸무게가 70키로 이하이면 치킨, 아니면 샐러드 
//		if (weight<=70) {
//			System.out.println("치킨먹자");
//		}else System.out.println("샐러드나 먹엉");
		
		// if-else if-else 문 
//		if (weight <= 70) { // 70이하
//			System.out.println("치킨 먹자");
//		}else if (weight <= 75 ) { // 71 ~ 75
//			System.out.println("닭가슴살 먹자");
//		}else if (weight <= 80) {   // 76 ~ 80
//			System.out.println("샐러드 먹자");
//		} else {	// 81~
//			System.out.println("굶자");
//		}
//		
		scan.close();
	}

}
