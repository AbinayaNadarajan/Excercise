package posNegProject;

import java.util.Scanner;
/*
 * Abinaya
 * 15 Dec 2016
 * PosNeg project
 */

public class PosNeg {

	public static boolean posNeg(int a, int b, Boolean negative) {

		if (negative == true) {
			if (a < 0 && b < 0)
				return (true);
			else
				return (false);
		} else if (negative == false) {
			if (a < 0 && b < 0)
				return (false);
			else if (a < 0 || b < 0)
				return (true);
			else
				return (false);
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a and b : ");
		System.out.println(posNeg(s.nextInt(), s.nextInt(), s.nextBoolean()));
		s.close();

	}

}
