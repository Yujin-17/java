package method_ex;

public class Ex02 {

	public static void main(String[] args) {

		// �޼ҵ� �����
		// 1. �޼ҵ�� ���´�.(����)
		// 2. input�� �������� ������
		// 3���� ����
		// 4. ����. output�� ����
		
		// �޼ҵ带 ����ϴ� ��
		int x = 35;
		int y = 46;
		int result = sum(x, y); // ���� ����(argument) x, y
		System.out.println(result);
		System.out.println(sum(x, y));
		
		printHelloWorld();
	}
	
	// �޼ҵ带 ����� ��
	// static : ���� 
	// �޸𸮿� ������ ������ �� ���� ������ static���� �����Ѵ�. 
	// static, class / stack / heap
	//ex02,main(),sum()/ int a / 
	// main�� sum�� �����ϱ� ������ ���� ������ �ö�� �־�� �ؼ� static�� �ٿ��ִ� ��(���� �������� �޼ҵ� ���� �� static�� �پ����)
	// main�� static�� �ٴ� ���� : ó���� main���� �����ϴµ�, �ϴ� �޸𸮿� �ö�� �־�ߵȴ�. �׷��� ���ο� static�� �ٴ´�. (static�� �ö�� �ִ� �޼ҵ� ������ �����ؾ��ϱ� ������ ���̴°�)
	public static int sum(int a, int b) {  // input -> ? -> output  // �Ű����� (parameter)
		System.out.println("sum �޼ҵ�");
		int result = a + b;
		return result;    // ���ϰ��� int�� ���� ������� 
		
		// or >> return a+b; ������ ���� ���� ��� �̷��� �ص� ��. 
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello World");   // ���ϰ��� void�� return �Ƚᵵ��
		return; // ������ �̷��� �ᵵ �� >> ���� ������ �Ǹ� �޼ҵ� ����  
	}
}
