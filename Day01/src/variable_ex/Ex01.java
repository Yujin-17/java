package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		

		// ������ ���� �ִ´�.
		// ������ ���� �Ҵ��Ѵ�. (assignment)
		// ������ ���� �ʱ�ȭ�Ѵ�. (intialize)
		
		// ������ ����(Integer)
		int number = 10;
		System.out.println(number);
		
		number = 5; // �����̹Ƿ� ���� ������ �� �ִ�. ����� �ڷ��� ���� ���ص���. 
		System.out.println(number);
		
		int number2 = 100;
		System.out.println(number + number2);
		int sum = number + number2;
		System.out.println(sum);

		// �Ǽ� ���� (Float) - ���� ����
		float f = 1.5f;
		System.out.println(f);
		
		// �Ǽ� ���� (Double)
		double d = 1.5;
		System.out.println(d);
		
		// ���� ���� (Character) : ���� �Ѱ�.   ���� ����ǥ�� ���Ѵ�. 
		char c = 'z';
		System.out.println(c);
		
		// boolean ����: ��(true) �Ǵ� ����(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println("���� " + isFalse);
		// camel case = ���� �̸� ������ �ܾ �������϶� �ι�° �̻� �ܾ� ù��¥�� �빮��
	
		// ���ڿ� ����
		String s = "�ȳ��ϼ���";
		System.out.println(s);
	}

}

