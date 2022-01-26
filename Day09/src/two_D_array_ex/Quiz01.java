package two_D_array_ex;

public class Quiz01 {

	public static void main(String[] args) {

		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		//1. 학생별 평균 구하기
		
		for(int i = 0; i<scores.length;i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				
			}
			double average = sum / (double)scores[i].length;
			System.out.println((i+1) + "번째 학생의 최고점은 "+ average);
		}
		
		//2. 학생별 최고점 구하기 
		
		for(int i = 0 ; i < scores.length; i++) {
			int max = 0;
			for(int j = 0; j < scores[i].length;j++) {
				if(max < scores[i][j]) {
					max = scores[i][j];
				}
				
			}
			System.out.println((i+1) + "번째 학생으의 최고점은 " + max);
			
		}
		
	
	}
}
