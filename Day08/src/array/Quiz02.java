package array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		
//		int [] numbers = {3, 5, 2, 10, 39};
//		
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("������ index�� ���� �Է��ϼ���: ");
//		
//		int index = scan.nextInt();
//		int num = scan.nextInt();
//		
//		numbers[index] = num;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int sum = 0;
		for(int i = 0; i< scores.length ; i++) {
			if(scores[i] == 'O') {
				sum += 10;
			}
		}System.out.println(sum+ "��");
		
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		
		int sumW1 = 0;
		int sumW2 = 0;
		
		for(int i = 0; i< 5; i++) {
			if(i<5) {
				sumW1 = works[i] * 8500 + sumW1;
			}
		}
		for(int i =5 ; i< works.length; i++) {
			if(i<7) {
				sumW2 = works[i] * 9500 + sumW2;
			}
		}
		System.out.print("�����ϰ� �� �ӱ��� ");
		System.out.println(sumW1+sumW2);
		
		int[] works1 = { 3, 5, 5, 3, 5, 3, 5};
		int wage = 0;
		for ( int i = 0; i < works.length ; i++) {
			// ����
			if ( i <= 4) {
				wage += works[i] * 8500;
			}else {
				//�ָ�
				wage += works[i] * 9500;
			}
		}
		System.out.println("�����ϰ� �� �ӱ��� " + wage + "��");
		
		
		Scanner scan = new Scanner(System.in);
		//¦���� ����
//		int[] evens = new int[5];
//		for(int i = 0; i < evens.length; ) {
//			System.out.println("���� �Է��ϼ��� : ");
//			int number = scan.nextInt();
//			if(number % 2 == 0) {
//				evens[i] = number;
//				i++;
//			}
//		}
//		for(int i = 0; i < evens.length; i++) {
//			System.out.println(evens[i] + " ");
//		}
		
		// ¦���� ����
		int[] evens = new int[5];
		int index = 0;
		while ( index < 5) {
			System.out.println("���� �Է��ϼ���: ");
			int number = scan.nextInt();
			if(number % 2 == 0) {
				evens[index] = number;
				index++;
			}
		}
		for(int i = 0; i < evens.length; i++) {
			System.out.println(evens[i] + " ");
		}
		
		scan.close();
		
//		scan.close();

	}

}
