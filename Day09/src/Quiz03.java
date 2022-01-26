import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		int[] numbers = {3, 5, 2, 10, 39};  // 0 1 2 3 4
		
		System.out.println("두 개의 index를 입력하세요: ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		
		int temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Random rand = new Random();
		
		for(int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10);
			int temp1 = a[0];
			a[0] = a[randIndex];
			a[randIndex] = temp1;
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		
		System.out.println();
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		int sum1 =0;
//		int sum2 =0;
//		int sum3 =0;
//		int sum4 =0;
//		int sum5 =0;
//		for(int i = 0 ; i < numbers3.length ;  i++) {
//			if(numbers3[i] == 1) {
//				sum1 = sum1 + 1;
//			}
//			if(numbers3[i] == 2) {
//				sum2 = sum2 + 1;
//			}
//			if(numbers3[i] == 3) {
//				sum3 = sum3 + 1;
//			}
//			if(numbers3[i] == 4) {
//				sum4 = sum4 + 1;
//			}
//			if(numbers3[i] == 5) {
//				sum5 = sum5 + 1;
//			}
//		}System.out.println("1 :" + sum1);
//		System.out.println("2 :" + sum2);
//		System.out.println("3 :" + sum3);
//		System.out.println("4 :" + sum4);
//		System.out.println("5 :" + sum5);
		
		
		// 빈도수 
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] freq = new int[6]; // 0번째 인덱스는 버린다. 1 2 3 4 5 => 각각의 칸에 빈도수 저장
		
		for(int i = 0;  i<  numbers3.length; i++) {
			freq[numbers3[i]] += 1;
		}
		for(int i = 1;  i<  freq.length; i++) {
			System.out.println(i + ": " + freq[i]);
		}
		
		scan.close();
	}

}
