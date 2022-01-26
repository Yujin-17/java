package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장하기 
		
		String a = "안녕하세요"; // new가 없을 시 constant pool에 저장. 
		String b = new String("안녕하세요"); // 객체 
		String c = new String("안녕하세요");
		String d = "안녕하세요"; // constant pool 활용.  
		
		System.out.println(a);
		System.out.println(b);
		
		// String끼리 값 비교
		System.out.println(a == d); // true constant pool 같은 주소 
		System.out.println(b == c); // false 값 비교가 아닌 주소 비교를 한 것
		System.out.println(a == b); // false 값 비교가 아닌 주소 비교를 한 것 
		
		System.out.println(a.equals(b)); // 값 비교 . true 
										// String은 무조건 equals로 비교
	}

}

/* 기본자료형(primitive type): int, char, long, double, float, boolean */
// 참조자료형(reference type): String, int[], int[][], 배열 