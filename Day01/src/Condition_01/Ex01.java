package Condition_01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("몸무게를 입력하세요");
		int weight = scan.nextInt();
		
		// 만약에 몸무게가 60키로 미만이면 "치킨"
		
		if (weight < 60) {
			System.out.println("치킨먹자");
		}
		
		// 만약에 몸무게가 100키로 이상이면 "다이어트 시작"
		if (weight >= 100) {
			System.out.println("다이어트 시작");
		}
		
		// 만약에 몸무게가 68키로이면 "몸무게는 68키로 입니다"
		if (weight == 68) {
			System.out.println("몸무게는 68키로 입니다");
		}
		
		// 만약에 몸무게가 75키로가 아니면 "75키로가 아닙니다"
		if (weight != 75) {
			System.out.println("75키로가 아닙니다");
	}
		
		
	}
	
	

}
