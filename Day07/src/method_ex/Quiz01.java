package method_ex;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("���鰪�� ���� ���ڸ� �Է��ϼ���: ");
		int x = scan.nextInt();
		System.out.println(x + "�� ������ " + getSquared(x));
		
		System.out.println("������ �Է��ϼ���");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("�����" + getAverage(a, b, c, d));
		
		// Role�� ��Ȯ���϶�. �� ���� �ƴϸ� ��������. å�������� �̷���� �� ����. 
		// ���ȭ 
		
		System.out.println("���ڿ� ���� ���� �Է��ϼ���");
		int i = scan.nextInt();
		int j = scan.nextInt();
		printQuotientRemainder(i, j);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int o = scan.nextInt();
		printOddEven(o);
	}
	
	// �޼ҵ� ����� �� 
	public static int getSquared(int x) { // input, output 
		int squared = x * x;
		return squared;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4) / (double)4; // ������ double�� ������ double���� �� ����� (ĳ���ù���) 
		return result;
	}

	
	public static void printQuotientRemainder(int number1, int number2) {
		int x = number1 / number2;
		int y = number1 % number2;
		System.out.println("��:" + x + "  ������: " + y );
	}
	
	public static void printOddEven(int a) {
		if(a % 2 == 0) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
			
		
	}
}
	

