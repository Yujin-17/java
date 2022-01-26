package Condition_01;

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 개의 수를 입력하세요:");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		// 만약에 number1이 number2보다 크다.
		if (number1 > number2) { 
			System.out.println(number1+ "이 "+ number2 + "보다 크다");
		}
		// 만약에 number1이 number2보다 작다.
		if (number1 < number2) {
			System.out.println(number1+ "이 "+ number2 + "보다 작다");
		}
		// 만약에 number1과 number2는 같다.
		if (number1 == number2) {
			System.out.println(number1+ "과 "+ number2 + "이 같다");
		}
				
				
	}

}
