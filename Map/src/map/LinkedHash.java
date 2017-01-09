package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHash {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(2, "m");
		m.put(4, "u");
		m.put(1, "r");
		m.put(3, "t");
		m.put(2, "y");
		m.put(9, "u");
		m.put(1,"ani");
		m.put(1,"alli");
		m.put(1,"als");
		
		System.out.println(m);
		 Set set = m.entrySet();
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();

		Set<String> workContactNumbers = null;
		//map.put("Work", new("workContactNumbers"));

		Set<String> homeContactNumbers = null;
		map.put("Home", homeContactNumbers);

		Set<String> otherContactNumbers = null;
		map.put("Other", otherContactNumbers);

		System.out.println(map);

		for(Integer a:m.keySet())
			System.out.println(a+" "+m.get(a));
		System.out.println("\nExample 4...");
		//m.forEach((k,v)->System.out.println( k +" "+ v));

	}

}
