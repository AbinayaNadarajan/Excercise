package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Intern> interns = new ArrayList<Intern>();

		interns.add(new Intern("Abinaya", 22));
		interns.add(new Intern("Sangeeth", 19));
		interns.add(new Intern("Arun", 24));
		interns.add(new Intern("Akshaya", 29));
		interns.add(new Intern("Hruday", 23));

		Collections.sort(interns);

		for (Intern sort : interns) {
			System.out.println(sort);
		}
	}
}
