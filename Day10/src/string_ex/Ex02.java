package string_ex;

public class Ex02 {

	public static void main(String[] args) {

		// 자료형 변환
		// 3     "3"
		
		// 1. 숫자 -> 문자열 
		int number = 3; 
		String str1 = number + "";	// 숫자 + 문자열 = 문자열 
		System.out.println(str1);
		

		// 정석 방법
		String str2 = String.valueOf(number);
		System.out.println(str2);
		
		// 2. 문자열 -> 숫자 
		String str3 = "5";
		int number2 = Integer.valueOf(str3);
		System.out.println(number2);
		
		int number3 = Integer.parseInt(str3);
		System.out.println(number3);
		
	}

}
//StringBuilder, StringBuffer 