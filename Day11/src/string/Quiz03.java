package string;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("ID를 입력 하세요 : " );
		String id = scan.next();
		System.out.println("Welcome! " +id);
		
		System.out.println("단어를 입력하세요: ");
		String word = scan.next();  // elephant
		
		int count = 0; 
		for(int i = 0; i < word.length() ; i++) {
			if(word.charAt(i) == 'e') { // e 일 때 1 증가
				count++;
			}
		}System.out.println("e의 개수는 " + count);
		
		
//		String[] a = word.split("e");
//		
//		int b = a.length - 1;
//		
//		
//		System.out.println("e의 개수는 "+ b);
		
		
		scan.close();
	}

}
