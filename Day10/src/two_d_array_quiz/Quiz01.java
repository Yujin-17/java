package two_d_array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		// 3. ��� �ְ��� ���ϱ� 
		
		int maxAverageIndex = 0;
		double maxAverage = 0;
		for(int i = 0; i < scores.length; i++) { // �л� �� 
			int sum = 0;
		
			for(int j = 0; j < scores[i].length; j++) { // ����
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			if(maxAverage < average) {
				maxAverage = average;
				maxAverageIndex = i;
			}
		}
		
		System.out.println("����� ���� ���� �л��� " + (maxAverageIndex + 1)
				+ " ��° �л��̰�, ������ " + maxAverage);
		
		
		// 4. Ư�� ���� �ְ��� 
		int maxScore = 0;
		int maxIndex = 0;
		for(int i = 0; i < scores.length; i++) { // �л� �� 
			if(maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i;
			}
				
			}
		System.out.println("4��° ������ �ְ� �����ڴ� " + (maxIndex+1) + " ��° �л��̰�, "
				+ "������ " + maxScore);
		
		
		//  5. �Ϻ� ��� �ְ���
		double maxAvg = 0;
		int maxInd =0;
		for(int i = 0 ; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			for(int j = 3; j <= 7; j++) {
				sum += scores[i][j];
				average = sum / 5.0;
				if(maxAvg < average) {
					maxAvg = average;
					maxInd = i;
				}
			}
			
		}System.out.println("3~7���� ����� ���� ���� �л��� "+ (maxInd+1) + "��° �л��̰�, ����� "
				+ maxAvg );
	}

}
