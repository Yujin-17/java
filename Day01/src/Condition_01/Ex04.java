package Condition_01;

import java.util.Scanner;
public class Ex04 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �����Ը� �Է��ϼ���: ");
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		// ���࿡ ���� ���� 10000���� �ʰ��ϸ鼭 �����԰� 70Ű�� �����̸� ġŲ 
		if (walk > 10000 && weight <= 70) {
			System.out.println("�Ѵ� ���� ġŲ");
		}
		// ���࿡ ���� ���� 10000���� �ʰ��ϰų� �����԰� 70Ű�� �����̸� ġŲ 
		if (walk > 10000 || weight <= 70) {
			System.out.println("���� �ϳ� ���� ġŲ����");
		}
	}

}
