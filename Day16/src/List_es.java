import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_es {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		
		
		// List 인터페이스 실체 구현체인 LinkedList 사용 
		List<Integer>  list2 = new LinkedList<>();
		list2.add(10);
		list2.addAll(list2);
		System.out.println(list2);
		
		// 요소 수정하기
		// list2 10->200 으로 변경
		System.out.println(list2.set(0, 200)); // (변경할위치(index), 변경할 값) 리턴되는 값: 삭제된(기존) 값
		System.out.println(list2);
		
		// 요소 삭제하기
		// index 1값 삭제
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
		
		// 모든 요소 삭제하기
		list2.clear();
		System.out.println("list2:" + list2);
	}

}
