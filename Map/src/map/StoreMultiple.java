package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StoreMultiple {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("orange");
		l1.add("Ant");
		List<String> l2 = new ArrayList<String>();
		l2.add("babay");
		l2.add("banana");
		l2.add("banyan");
		l2.add("bamboo");
		List<String> l3 = new ArrayList<String>();
		l3.add("cat");
		l3.add("can");
		l3.add("candle");
		l3.add("case");
		map.put("A", l1);
		map.put("B", l2);
		map.put("C", l3);
		//Iterator i = ((List<String>) map).iterator();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry. getValue();
            System.out.println("Key = " + key +"Values = " + values );
			}
}
}
	
