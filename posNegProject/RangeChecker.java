package posNegProject;
/*
 * Abinaya
 * 15 Dec 2016
 * PosNeg Range checker project
 */

public class RangeChecker {

	public static void main(String[] args) {

		boolean r = PosNeg.posNeg(1, -1, false);
		System.out.println("1,-1,expected true->" + r);
		boolean r1 = PosNeg.posNeg(-1, 1, false);
		System.out.println("-1,1,expected true->" + r1);
		boolean r2 = PosNeg.posNeg(1, 1, false);
		System.out.println("1,1,expected false->" + r2);
		boolean r3 = PosNeg.posNeg(-1, -1, false);
		System.out.println("-1,-1,expected false->" + r3);
		boolean r4 = PosNeg.posNeg(-1, -1, true);
		System.out.println("-1,-1,expected true->" + r4);
		boolean r5 = PosNeg.posNeg(-1, 1, true);
		System.out.println("-1,1,expected false->" + r5);
		boolean r6 = PosNeg.posNeg(1, 1, true);
		System.out.println("1,1,expected false->" + r6);
		boolean r7 = PosNeg.posNeg(1, -1, true);
		System.out.println("1,-1,expected flase->" + r7);

	}
}
