package string_ex;

public class Ex02 {

	public static void main(String[] args) {

		// �ڷ��� ��ȯ
		// 3     "3"
		
		// 1. ���� -> ���ڿ� 
		int number = 3; 
		String str1 = number + "";	// ���� + ���ڿ� = ���ڿ� 
		System.out.println(str1);
		

		// ���� ���
		String str2 = String.valueOf(number);
		System.out.println(str2);
		
		// 2. ���ڿ� -> ���� 
		String str3 = "5";
		int number2 = Integer.valueOf(str3);
		System.out.println(number2);
		
		int number3 = Integer.parseInt(str3);
		System.out.println(number3);
		
	}

}
//StringBuilder, StringBuffer 