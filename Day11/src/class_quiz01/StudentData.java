package class_quiz01;
//���赵, �ڷ���
public class StudentData {
	//�Ӽ� : �ʵ�
	String name;
	String className;
	int age;
	String phoneNumber;
	
	//����, ��� : �޼ҵ� 
	void isAdult(){
		if(this.age >= 20) {
			System.out.println(this.name + "�� �����Դϴ�.");
		}else {
			System.out.println(this.name + "�� �̼������Դϴ�.");
		}
	}
	
}
