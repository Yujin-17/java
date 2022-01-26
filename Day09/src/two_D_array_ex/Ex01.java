package two_D_array_ex;

public class Ex01 {

	public static void main(String[] args) {

		
		//2차원 배열
		//바깥쪽 행, 안쪽 : 열
		
		int[][] scores ={{89, 92, 100}, 
						{91, 82, 67}, 
						{56, 35, 99},
						{75, 43, 24},
						{76, 44, 26}};
		System.out.println("3번째 학생의 두번째 점수 " + scores[2][1]); // 35
		System.out.println("두번째 학생의 첫번째 점수 " + scores[1][0]); // 91
		System.out.println("5번째 학생의 세번재 점수 " + scores[4][2]); // 26
		
		// 반복문으로 2차원 배열 값 출력
		for(int i = 0; i < scores.length;i++) {
				for(int j = 0; j < scores[i].length; j++) {
					// n번째 학생의 n번째 점수는 n점
					System.out.println((i + 1) + "번째 학생의 " + (j + 1)+ "번째 점수는 "
												+ scores[i][j]);
				}
			}
		
		// 각 학생들의 평균 구하기
		for(int i = 0; i < scores.length; i++) { // 학생 수 
			int sum = 0;
			
			for(int j = 0; j < scores[i].length; j++) {// 학생 당 점수들
				sum += scores[i][j];
			}
			
			//평균
			double average = sum / (double)scores[i].length;
			System.out.println((i+1)+"번째 학생의 평균은 " + average);
			
		}
		

		
		
		}
	
	}

