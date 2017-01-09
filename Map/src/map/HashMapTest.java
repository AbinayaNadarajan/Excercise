package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(5, "f");
		h.put(9, "d");
		h.put(2, "e");
		h.put(2, "f");
		System.out.println(h);
		System.out.println("value after");
		h.put(2, "a");
		System.out.println(h);
		Set s =h.entrySet();
		System.out.println(s);
		/*
		Iterator iterator = s.iterator();
		 while(iterator.hasNext())
			 Map.Entry men = (Map.Entry)iterator.next();*/
		if(h.containsKey(9))
			System.out.println(h.get(9));
		if(h.containsValue("f"))
			System.out.println(h.get("f"));
		for (Integer key : h.keySet()) {
		    System.out.println("Key = " + key);}
		
		    for(String s1:h.values())
		    	System.out.println("values:"+s1);
		
		
		

	}

	}

