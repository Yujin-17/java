package Condition_01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����Ը� �Է��ϼ���");
		int weight = scan.nextInt();
		
		// ���࿡ �����԰� 60Ű�� �̸��̸� "ġŲ"
		
		if (weight < 60) {
			System.out.println("ġŲ����");
		}
		
		// ���࿡ �����԰� 100Ű�� �̻��̸� "���̾�Ʈ ����"
		if (weight >= 100) {
			System.out.println("���̾�Ʈ ����");
		}
		
		// ���࿡ �����԰� 68Ű���̸� "�����Դ� 68Ű�� �Դϴ�"
		if (weight == 68) {
			System.out.println("�����Դ� 68Ű�� �Դϴ�");
		}
		
		// ���࿡ �����԰� 75Ű�ΰ� �ƴϸ� "75Ű�ΰ� �ƴմϴ�"
		if (weight != 75) {
			System.out.println("75Ű�ΰ� �ƴմϴ�");
	}
		
		
	}
	
	

}
