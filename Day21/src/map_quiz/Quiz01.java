package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		// 1.���� : 90, ���� : 85, ���� : 90, ��ȸ : 80, ���� : 100
		Map<String, Integer> scores = new HashMap<>();
		scores.put("����", 90);
		scores.put("����", 85);
		scores.put("����", 90);
		scores.put("��ȸ", 80);
		scores.put("����", 100);
		System.out.println(scores);

		// 2.
		// scores.put("��ȸ", 85);
		scores.put("��ȸ", scores.get("��ȸ") + 5);
		System.out.println(scores);

		// 3. 
//		Scanner scan = new Scanner(System.in);
//		System.out.print("��ȸ�� ������� �Է��ϼ���: ");
//		String subject = scan.next();
//		
//		if(scores.containsKey(subject)) {
//			// ����: 90
//			System.out.println(subject + " : " + scores.get(subject));
//		}else {
//			System.out.println("�ڷ� ����");
//		}
		
		
		// 4. 
		Set<String> keys = scores.keySet();
		System.out.println(keys);
		
		Iterator<String> iter = keys.iterator();
		while ( iter.hasNext()) {
			String subject = iter.next();
			int score = scores.get(subject);
			if(score >= 90) {
				System.out.print(subject + " ");
			}
		}
		System.out.println();
		
		// 5. 
		if ( scores.containsValue(100)) {
			System.out.println("���� ����");;
		}else {
			System.out.println("�ش� ����");
		}
	
	}
	
	

}
