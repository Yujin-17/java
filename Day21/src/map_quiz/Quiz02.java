package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
		// ���缮, �ڳ���, ������, ������, �̱���
		// 'X' String "X"
		Map<String, Character> map = new HashMap<>();
		map.put("���缮", 'x');
		map.put("�ڳ���", 'x');
		map.put("������", 'x');
		map.put("������", 'x');
		map.put("�̱���", 'x');
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			if(name.startsWith("��")) {
				map.put(name, 'O');
			}
		}
		
		System.out.println(map);
	}

}
