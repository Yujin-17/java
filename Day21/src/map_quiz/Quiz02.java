package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
		// 유재석, 박나래, 이지은, 서장훈, 이광수
		// 'X' String "X"
		Map<String, Character> map = new HashMap<>();
		map.put("유재석", 'x');
		map.put("박나래", 'x');
		map.put("이지은", 'x');
		map.put("서장훈", 'x');
		map.put("이광수", 'x');
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			if(name.startsWith("이")) {
				map.put(name, 'O');
			}
		}
		
		System.out.println(map);
	}

}
