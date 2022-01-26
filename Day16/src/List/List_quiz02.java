package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_quiz02 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		
		System.out.println(list);
		
		// 2. ÃÖ¼Ò°ª 
		int a = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < a ) {
				a = list.get(i);
			}
		}
		System.out.println(a);
		
		Iterator<Integer> iter = list.iterator();
		int sum = 0;
//		for(int i = 0; i < list.size(); i++) {
//			sum += iter.next();
//		}
		while(iter.hasNext()) {
			sum+= iter.next();
		}
		System.out.println(sum);
	}
	
	

}
