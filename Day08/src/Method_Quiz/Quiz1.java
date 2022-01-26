package Method_Quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("수를 입력하세요: ");
//		int number = scan.nextInt();
//		
//		System.out.println(getSumUntil100(number));
		
//		System.out.print("5개의 수를 입력하세요 : ");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int number3 = scan.nextInt();
//		int number4 = scan.nextInt();
//		int number5 = scan.nextInt();
//	
//		//int min = Integer.MAX_VALUE;
//		printMin(number1, number2, number3, number4, number5);
		
		// 리팩토링 //리팩토링 마틴 파울러 책 추천 
	
		System.out.print("수를 입력하세요: ");
		int number = scan.nextInt();
		
		System.out.println(isPrimeNumber(number));
		
		scan.close();
	}
	
	public static boolean isPrimeNumber(int number) {
		//2보다 큰 수를 2부터 number-1 까지 나눠본다. => 하나라도 나눠떨어지면 소수 아님 
		for(int i = 2; i < number; i++) {
			if(number%i == 0) {
				return false;
			}
		} 
		// 여기까지 도달하면 나누어 떨어지는 수가 없거나, 2인 경우 (반복문에 도달안함) 소수 
		return true; 
	}

	public static void printMin(int number1, int number2, int number3, int number4, int number5) {
		int min = number1;
		if(min > number2) {
			min = number2;
		}
		if(min > number3) {
			min = number3;
		}
		if(min > number4) {
			min = number4;
		}
		if(min > number5) {
			min = number5;
		}
		System.out.println("최소값은 : " + min);
	}

	public static int getSumUntil100(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = i + sum;
			if(sum >100) {
				break; 
			}
		}
		return sum;
	}
	

}
