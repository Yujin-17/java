package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lisit_Ex02 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		
		// 1. index 기반으로 출력
//		for(int i = 0; i < fruits.size() ; i++) {
//			System.out.println(fruits.get(i));
//			
//			// 만약에 과일 이름이 b로 시작하면 요소 제거 
//			if(fruits.get(i).startsWith("b")) {
//				fruits.remove(i); // fruits.size까지 줄어듬. 
//				i--; // 삭제가 될 때 한번 더 돌리기 위해 i-- 
//			}
//		}
//		
//		System.out.println(fruits);
		
		//2. Iterator 사용하기 
//		Iterator<String> iter = fruits.iterator();
//		while (iter.hasNext()) {
//			String fruit = iter.next(); // next() 호출할 때마다 소비가 되므로 반복문에서 한번만 수행하는 것이 좋다.
//			System.out.println(fruit); // apple banana grape
//			
//			if(fruit.startsWith("b")) {
//				iter.remove(); // 리스트에서 삭제가 아니라 반드시 iterator의 remove로 삭제해야 한다.
//			}
//		}
//		System.out.println(fruits);
		
		//3. 향상된 for문 
		// money in pocket
		// 자바버전마다 다르므로 중간에 리스트를 수정할 때는 사용하지 않는다. 
		for(String fruit : fruits) {
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		
	}

}
