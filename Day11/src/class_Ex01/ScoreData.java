package class_Ex01;

// ���赵, ���ο� ������Ÿ��(�ڷ���)
public class ScoreData {
	// 1. �Ӽ�: �������, �ʵ�(field),
	int score;
	String subject; 
	int ranking;
	
	// 2. ����, ���: �޼ҵ�(method)
	void printScoreInfo() {
		System.out.println("�����: " + this.subject); // this -> ��Ŭ������ �ִ� �ʵ�. 
		System.out.println("����: " + this.score);
		System.out.println("���: " + this.ranking);
	}
}
