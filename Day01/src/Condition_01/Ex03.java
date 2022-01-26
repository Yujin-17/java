package Condition_01;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		
		// number가 10이상이고(그리고 AND) 40이하이다. 10 <= number <= 40
		if (number >= 10 && number <= 40) {
			System.out.println("10이상이고 40 이하");
		}	
		
		// number가 10보다 작거나(또는 OR) 40보다 크다. number < 10 또는 number > 40
		if (number < 10 || number > 40) {
			System.out.println("10보다 작거나 40보다 크다");
		}
	}
	
	

}
