package posNegProject;
/*
 * Abinaya
 * 15 Dec 2016
 * PosNeg test checker project
 */

public class TestChecker {

	public static void main(String[] args) {

		boolean haveTestPassed = true;
		if (!PosNeg.posNeg(1, -7, false) == true)
			haveTestPassed = false;
		if (!PosNeg.posNeg(-1, 1, false) == true)
			haveTestPassed = false;
		if (!PosNeg.posNeg(1, 1, false) == false)
			haveTestPassed = false;
		if (!PosNeg.posNeg(-1, -1, false) == false)
			haveTestPassed = false;
		if (!PosNeg.posNeg(-1, -1, true) == true)
			haveTestPassed = false;
		if (!PosNeg.posNeg(-1, 1, true) == false)
			haveTestPassed = false;
		if (!PosNeg.posNeg(1, 1, true) == false)
			haveTestPassed = false;
		if (!PosNeg.posNeg(1, -1, true) == false)
			haveTestPassed = false;

		if (haveTestPassed)
			System.out.println("TEST Passed!!!!!!");
		else
			System.out.println("TEST Failed!!!!!!");

	}

}
