package Inheritance_quiz02;

public class HeathTest {

	public static void main(String[] args) {
		// ��ü ����, �̸�, ������, Ű
		
		// �ڽ� Ŭ������ ��ü�� ������ �� �θ�����ڰ� ���� ȣ��� �� �ڽĻ����ڰ� ȣ���.
		// �ڽ� �����ڿ��� �θ� �����ڸ� (�츮��) ȣ������ ������ �ڹٿ��� �⺻ �����ڰ� �����ȴ�. 
		// �θ��� �⺻ �����ڸ� ȣ���Ѵ�. 
		HeathRate rate1 = new HeathRate("�ڵѸ�", 160, 45);
		HeathRate rate2 = new HeathRate("ȫ�浿", 168, 90);
		
		
		rate1.showInfo();
		rate2.showInfo();
		
		
	}

}

