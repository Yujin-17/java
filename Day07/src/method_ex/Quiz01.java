package method_ex;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("제곲값을 구할 숫자를 입력하세요: ");
		int x = scan.nextInt();
		System.out.println(x + "의 제곱은 " + getSquared(x));
		
		System.out.println("점수를 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("평균은" + getAverage(a, b, c, d));
		
		// Role을 명확히하라. 제 일이 아니면 하지마라. 책임전가가 이루어질 수 있음. 
		// 모듈화 
		
		System.out.println("숫자와 나눌 수를 입력하세요");
		int i = scan.nextInt();
		int j = scan.nextInt();
		printQuotientRemainder(i, j);
		
		System.out.println("숫자를 입력하세요");
		int o = scan.nextInt();
		printOddEven(o);
	}
	
	// 메소드 만드는 곳 
	public static int getSquared(int x) { // input, output 
		int squared = x * x;
		return squared;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4) / (double)4; // 한쪽을 double로 만들어야 double형이 잘 적용됨 (캐스팅문법) 
		return result;
	}

	
	public static void printQuotientRemainder(int number1, int number2) {
		int x = number1 / number2;
		int y = number1 % number2;
		System.out.println("몫:" + x + "  나머지: " + y );
	}
	
	public static void printOddEven(int a) {
		if(a % 2 == 0) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
			
		
	}
}
	

