package map;

import java.util.*;
import java.util.Map.Entry;
public class ContactDisplayer {
		private static Scanner scanner;
		private static String name;
		private static Map<String, Map<String, Set<String>>> map = new HashMap<String, Map<String, Set<String>>>();
		private static Map<String, Map<String, Set<String>>> map1 = new HashMap<String, Map<String, Set<String>>>();
		private static void showMenu() {
			int option;
			scanner = new Scanner(System.in);
			System.out.println("1. Add User"+"\n"+"2. View contact Details"+"\n"+"4. Exit");
			System.out.println("Choose the option");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				addUser();
				showMenu();
				break;
			case 2:
				viewContactDetails1();
				viewContactDetails();
				showMenu();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("you have chosen a wrong option, choose again");
				showMenu();
		}
		}
		private static Map<String, Map<String, Set<String>>> addUser() {
			System.out.println("Enter user name:");
			String name = scanner.next();
			map1.put(name, getPhoneNumbers(name));
			map.put(name, getEmailAddress(name));
			return map1;
		}
		private static Map<String, Set<String>> getPhoneNumbers(String name) {
			Set<String> mobileNumbers = new HashSet<String>();
			Set<String> homeNumbers = new HashSet<String>();
			Set<String> officeNumbers = new HashSet<String>();
			//Set<String> officeEmailAddress = new HashSet<String>();
			//Set<String> homeEmailAddress = new HashSet<String>();
			scanner = new Scanner(System.in);
			System.out.println("Enter an option to choose:" + " " + "\n " + "1.Add phone number" + " \n "
					+ "2.Add email address" + "\n " + "3.exit");
			System.out.println("enter any option");
			int option = scanner.nextInt();
			//if (option == 1) {
				do {
					System.out.println("Enter contact type" + "\n" + "1.Mobile" + " \n " + "2.Home" + "\n" + "3.office");
					int value = scanner.nextInt();
					if (value == 1) {
						System.out.println("Enter your mobile number");
						String v = scanner.next();
						if ((v.matches("\\d{10}")) || (v.matches("\\d{3}-\\d{7}"))) {
							mobileNumbers.add(v);
						} else {
							System.out.println("invalid number");
						}
					} else if (value == 2) {
						System.out.println("Enter your home number");
						String v2 = scanner.next();
						if ((v2.matches("\\d{10}")) || (v2.matches("\\d{3}-\\d{8}"))) {
							homeNumbers.add(v2);
						} else {
							System.out.println("invalid number");
						}
					} else if (value == 3) {
						System.out.println("Enter your office number");
						String v3 = scanner.next();
						if ((v3.matches("\\d{10}")) || (v3.matches("\\d{3}-\\d{7}"))) {
							officeNumbers.add(v3);
						} else {
							System.out.println("invalid number");
						}
					} else {
						System.out.println("enter a correct option");
					}
					System.out.println("Do you want to add more numbers? (y/n)");

				} while ((scanner.next()).equals("y"));

				Map<String, Set<String>> map1 = new HashMap<String, Set<String>>();
				map1.put("Work", mobileNumbers);
				map1.put("Home", homeNumbers);
				map1.put("office", officeNumbers);
				
			
			//System.out.println(map.size());
			return map1;
		}
			//return null;
		//}
			private static void viewContactDetails1() {
				System.out.println("Enter user name to get mobile numbers");
				String name = scanner.next();
				Map<String, Set<String>> userInfo = map1.get(name);
				if (userInfo != null) {
					for (Entry<String, Set<String>> e : userInfo.entrySet()) {
						System.out.println(e.getKey() + " : " + printString1(e.getValue()));
					}
				} else {
					System.out.println("sorry we dont have your info in our database");
				}
			}
			public static String printString1(Set<String> set) {
				String values = "  ";
				for (String temp : set) {
					values += temp + " ";
				}
				return values;
			}
		
		private static Map<String, Set<String>> getEmailAddress(String name) {
			Set<String> homeEmailAddress = new HashSet<String>();
			Set<String> officeEmailAddress= new HashSet<String>();
			//Set<String> otherContactNumbers = new HashSet<String>();
			scanner = new Scanner(System.in);
			String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))+$";
			do {
				System.out.println("Enter contact type to add email address:" +"\n" + "1.Home" + "\n" + "2.Office" + "\n" + " 3.exit");
				int type = scanner.nextInt();
				if (type==1) {
					System.out.println("Enter your home email address:");
					String haddress = scanner.next();
					Boolean result = haddress.matches(emailregex);
					if (result == true){
						homeEmailAddress.add(haddress);}
					else{
						System.out.println("Invalid email address");}			
				} else if (type==2) {
					System.out.println("Enter your office email address");
								
					String oaddress = scanner.next();
					Boolean result = oaddress.matches(emailregex);
					if (result == true){
						officeEmailAddress.add(oaddress);}
					else{
						System.out.println("Invalid email address");}
				}
				 else {
					System.out.println("you have chosen wrong type");
				}
				System.out.println("Do you want to add more email address? (Y/N)");
			} while ((scanner.next()).equalsIgnoreCase("y"));
			Map<String, Set<String>> map = new HashMap<String, Set<String>>();
			map.put("home", homeEmailAddress);
			map.put("office", officeEmailAddress);
			return map;
		}
		private static void viewContactDetails() {
			System.out.println("Enter user name to get email details");
			String name = scanner.next();
			Map<String, Set<String>> userInfo = map.get(name);
			if (userInfo != null) {
				for (Entry<String, Set<String>> e : userInfo.entrySet()) {
					System.out.println(e.getKey() + " : " + printString1(e.getValue()));
				}
			} else {
				System.out.println("sorry we dont have your info in our database");
			}
		}
		public static String printString(Set<String> set) {
			String values = "  ";
			for (String temp : set) {
				values += temp + " ";
			}
			return values;
		}
		public static void main(String[] args) {
			showMenu();
			getPhoneNumbers(name);
			
		}
	}

