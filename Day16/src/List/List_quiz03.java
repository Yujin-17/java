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
		System.out.println("�ְ����� �������� ������ ��� ������ "+ (sum - min - max) / (double)(list.size() - 2)	);
	
		//2. ȸ�� �߰��ϱ�

		List<String> list2 = new ArrayList<>(); 
		list2.add("���");
		list2.add("����");
		list2.add("���");
		list2.add("����");
		list2.add("�κ�");
		
		List<String> list3 = new ArrayList<>();
		list3.add("����");
		list3.add("����");
		list3.add("����");
		list3.add("�κ�");
		list3.add("����");
		
		for(int i = 0; i < list3.size(); i++) {
			
		}
		
		
		
	}

}
