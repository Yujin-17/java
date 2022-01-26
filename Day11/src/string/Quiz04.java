package string;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//1. jpg ���� ����
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", 
							"eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
		for(int i = 0; i < files.length ; i++) {
			if(files[i].endsWith("jpg")) {
				count++; 
			}
		}
		System.out.println("jpg ���� ����: "  + count);
		
		
		//2. �� �ܾ� ����
		Scanner scan = new Scanner(System.in);
		
		String[] quizWord = {"�¸�", "���", "��ǻ��", "��Ʈ��"};
		String[] answerWord = {"victory", "love", "computer", "notebook"};
		
		int score = 0;
		for(int i = 0; i < quizWord.length; i++) {
			System.out.print(quizWord[i] + "�� ����� �Է��ϼ���: ");
			String answer = scan.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}
		System.out.println("������ " + score + "�� �Դϴ�.");
		
		String memberStr = "������:�۰�ȣ:���켺:�̹���:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
		String[] names = memberStr.split(":");
		int samecount = 0;
		
		for(int i = 0 ; i < names.length; i++) {
			String name = names[i]; // �����̸� 
			boolean isSame = false;
			if(name.equals("")) { // ������������ üũ�Ǽ� ��ĭ�� ��� skip. 
				continue;
			}
			for(int j = i + 1; j < names.length; j++) {
				if(name.equals(names[i])) {
					isSame = true;
					names[j] = "";
					
				}
			}if(isSame) { //���������� �Ѹ��̶� �־��� ��� 
				samecount++;
			}
	
		}
		System.out.println("�������� ���� �� : " + samecount);
		
		
		
		scan.close();
	}

}
