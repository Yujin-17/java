package Method_Quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("���� �Է��ϼ���: ");
//		int number = scan.nextInt();
//		
//		System.out.println(getSumUntil100(number));
		
//		System.out.print("5���� ���� �Է��ϼ��� : ");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int number3 = scan.nextInt();
//		int number4 = scan.nextInt();
//		int number5 = scan.nextInt();
//	
//		//int min = Integer.MAX_VALUE;
//		printMin(number1, number2, number3, number4, number5);
		
		// �����丵 //�����丵 ��ƾ �Ŀ﷯ å ��õ 
	
		System.out.print("���� �Է��ϼ���: ");
		int number = scan.nextInt();
		
		System.out.println(isPrimeNumber(number));
		
		scan.close();
	}
	
	public static boolean isPrimeNumber(int number) {
		//2���� ū ���� 2���� number-1 ���� ��������. => �ϳ��� ������������ �Ҽ� �ƴ� 
		for(int i = 2; i < number; i++) {
			if(number%i == 0) {
				return false;
			}
		} 
		// ������� �����ϸ� ������ �������� ���� ���ų�, 2�� ��� (�ݺ����� ���޾���) �Ҽ� 
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
		System.out.println("�ּҰ��� : " + min);
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
