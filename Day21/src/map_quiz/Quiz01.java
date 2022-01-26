package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		// 1.국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
		Map<String, Integer> scores = new HashMap<>();
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		System.out.println(scores);

		// 2.
		// scores.put("사회", 85);
		scores.put("사회", scores.get("사회") + 5);
		System.out.println(scores);

		// 3. 
//		Scanner scan = new Scanner(System.in);
//		System.out.print("조회할 과목명을 입력하세요: ");
//		String subject = scan.next();
//		
//		if(scores.containsKey(subject)) {
//			// 영어: 90
//			System.out.println(subject + " : " + scores.get(subject));
//		}else {
//			System.out.println("자료 없음");
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
			System.out.println("수상 가능");;
		}else {
			System.out.println("해당 없음");
		}
	
	}
	
	

}
