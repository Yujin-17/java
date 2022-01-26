package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	// final: �ѹ��� �ʱ�ȭ �ϵ��� �ϴ� ��
	// 1. ����: ������ ���̸� �ѹ� �ʱ�ȭ �� ������ ���� ���Ҵ� �Ұ�
	// 2. �޼ҵ�: �޼ҵ忡 ���̸� �������̵� �Ұ�
	// 3. Ŭ����: Ŭ������ ���̸� ��� �Ұ�
	public static final Map<String, String> capitalMap= new HashMap<String,String>()
	{ 	
		{
		put("���ѹα�","����");
		put("����ũ","�����ϰ�");
		put("����","������");
		put("���þ�","��ũ��");
		put("���⿡","���");
		put("�����","���������");
		put("������","����Ȧ��");
		put("������","����");
		put("������","���帮��");
		put("�Ƹ���Ƽ��","�ο��뽺���̷���");
		put("����Ʈ","ī�̷�");
		put("�̶�","�����");
		put("��Ż����","�θ�");
		put("�Ϻ�","����");
		put("�ʸ���","���Ҷ�");
		put("�ɶ���","���Ű");
		put("������","�ĸ�");
		put("��Ű","��ī��");
		put("ĳ����","��Ÿ��");
		put("�ݷҺ��","����Ÿ");
		};
	

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // �����̸� List�� index�� ���� �� ��
        
        //�ߺ� �˻�
        List<Integer> quizIndex = new ArrayList<>();
        
        int score = 0;
        for(int i = 0; i < 5; i++) {
        	int randIndex = rand.nextInt(20); // 0~19
        	//�ߺ��˻�
        	if(quizIndex.contains(randIndex)) {
        		i--; // �ߺ��̸� �ٽ� ����.
        		continue;
        	}
        	quizIndex.add(randIndex); // �´� ������ index ����(�ߺ� �˻� ����)
        String capitalKey = keyList.get(randIndex);
        System.out.println(capitalKey + "�� �����̸���?");
        String answer = scan.next();
        
        if (answer.equals( capitalMap.get(capitalKey))) {
        	System.out.println("����");
        	score += 20;
        } else {
        	System.out.println("Ʋ�Ƚ��ϴ�");
        }
    
        System.out.println("�� ������: " + score);
        }
	}
	


