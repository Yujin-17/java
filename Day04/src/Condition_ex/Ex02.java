package Condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		int number = scan.nextInt();
		
		// if-else if -else
//		if (number == 1) {
//			System.out.println("1이다.");
//		} else if (number == 2) {
//			System.out.println("2이다");
//		} else {
//			System.out.println("1이나 2가 아니다.");
//		}
//		
		// switch문: 조건이 '같다' 조건일 때 if문을 대체해서 사용 가능 
		// case에 해당했을 때 조건을 빠져나오고 싶으면 break문 사용 
		
		switch (number) {
		case 1: 
			System.out.println("1");
			break;
		case 2: 
			System.out.println("2");
			break;
		default: 
			System.out.println("1이나 2가 아니다.");
		}
		
		
		scan.close();
	}

}
