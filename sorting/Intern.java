package sorting;

public class Intern implements Comparable<Intern> {
		private String name;
		private int age;
		
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
		
		public Intern(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public int compareTo(Intern interns) {
			int sortByAge=((Intern)interns).getAge();
			return this.age-sortByAge;
		}
		
		public String toString() {
	        return "Intern Name : "+name+"\t"+" Intern Age : "+age;}
	}
	

