package Condition_01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("�� ������ �Է��ϼ���");
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if (a >= 70 && b >= 70) {
//			System.out.println("�հ�");
//		}
		
		
//		System.out.println("���� �Է��ϼ���");
//		
//		int a = scan.nextInt();
//		
//		if (a % 2 == 0 && a % 3 == 0 ) {
//			System.out.println("2�� 3�� ������Դϴ�.");
//		}
		System.out.println("1~10 ������ ���� �Է��ϼ���: ");
		
		int a  = scan.nextInt();
		
		if(a < 1 || a > 10) {
			System.out.println("�߸� �Է�");
		}
		// validation check => ��ȿ�� �˻� 
		scan.close();
		
		// �ڵ� ���� ����Ʈ ��õ 
		// ���α׷��ӽ� - �� ����� 
		// ���� 
		// LeetCode(���� �ϱ� ���� ���� ����/ �ؿܻ���Ʈ)
		// ���� ���̸��� Ǯ��� �ͼ�������.
		// ���½ð� �ڹٰ���. 
		// �����Ѱ� ���ڵ����ε� �ؾ���.
		// �ڷᱸ�� �ʼ�!
		// �˰���(����, Tree)
		// ��Ʈ��ũ
		// �ü�� h
		
	}

}
