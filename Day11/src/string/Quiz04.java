package string;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//1. jpg 파일 개수
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", 
							"eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
		for(int i = 0; i < files.length ; i++) {
			if(files[i].endsWith("jpg")) {
				count++; 
			}
		}
		System.out.println("jpg 파일 개수: "  + count);
		
		
		//2. 영 단어 퀴즈
		Scanner scan = new Scanner(System.in);
		
		String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
		String[] answerWord = {"victory", "love", "computer", "notebook"};
		
		int score = 0;
		for(int i = 0; i < quizWord.length; i++) {
			System.out.print(quizWord[i] + "를 영어로 입력하세요: ");
			String answer = scan.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}
		System.out.println("점수는 " + score + "점 입니다.");
		
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = memberStr.split(":");
		int samecount = 0;
		
		for(int i = 0 ; i < names.length; i++) {
			String name = names[i]; // 기준이름 
			boolean isSame = false;
			if(name.equals("")) { // 동명이인으로 체크되서 빈칸인 경우 skip. 
				continue;
			}
			for(int j = i + 1; j < names.length; j++) {
				if(name.equals(names[i])) {
					isSame = true;
					names[j] = "";
					
				}
			}if(isSame) { //동명이인이 한명이라도 있었던 경우 
				samecount++;
			}
	
		}
		System.out.println("동명이인 종류 수 : " + samecount);
		
		
		
		scan.close();
	}

}
