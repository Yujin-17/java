package Condition_ex;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("�� ������ �Է��ϼ���");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		
//		double ave = (score1 + score2) / (double)2;
//		
//		if (ave >= 70) {
//			System.out.println("�հ�");
//		}else System.out.println("���հ�");
//				
//	
		
//		System.out.println("�� ���� ���� �Է��ϼ���");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		
//		int max = a;
//		if (max < b) {
//			max = b;
//		} 
//		if (max < c) {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		
//		if (a > b) {
//			if (a > c) {
//				System.out.println(a);
//			}
//		}else if (b > a){
//			if (b > c) {
//				System.out.println(b);
//			}
//		}else System.out.println(c);
//		
		
//		System.out.println("����1 :");
//		int a = scan.nextInt();
//		System.out.println("����2 :");
//		int b = scan.nextInt();
//		
//		double ave = (double)(a+b) / 2;
//		
//		if(ave >= 60 && a >= 50 && b >= 50) {
//					System.out.println("�հ�");
//		}else if (ave >= 60 && (a <= 50 || b <= 50)) {
//			System.out.println("����");
//		}else System.out.println("���հ�");{
//		}
		
//		int year = scan.nextInt();
//		
//		if(year%4 == 0 && year%400 == 0) {
//			System.out.println("����");
//		}else if (year%4 == 0) {
//			System.out.println("����");
//		}else if (year%4 == 0 && year%100 != 0){
//			System.out.println("���");
//		} else System.out.println("���");
//		
//	
//		if (year % 400 == 0) {
//			System.out.println("����");
//		} else if(year % 100 == 0) {
//			System.out.println("���");
//		} else if (year % 4 == 0) {
//			System.out.println("����");
//		} else {
//			System.out.println("���");
//		}
//		

		// 4�� ������ �������鼭 100���� ������ �������� �ʴ� ������ �����̴�. 
		// �Ǵ� 
		// 400���� ������ �������� ���� 
		// ���� 
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			System.out.println("����");
//		} else {
//			System.out.println("���");
//		}
//		

		
		System.out.println("�� ���¸� �Է��ϼ���: ");
		int st1 = scan.nextInt();
		int st2 = scan.nextInt();
		int st3 = scan.nextInt();
		int st4 = scan.nextInt();
		
		int sum = st1 + st2 + st3 + st4;
		
		if (sum == 1 ) {
			System.out.println("��");
		}else if( sum == 2) {
			System.out.println("��");
		}else if( sum == 3) {
			System.out.println("��");
		}else if( sum == 4) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
	
	
		scan.close();
	}
}



