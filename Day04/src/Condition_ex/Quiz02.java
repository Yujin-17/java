package Condition_ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		
		switch(month) {
		case 3,4,5:
			System.out.println("��");
			break;
		case 6,7,8:
			System.out.println("����");
			break;
		case 9,10,11:
			System.out.println("����");
			break;
		case 12,1,2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		scan.close();
	}

}
