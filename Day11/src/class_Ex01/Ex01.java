package class_Ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 나의 의식  흐름
		ScoreData sd1 = new ScoreData(); //  sd1 => 객체(Object), 
										 //			ScoreData의 instance
		// 필드에 값 넣기 
		sd1.score = 85;
		sd1.subject = "국어";
		sd1.ranking = 7;
		
		// 필드 값 출력하기 
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.ranking);
		
		sd1.printScoreInfo();
		
		ScoreData sd2 = new ScoreData();
		
		
		
		
	}

}
