package string;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.next(); //�ܾ�
		System.out.println(word);
		
		scan.nextLine(); // ���ʿ��� ���͸� ����������. 
		
		String text = scan.nextLine(); // ����(�����̽��� ����)
		System.out.println(text);
		
		
		scan.close();
	}

}
