package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String ,String> map = new HashMap<String,String>();
		map.put("null", "abinaya");
		map.put("b", "sangeetha");
		map.put("c", "surya");
		map.put("d", "ramya");
		map.put("e", "surya");
		HashMap<String ,String> map1 = new HashMap<String,String>();
		map1.put("a", "sangeetha");
		map1.put("b", "poornima");
		map1.put("r", "abinaya");
		map1.put("e", "jenifer");
		Map<String, Set<String>> map11 = new HashMap<String, Set<String>>();

		//map11.put("Work", workContactNumbers);

		//map11.put("Home", homeContactNumbers);

		//map11.put("Other", otherContactNumbers);

	}

}
