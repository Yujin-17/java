import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_es {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		
		
		// List �������̽� ��ü ����ü�� LinkedList ��� 
		List<Integer>  list2 = new LinkedList<>();
		list2.add(10);
		list2.addAll(list2);
		System.out.println(list2);
		
		// ��� �����ϱ�
		// list2 10->200 ���� ����
		System.out.println(list2.set(0, 200)); // (��������ġ(index), ������ ��) ���ϵǴ� ��: ������(����) ��
		System.out.println(list2);
		
		// ��� �����ϱ�
		// index 1�� ����
		Integer deleted = list2.remove(1);
		System.out.println("deleted value: " + deleted);
		System.out.println("list2: " + list2);
		
		List<String> strList = new ArrayList<>();
		strList.add("abc");
		strList.add("qwer");
		System.out.println(strList);
		System.out.println(strList.remove("qwer"));
		System.out.println(strList);
		
		System.out.println("list2: " + list2);
		Integer value = 200;
		list2.remove(value);
		System.out.println("list2: " + list2);
		
		// ��� ��� �����ϱ�
		list2.clear();
		System.out.println("list2:" + list2);
	}

}
