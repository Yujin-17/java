package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_quiz01 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(3);
		list1.add(8);
		list1.add(9);
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(7);
		list1.add(5);
		System.out.println(list1);
		
		// �ѹ��� add �ϴ� ��
		// Arrays.asList�� ����� ���� �����ϰų� ������ �� ����.(���� ����Ʈ)
		List<Integer> list2 = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5);
		//list2.add(100);
		System.out.println("list2" + list2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5));
		list3.add(100);
		System.out.println("list3" + list3);
		
		// 2. �� �����ϱ� index 3 -> 6���� ���� 
		list1.set(3,6);
		System.out.println(list1);

		
		
		Integer value1 = 8;
		Integer value2 = 7;
		
		list1.remove(value1);
		list1.remove(value2);
		System.out.println(list1);
		
		
	}

}
