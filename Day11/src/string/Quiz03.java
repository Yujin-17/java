package string;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("ID�� �Է� �ϼ��� : " );
		String id = scan.next();
		System.out.println("Welcome! " +id);
		
		System.out.println("�ܾ �Է��ϼ���: ");
		String word = scan.next();  // elephant
		
		int count = 0; 
		for(int i = 0; i < word.length() ; i++) {
			if(word.charAt(i) == 'e') { // e �� �� 1 ����
				count++;
			}
		}System.out.println("e�� ������ " + count);
		
		
//		String[] a = word.split("e");
//		
//		int b = a.length - 1;
//		
//		
//		System.out.println("e�� ������ "+ b);
		
		
		scan.close();
	}

}
