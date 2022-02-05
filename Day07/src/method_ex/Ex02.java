package method_ex;

public class Ex02 {

	public static void main(String[] args) {

		// 메소드 만들기
		// 1. 메소드명 짓는다.(동사)
		// 2. input을 무엇으로 받을지
		// 3으로 할지
		// 4. 구현. output을 무엇
		
		// 메소드를 사용하는 곳
		int x = 35;
		int y = 46;
		int result = sum(x, y); // 전달 인자(argument) x, y
		System.out.println(result);
		System.out.println(sum(x, y));
		
		printHelloWorld();
	}
	
	// 메소드를 만드는 곳
	// static : 정적 
	// 메모리에 없으면 참조할 수 없기 때문에 static으로 정의한다. 
	// static, class / stack / heap
	//ex02,main(),sum()/ int a / 
	// main이 sum을 참조하기 때문에 같은 공간에 올라와 있어야 해서 static을 붙여주는 것(같은 공간에서 메소드 만들 때 static이 붙어야함)
	// main에 static이 붙는 이유 : 처음에 main부터 시작하는데, 일단 메모리에 올라와 있어야된다. 그래서 메인에 static이 붙는다. (static에 올라와 있는 메소드 조차도 인지해야하기 때문에 붙이는것)
	public static int sum(int a, int b) {  // input -> ? -> output  // 매개변수 (parameter)
		System.out.println("sum 메소드");
		int result = a + b;
		return result;    // 리턴값이 int라 리턴 써줘야함 
		
		// or >> return a+b; 간단한 연산 같은 경우 이렇게 해도 됨. 
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello World");   // 리턴값이 void라 return 안써도됨
		return; // 하지만 이렇게 써도 됨 >> 리턴 만나게 되면 메소드 종료  
	}
}
