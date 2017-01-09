package map;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailTest {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		System.out.println("Enter the email address:");
		Scanner s = new Scanner(System.in);
		String mydomain = s.nextLine();
		String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))+$";
		Boolean result = mydomain.matches(emailregex);
		if (result == false) {
			System.out.println("Email Address is Invalid");

		} else if (result == true) {
			System.out.println("Email Address is Valid");
			a.add(mydomain);
			System.out.println(mydomain);

		}

	}

}
