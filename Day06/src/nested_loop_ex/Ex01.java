package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * 중첩 반복문: 반복문 안에 반복문 
		 * 		바깥 반복문: 천천히 돈다. 세트  (행)
		 * 		안쪽 반복문: 빨리 돈다. 횟수 (열)
		 */
		
		// 스쿼트 10회
		
		for(int i = 1; i < 11; i++) {
			System.out.println("스쿼트 "+ i);
		}
		
		// 스쿼트 3세트 10회씩 
		for (int i = 1; i<4; i++) { // 세트 1 2 3
			for(int j = 1; j < 11; j++) {
				System.out.println("스쿼트 " + j + "세트" + i);
			}
		}
		// 한줄짜리 별 5개 찍기
		// *****
//		for (int i = 0; i < 5 ; i++) {
//			System.out.print("*");
//		}

		// 한줄짜리 별 5개를 3행 찍기
		for ( int i = 0; i <3; i++) {   // 행의 갯수
			for(int j = 0 ; j < 5 ; j++) { // 열의 갯수
				System.out.print("*");
			}
			System.out.println(); // 한 행이 끝나는 시점에 줄바꿈 
		}
}
}
