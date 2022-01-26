package Loop_01;

public class Ex01 {

	public static void main(String[] args) {

		//while문으로 안녕 3번쓰기 
		
		int i = 0; // 카운팅 변수 
		while ( i < 3 ) {   // 
			System.out.println("안녕" + i);
			// i = i + 1;
//			i += 1;  // 복합 대입 연산자
			// i++; // 증감 연산자 (후위)
			 ++i; // 증감 연산자 (전위) 
		}
		
		
		// ++i, i++ 차이점 
		int number = 15;
		System.out.println("number:" + number ); // 15
		System.out.println("++number" + (++number)); // 16
		System.out.println("number++" + (number++)); // 16
		System.out.println("number:" + number); //17
		
	}

}
