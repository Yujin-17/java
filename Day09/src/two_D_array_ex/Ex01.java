package two_D_array_ex;

public class Ex01 {

	public static void main(String[] args) {

		
		//2���� �迭
		//�ٱ��� ��, ���� : ��
		
		int[][] scores ={{89, 92, 100}, 
						{91, 82, 67}, 
						{56, 35, 99},
						{75, 43, 24},
						{76, 44, 26}};
		System.out.println("3��° �л��� �ι�° ���� " + scores[2][1]); // 35
		System.out.println("�ι�° �л��� ù��° ���� " + scores[1][0]); // 91
		System.out.println("5��° �л��� ������ ���� " + scores[4][2]); // 26
		
		// �ݺ������� 2���� �迭 �� ���
		for(int i = 0; i < scores.length;i++) {
				for(int j = 0; j < scores[i].length; j++) {
					// n��° �л��� n��° ������ n��
					System.out.println((i + 1) + "��° �л��� " + (j + 1)+ "��° ������ "
												+ scores[i][j]);
				}
			}
		
		// �� �л����� ��� ���ϱ�
		for(int i = 0; i < scores.length; i++) { // �л� �� 
			int sum = 0;
			
			for(int j = 0; j < scores[i].length; j++) {// �л� �� ������
				sum += scores[i][j];
			}
			
			//���
			double average = sum / (double)scores[i].length;
			System.out.println((i+1)+"��° �л��� ����� " + average);
			
		}
		

		
		
		}
	
	}

