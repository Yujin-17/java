package array;

public class Exx01 {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		numbers[3] = 6;
		System.out.println(numbers[3]);
		
		for(int i = 0; i < numbers.length ; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		for(int i = numbers.length - 1 ; i >= 0;  i--) {
			System.out.print(numbers[i]+" ");
		}
		
		
		System.out.println();
		for(int i = 0; i < numbers.length ; i++) {
			if(i % 2 != 0) {
				System.out.print(numbers[i]+" ");
			}
		}
		
		System.out.println();
		for(int i = 0; i < numbers.length ; i++) {
			if(numbers[i] == 2) {
				System.out.println("2가 들어있는 index는 "+ i);
			}
		}
	
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}System.out.println("가장 큰 값은 : "+max);
			
		
		
		int max1 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(max1 < numbers[i]) {
				max1 = numbers[i];
			}
		}System.out.println("가장 큰 값은 : "+max1);
		
		int min1 = numbers[0];
		int minIndex1 = 0;
		for(int i = 1; i<numbers.length;i++) {
			if(min1 > numbers[i]) {
				min1 = numbers[i];
				minIndex1 = i;
			}
		}System.out.println("최소값의 인덱스는  : "+minIndex1
				);
		
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}System.out.println("최소값의 인덱스는  : "+minIndex);
		
		double avg = 0;
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = sum / (double)numbers.length;
		System.out.println("평균은 " + avg);
	}

}
