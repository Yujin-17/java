package Condition_01;

import java.util.Scanner;
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int i = scan.nextInt();
//		
//		if (i < 10) {
//			System.out.println("10���� �۴�");
//		}else if(i == 10){
//			System.out.println("����");
//		}
//			System.out.println("10���� ũ��");
//		
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if(a > b) {
//			System.out.println("a�� �� Ů�ϴ�");
//		}else if(a < b) {
//			System.out.println("b�� �� Ů�ϴ�");
//		}System.out.println("�����ϴ�");
		
		
//		System.out.println("������ �Է��ϼ���");
//		int score = scan.nextInt();
//		
//		if (score >= 70) {
//			System.out.println("�հ��Դϴ�.");
		
		int number = scan.nextInt();
		
		boolean isEven = number % 2 == 0;
		
		if (isEven) {
			System.out.println("¦��");
		}else System.out.println("Ȧ��");
	}
	
	

}
