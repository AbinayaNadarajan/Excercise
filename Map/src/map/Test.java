package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {
	private static String name;
	private static Scanner s1;
	static Map<String, Map<String, Set<String>>> map = new HashMap<String, Map<String, Set<String>>>();
	static Map<String, Set<String>> map1 = new HashMap<String, Set<String>>();

	private static Map<String, Map<String, Set<String>>> addDetails() {
		System.out.println("Enter your name:");
		String name = s1.next();
		map.put(name, getDetails(name));
		return map;
	}

	private static Map<String, Set<String>> getDetails(String name) {
		Set<String> mobileNumbers = new HashSet<String>();
		Set<String> homeNumbers = new HashSet<String>();
		Set<String> officeNumbers = new HashSet<String>();
		Set<String> officeEmailAddress = new HashSet<String>();
		Set<String> homeEmailAddress = new HashSet<String>();
		s1 = new Scanner(System.in);
		System.out.println("Enter an option to choose:" + " " + "\n " + "1.Add phone number" + " \n "
				+ "2.Add email address" + "\n " + "3.exit");
		System.out.println("enter any option");
		int option = s1.nextInt();
		if (option == 1) {
			do {
				System.out.println("Enter contact type" + "\n" + "1.Mobile" + " \n " + "2.Home" + "\n" + "3.office");
				int value = s1.nextInt();
				if (value == 1) {
					System.out.println("Enter your mobile number");
					String v = s1.next();
					if ((v.matches("\\d{10}")) || (v.matches("\\d{3}-\\d{7}"))) {
						mobileNumbers.add(v);
					} else {
						System.out.println("invalid number");
					}
				} else if (value == 2) {
					System.out.println("Enter your home number");
					String v2 = s1.next();
					if ((v2.matches("\\d{10}")) || (v2.matches("\\d{3}-\\d{8}"))) {
						homeNumbers.add(v2);
					} else {
						System.out.println("invalid number");
					}
				} else if (value == 3) {
					System.out.println("Enter your office number");
					String v3 = s1.next();
					if ((v3.matches("\\d{10}")) || (v3.matches("\\d{3}-\\d{7}"))) {
						officeNumbers.add(v3);
					} else {
						System.out.println("invalid number");
					}
				} else {
					System.out.println("enter a correct option");
				}
				System.out.println("Do you want to add more numbers? (y/n)");

			} while ((s1.next()).equals("y"));

			Map<String, Set<String>> map = new HashMap<String, Set<String>>();
			map.put("Work", mobileNumbers);
			map.put("Home", homeNumbers);
			map.put("office", officeNumbers);
			return map;
			

		} else if (option == 2) {
			do {
				System.out.println("Do you want to add email address(y/n)" + "\n" + "1.Home" + "\n" + "2.Office" + "\n"
						+ " 3.exit");
				System.out.println("Enter the option:");
				int o = s1.nextInt();
				String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))+$";
				Scanner s = new Scanner(System.in);
				if (o == 1) {
					System.out.println("Enter your home email address:");
					String haddress = s.nextLine();
					Boolean result = haddress.matches(emailregex);
					if (result == true) {
						homeEmailAddress.add(haddress);
					} else {
						System.out.println("Invalid email address");
					}
				} else if (o == 2) {
					System.out.println("Enter your office email address:");
					String oaddress = s.nextLine();
					Boolean result = oaddress.matches(emailregex);
					if (result == true) {
						officeEmailAddress.add(oaddress);
					} else {
						System.out.println("Invalid email address");
					}
				} else {
					System.out.println("enter a correct option");
				}
				System.out.println("Do you want to add email address? (y/n)");
			} while ((s1.next()).equalsIgnoreCase("y"));
			Map<String, Set<String>> map = new HashMap<String, Set<String>>();
			map.put("home", homeEmailAddress);
			map.put("office", officeEmailAddress);

			return map;
		}
		return map1;
		
	}

	

	private static void viewDetails() {
		System.out.println("Enter your name to get the details");
		name = s1.next();
		Map<String, Set<String>> details = map.get(name);
		if (details != null) {
			for (Entry<String, Set<String>> e : details.entrySet()) {
				System.out.println(e.getKey() + " : " + printString1(e.getValue()));
			}
		} else {
			System.out.println("NO such recors found");
		}
	}

	Map<String, Set<String>> userInfo = map.get(name);
	{
		if (userInfo != null) {
			for (Entry<String, Set<String>> e : userInfo.entrySet()) {
				System.out.println(e.getKey() + " : " + printString1(e.getValue()));
			}
		} else {
			System.out.println("sorry we dont have your info in our database");
		}
	}

	public static String printString1(Set<String> set) {
		String iter = "  ";
		for (String s : set) {
			iter += s + " ";
		}
		return iter;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to add user details (y/n):");
		String ch = s.next();
		System.out.println("Enter an option to choose:" + " " + "\n " + "1.Add phone number" + " \n "
				+ "2.Add email address" + "\n " + "3.exit");
		int option = s.nextInt();
		switch (option) {
		case 1:
			addDetails();
			viewDetails();
			break;
		case 2:

		case 3:
			System.exit(0);
		default:
			System.out.println("Thank you");
		}

	}
}
