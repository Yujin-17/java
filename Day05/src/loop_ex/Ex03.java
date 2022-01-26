package loop_ex;

public class Ex03 {

	public static void main(String[] args) {

		// break문 : break가 써진 곳의 가장 가까운 반복문에서 빠져나온다. 
		
		// 무한루프에서 다섯번 찍기 0 ~ 4 => 5
		int i = 0;
		while (true) { // 0 1 2 3 4      5
			if (i ==5 ) {  // 0 1 2 3 4
				break;
			}
			System.out.println("무한루프 " + i );
			i++;
		}
		
		// for문 무한루프 
		for (int j = 0 ; ; j++) { // 조건에 true를 넣거나 조건이 없으면 무한루프 
			if( j == 5 ) {
			break;
		}
		System.out.println(j);
	}
		
		
		// continue: skip. 아래 코드들을 수행하지 않고 즉시 조건을 보러 간다. 
		
		// 1 ~ 10 4의 배수일 때는 출력하지 않기.
		// 1 2 3 5 6 7 9 10
		
		for(int j = 1; j < 11; j++) {
			if (j % 4 != 0) { // 4의 배수가 아닐 때 
				System.out.print(j + " ");
			}
		}System.out.println();
	
		//2. continue
		for(int j = 1; j < 11 ; j++) {
			// 4의 배수 일 때 
			if(j % 4 == 0) {
				// 출력을 건너뛴다. >> continue문을 만나자마자 다시 증감식으로 올라감. 
				continue;
			}
			System.out.print(j + " ");
		}
		
	}
}