package string_ex;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";

		// charAt : n��° index�� ���� ���ڰ� �ִ��� Ȯ��
		System.out.println("charAt: " + s1.charAt(5));

		// contains: Ư�� ���ڿ��� ���ڿ��� ������ �Ǿ��ִ��� Ȯ��
		System.out.println("contains: " + s1.contains("lip"));

		// startsWith: Ư�� ���ڿ��� �����ϴ��� Ȯ��
		System.out.println("startsWith: " + s1.startsWith("ec"));
		
		// endsWith: Ư�� ���ڿ��� �������� Ȯ��
		System.out.println("endsWith: "+ s1.endsWith("e"));
		
		// length: ���ڿ��� ���̸� Ȯ��. ���ĺ��� �� �� ����
		System.out.println("length: " + s1.length());
		
		// replace: ���Ե� ���ڿ� �κ��� ��ü 
		String s2 = "���� ���� �԰���� ���� ġŲ�̴�.";
		s2 = s2.replace("ġŲ", "������"); // ���ϵ� ���� �����ؾ� �Ѵ�. 
		System.out.println("replace: " + s2);
		
		// split: Ư�� ��Ʈ��(������)�� �������� �߶� �迭�� �ִ´�.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		System.out.println("split: "+ fruits[0] + " " + fruits[1] + " " + fruits[2]);
		
		// substring: ���ڿ��� �ڸ���.
		String s4 = "javastudy";
		System.out.println("substring: "+ s4.substring(4)); // study
		
		// begin index : �����ε���
		// end index : �ڸ��� ���� ��ġ �ε��� + 1
		System.out.println("substring param 2: "+ s4.substring(0, 4)); // java
		System.out.println("substring param 2: " + s4.substring(4, 9)); // study
	}

}
