package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String ������ �� �����ϱ� 
		
		String a = "�ȳ��ϼ���"; // new�� ���� �� constant pool�� ����. 
		String b = new String("�ȳ��ϼ���"); // ��ü 
		String c = new String("�ȳ��ϼ���");
		String d = "�ȳ��ϼ���"; // constant pool Ȱ��.  
		
		System.out.println(a);
		System.out.println(b);
		
		// String���� �� ��
		System.out.println(a == d); // true constant pool ���� �ּ� 
		System.out.println(b == c); // false �� �񱳰� �ƴ� �ּ� �񱳸� �� ��
		System.out.println(a == b); // false �� �񱳰� �ƴ� �ּ� �񱳸� �� �� 
		
		System.out.println(a.equals(b)); // �� �� . true 
										// String�� ������ equals�� ��
	}

}

/* �⺻�ڷ���(primitive type): int, char, long, double, float, boolean */
// �����ڷ���(reference type): String, int[], int[][], �迭 