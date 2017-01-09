package map;
import java.util.*;
public class TestHash {

	/**
	 *  ====================================================================
	 *  TestHashMap.java. This program demonstrates the use of a map with
	 *  key type String and value type Employee.
	 * 
	 *  Author: Cay Horstmann.
	 *  Modified by: Mark Austin
	 *  ====================================================================
	 */

	


	   public static void main(String[] args) {

	      // Create and populate the hash map ....

	      Map<String, String> staff = new HashMap<String, String>();

	      staff.put("144-25-5464", ("Amy Lee"));
	      staff.put("567-24-2546",("Harry Hacker"));
	      staff.put("157-62-7935", ("Gary Cooper"));
	      staff.put("456-62-5527", ("Francesca Cruz"));

	      // Print all entries

	      System.out.println("Print all entries in the HashMap as a set");
	      System.out.println("=========================================");

	      System.out.println(staff);

	      /*// Remove an entry

	      System.out.println("Remove entry with id = 567-24-2546");
	      staff.remove("567-24-2546");

	      // Replace an entry

	      System.out.println("Replace entry with id = 456-62-5527");
	      staff.put("456-62-5527", ("Francesca Miller"));

	      // Look up a value

	      System.out.println("Find employee with id 157-62-7935");
	      System.out.println("=================================");

	      System.out.println( staff.get("157-62-7935") );

	      // Iterate through all entries
/
	      System.out.println("Iterate over the Hashmap Entries ");
	      System.out.println("=================================");

	      for (Map.Entry<String,String> entry : staff.entrySet()) {
	         String key     = entry.getKey();
	         String value = entry.getValue();
	         System.out.println("key = " + key + ", value = " + value);
	      }

	      System.out.println("=================================");
	   }*/
	


}}