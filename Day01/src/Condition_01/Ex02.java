package Condition_01;

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ���� ���� �Է��ϼ���:");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		// ���࿡ number1�� number2���� ũ��.
		if (number1 > number2) { 
			System.out.println(number1+ "�� "+ number2 + "���� ũ��");
		}
		// ���࿡ number1�� number2���� �۴�.
		if (number1 < number2) {
			System.out.println(number1+ "�� "+ number2 + "���� �۴�");
		}
		// ���࿡ number1�� number2�� ����.
		if (number1 == number2) {
			System.out.println(number1+ "�� "+ number2 + "�� ����");
		}
				
				
	}

}
