package Condition_01;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = scan.nextInt();
		
		// number�� 10�̻��̰�(�׸��� AND) 40�����̴�. 10 <= number <= 40
		if (number >= 10 && number <= 40) {
			System.out.println("10�̻��̰� 40 ����");
		}	
		
		// number�� 10���� �۰ų�(�Ǵ� OR) 40���� ũ��. number < 10 �Ǵ� number > 40
		if (number < 10 || number > 40) {
			System.out.println("10���� �۰ų� 40���� ũ��");
		}
	}
	
	

}
