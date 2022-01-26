package variable_quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
				
//		System.out.println("x:");
//		int x = scan.nextInt();
//		
//		System.out.println("y:");
//		int y = scan.nextInt();
//		
//		// swap 알고리즘 
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x는 "+ x + " y는 "+ y);
//		

//		System.out.println("초: ");
//		int seconds = scan.nextInt();
//		
//		int min = seconds/60;
//		int sec = seconds % 60;
//		System.out.println(min + "분 " + sec + "초");
//		
//		scan.close();
//		
		//4. 자리수 쪼개기
		//  1234/1000 => 1.234 몫:1 나머지:234
		// 234/100 => 2.34 몫:2 나머지:34
		// 34/10 => 3.4 몫:3 나머지:4
//		
//		System.out.println("입력: ");
//		int number = scan.nextInt(); // 1234
//		
//		int q = number / 1000; //1
//		int r = number % 1000; //234
//		System.out.println(q); //1
//
//		q = r / 100; // 2 
//		r = r % 100; // 34
//		System.out.println(q); //2
//		
//		q = r / 10; // 3
//		r = r % 10; // 4 
//		System.out.println(q); //3
//		System.out.println(r); //4
//		
		
		
		// 5.자릿수 쪼갠 합
		
		System.out.println("입력: ");
		int number = scan.nextInt(); // 1234
		
		int sum = 0;
		
		int q = number / 1000; //1
		int r = number % 1000; //234
		
		sum = q; // sum:1
		
		q = r / 100; // 2
		r = r % 100; // 34
		
		sum = sum + q; // 3=1+ 2
		
		q = r/10; //3
		r = r%10; //4
		
		sum = sum+q+r; // 10 = 3+3+4
		
		System.out.println(sum);
		
		scan.close();
		
	}

}
