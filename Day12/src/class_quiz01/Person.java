package class_quiz01;

public class Person {
	//�ʵ�
	String name;
	String birth;
	String gender;
	//�޼ҵ�
	void hello(){
		System.out.println("�ȳ��ϼ���");
	}
	void walk() {
		System.out.println("���� �ȴ� �� �Դϴ�");
	}
	void mine() {
		System.out.println("�� �̸��� "+ this.name + "�̰� ������ "+ this.gender+ "�Դϴ�.");
	}
	void age() {
		String a = this.birth.substring(0, 4);
		int age = Integer.valueOf(a);
		System.out.println("���̴� " + ( 2021 - age + 1)+ "�� �Դϴ�.");
	}
}


