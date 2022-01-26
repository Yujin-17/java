package List;

import java.util.ArrayList;
import java.util.List;

public class List_quiz03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		list.add(4);
		
		int min = 100;
		for(int i = 0; i < list.size();i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		int max = 0;
		for(int i = 0; i < list.size();i++) {
			if(list.get(i) > max) {
				if(list.get(i) > max) {
					max = list.get(i);
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < list.size();i++) {
			sum += list.get(i);
		}
		System.out.println("최고점과 최저점을 제외한 평균 점수는 "+ (sum - min - max) / (double)(list.size() - 2)	);
	
		//2. 회원 추가하기

		List<String> list2 = new ArrayList<>(); 
		list2.add("우솝");
		list2.add("루피");
		list2.add("상디");
		list2.add("나미");
		list2.add("로빈");
		
		List<String> list3 = new ArrayList<>();
		list3.add("보람");
		list3.add("루피");
		list3.add("쵸파");
		list3.add("로빈");
		list3.add("보람");
		
		for(int i = 0; i < list3.size(); i++) {
			
		}
		
		
		
	}

}
