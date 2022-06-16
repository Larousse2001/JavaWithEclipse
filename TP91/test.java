package TP91;

public class test {

	public static void main(String[] args) {
		Formation f1 = new Formation("LSI2");
		f1.addModule("algebre", 2);
		f1.addModule("POO", 1);
		f1.addModule("SE", 2);
		System.out.println(f1.toString());

		Student s1 = new Student("11154595", f1);
		s1.addResultat("algebre", 20);
		s1.addResultat("algebre", 15);
		s1.addResultat("POO", 20);
		s1.addResultat("SE", 20);
		Student s2 = new Student("11154595", f1);
		s2.addResultat("algebre", 10);
		s2.addResultat("algebre", 15);
		s2.addResultat("POO", 20);
		s2.addResultat("SE", 20);
		System.out.println(s1.toString());
		System.out.println("Average of Student : " + s1.average("algebre"));
		System.out.println("General Average of Student : " + s1.generalAverage());
		if (s1.compareTo(s2) == 0) {
			System.out.println("These 2 students are equals");
		} else if (s1.compareTo(s2) > 0) {
			System.out.println("Student 1 is more intellegent than Student 2");
		} else
			System.out.println("Student 2 is more intellegent than Student 1");
	}

}
