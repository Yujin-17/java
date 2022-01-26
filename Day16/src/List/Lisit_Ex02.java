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
		
		// 1. index ������� ���
//		for(int i = 0; i < fruits.size() ; i++) {
//			System.out.println(fruits.get(i));
//			
//			// ���࿡ ���� �̸��� b�� �����ϸ� ��� ���� 
//			if(fruits.get(i).startsWith("b")) {
//				fruits.remove(i); // fruits.size���� �پ��. 
//				i--; // ������ �� �� �ѹ� �� ������ ���� i-- 
//			}
//		}
//		
//		System.out.println(fruits);
		
		//2. Iterator ����ϱ� 
//		Iterator<String> iter = fruits.iterator();
//		while (iter.hasNext()) {
//			String fruit = iter.next(); // next() ȣ���� ������ �Һ� �ǹǷ� �ݺ������� �ѹ��� �����ϴ� ���� ����.
//			System.out.println(fruit); // apple banana grape
//			
//			if(fruit.startsWith("b")) {
//				iter.remove(); // ����Ʈ���� ������ �ƴ϶� �ݵ�� iterator�� remove�� �����ؾ� �Ѵ�.
//			}
//		}
//		System.out.println(fruits);
		
		//3. ���� for�� 
		// money in pocket
		// �ڹٹ������� �ٸ��Ƿ� �߰��� ����Ʈ�� ������ ���� ������� �ʴ´�. 
		for(String fruit : fruits) {
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		
	}

}
