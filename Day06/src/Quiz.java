import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
//		System.out.println("수를 입력하세요");
//		int number = scan.nextInt(); // 10
//		int sum = 0;
//		for (int i = 1;i<=number;i++) {
//			sum = i + sum;
//		}System.out.println(sum);
//		
		
//		System.out.println("수를 입력하세요");
//		int num = scan.nextInt();
//		int fact = 1;
//		for(int i = 1; i <= num; i++ ) {
//			fact *= i;
//		}
//		System.out.println(fact);
		
		System.out.println("수를 입력하세요");
		int i = scan.nextInt();
		
		for(int j = 1; j <= i; j++) {
			if(i%j == 0) {
				System.out.println(j);
			}
		}
		
		
		
		scan.close();
		
	}

}
