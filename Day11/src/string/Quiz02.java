package string;

public class Quiz02 {

	public static void main(String[] args) {

		String gradeStr = "My grade is A";
		System.out.println(gradeStr.replace("A", "B"));
		
		
		String birth = "19950721";
		String a = birth.substring(0, 4);
		int year = Integer.valueOf(a);
		System.out.println(2021 - year + 1 + "세");
		
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] s = sentence.split(" ");
		System.out.println("단어개수:"+s.length );
		
		
		
	}

}
