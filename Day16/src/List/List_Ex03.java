package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List_Ex03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// list에 5가 있는가?
		System.out.println(list.contains(5));
		// list에 7이 있는가?
		System.out.println(list.contains(7));
		
		// 오름차순 정렬
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		// 내림차순 정렬
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		// 리스트가 비어있는지 확인 
		System.out.println("리스트가 비어있는가? " + list.isEmpty());
		
		list.clear();
		System.out.println("리스트가 비어있는가? " + list.isEmpty());
	}

}
