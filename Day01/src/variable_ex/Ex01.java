package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		

		// 변수에 값을 넣는다.
		// 변수에 값을 할당한다. (assignment)
		// 변수에 값을 초기화한다. (intialize)
		
		// 정수형 변수(Integer)
		int number = 10;
		System.out.println(number);
		
		number = 5; // 변수이므로 값을 변경할 수 있다. 재사용시 자료형 선언 안해도됨. 
		System.out.println(number);
		
		int number2 = 100;
		System.out.println(number + number2);
		int sum = number + number2;
		System.out.println(sum);

		// 실수 변수 (Float) - 권장 안함
		float f = 1.5f;
		System.out.println(f);
		
		// 실수 변수 (Double)
		double d = 1.5;
		System.out.println(d);
		
		// 문자 변수 (Character) : 문자 한개.   작은 따옴표로 감싼다. 
		char c = 'z';
		System.out.println(c);
		
		// boolean 변수: 참(true) 또는 거짓(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println("거짓 " + isFalse);
		// camel case = 변수 이름 설정시 단어가 여러개일때 두번째 이상 단어 첫글짜는 대문자
	
		// 문자열 변수
		String s = "안녕하세용";
		System.out.println(s);
	}

}

