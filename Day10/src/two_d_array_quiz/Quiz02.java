package two_d_array_quiz;

public class Quiz02 {

	public static void main(String[] args) {

		
		// 1. 10 입력하기
		
		int[][] arr1 = new int[2][3];
		//입력
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] == 0) {
					arr1[i][j] = 10;
				}
			}
		}
		// 출력
		printArray(arr1);

		// 2. 순서대로 입력하기 
		int[][] arr2 = new int[3][4];
	
		for(int i = 0; i< arr2.length; i++) { // 행
			for(int j = 0; j < arr2[i].length; j++) { // 열
				if(arr2[i][j]== 0) {
					arr2[i][j] = j+1;
				}
			}
		}
		printArray(arr2);
	
	
		// 3. 배열 별로 입력하기 
		int[][] arr3 = new int[3][3];
		
		for(int i = 0; i< arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				if(arr3[i][j] == 0) {
					arr3[i][j] = i+ 1;
				}
			}
			
	
		}printArray(arr3);
		
		// 4. 십자(+) 그리기
		int[][] arr4 = new int[5][5];
		
		for(int i = 0; i< arr4.length; i++) {
		
			for(int j = 0; j < arr4[i].length; j++) {
				if(i == 2 || j == 2) {
					arr4[i][j] = 1;
				}
			}
		}
		printArray(arr4);
		
		// 5. 전체 수 입력 
		
//		int[][] arr5 = new int[3][3];
//		for(int i = 0; i< arr5.length; i++) {
//			for(int j = 0; j < arr5[i].length; j++) {
//				if(arr5[i][j] == 0) {
//					arr5[0][j] = j+1;
//					arr5[1][j] = j+4;
//					arr5[2][j] = j+7;
//				}
//			}
//		}
//		printArray(arr5);
		
//		int[][] arr5= new int[3][3];
//		int value = 1;
//		for (int i = 0; i < arr5.length; i++) {
//			for(int j = 0; j < arr5[i].length;j++) {
//				arr5[i][j] = value++;
//			}
//		}
//		printArray(arr5);
		
		int[][] arr5= new int[3][3];
		for (int i = 0; i < arr5.length; i++) {
			for(int j = 0; j < arr5[i].length;j++) {
				arr5[i][j] = (i * 3) + (j + 1);
			}
		}
		printArray(arr5);
		
		// 6. 전체 수 입력
		
//		int[][] arr6 = new int[3][3];
//		for(int i = 0; i< arr6.length; i++) {
//			for(int j = 0; j < arr6[i].length; j++) {
//				if(arr6[i][j] == 0) {
//					arr6[0][j] = (j+1) + j + j;
//					arr6[1][j] = (j+2) + j + j;
//					arr6[2][j] = (j+3) + j + j;
//				}
//				
//			}
//		}
//		printArray(arr6);
		
		
		// 열 : 행이 바뀔때마다 1, 2, 3 .. +1
		// 모든 열 : +3
		int[][] arr6 = new int[3][3];
		int val = 0;
		for(int i = 0; i< arr6.length; i++) { //헹
			// 행이 바뀔 때마다 1로 시작, 2로 시작, 3 시작
			val = i + 1;
			for(int j = 0; j < arr6[i].length; j++) { //열 
				// 매번 +3
				arr6[i][j] = val;
				val += 3;
				
			}
		}
		printArray(arr6);
		
		
				
				
		}
	// 출력 메소드 input output
	public static void printArray(int[][] array) {
	
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}System.out.println();
	}
		System.out.println("---------------------");
		
	}
}