package Condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		
		int number = scan.nextInt();
		
		// if-else if -else
//		if (number == 1) {
//			System.out.println("1�̴�.");
//		} else if (number == 2) {
//			System.out.println("2�̴�");
//		} else {
//			System.out.println("1�̳� 2�� �ƴϴ�.");
//		}
//		
		// switch��: ������ '����' ������ �� if���� ��ü�ؼ� ��� ���� 
		// case�� �ش����� �� ������ ���������� ������ break�� ��� 
		
		switch (number) {
		case 1: 
			System.out.println("1");
			break;
		case 2: 
			System.out.println("2");
			break;
		default: 
			System.out.println("1�̳� 2�� �ƴϴ�.");
		}
		
		
		scan.close();
	}

}
