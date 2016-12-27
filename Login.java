package banking;

import java.util.Scanner;

public class Login extends Account {

	private static Scanner s;

	public static void main(String args[]) {
		PayeeDetails p2 = new PayeeDetails();
		Account f = new Account();
		Account f2= new Account();
		System.out.println("*********WELCOME TO BANKING*********");
		System.out.println("Enter your login name:");
		s = new Scanner(System.in);
		String n1 = s.next();
		// Enter the pin value as 1111
		System.out.println("Enter your Four digit pin:");
		int pin = s.nextInt();
		if (pin != PIN) {
			System.out.println("Invalid pin");
			System.exit(0);
		} else {
			boolean t = true;
			while (t) {
				System.out.println("Choose an option" + " " + n1 + " " + "\n " + "1.deposit" + " \n " + "2.Withdraw"
						+ " \n " + "3.Balance" + " \n " + "4.Exit");
				System.out.println("Enter an option");

				int option = s.nextInt();
				switch (option) {
				case 1:
					try {
						f.deposit();
						break;
						
					} catch (Exception e) {
						System.out.println("invalid amount");
						f2.deposit();
						 break;
					}

				case 2:
					try{
					f.withdraw();
					break;
					}catch(Exception e){
						System.out.println("invalid amount");
						f2.withdraw();
						break;
					}
				case 3:
					f.balance();
					break;
				case 4:
					System.out.println("Exited successfully!!");
					t = false;
					break;

				default:
					System.out.println("invalid option");
					t = false;

				}
			}
		}

		System.out.println("Do you want to add payee details to your account (y/n)");
		String ch;
		ch = s.next();

		if (ch.equals("y")) {
			System.out.println("Enter the payee name:");
			String name = s.next();
			p2.setName(name);
			System.out.println("Enter Account_id:");
			int id = s.nextInt();
			p2.setId(id);
			System.out.println("Enter branch name:");
			String br = s.next();
			p2.setBrName(br);
			System.out.println("Enter Account num:");
			int y = s.nextInt();
			p2.setAccNo(y);
			System.out.println("your payee is added successfully");

		} else {
			System.out.println("***THANK YOU VISIT AGAIN***");
			System.exit(0);
		}
		p2.display();
		System.out.println("Do you want to logout (y/n)");
		String h;
		h = s.next();
		if (h.equals("y")) {
			System.out.println("You are Logged out ");

		} else
			System.out.println("Thank YOU");

	}

}
