package TP94_GenereciteCoursExemples;

public class Test {
	public static void main(String[] args) {
		String[] phrase = { "Marie", "poss�de", "une", "petite", "lampe" };
		Paire<String> extremes = TableauAlg.minmax(phrase);
		System.out.println("min = " + extremes.getPremier());
		System.out.println("max = " + extremes.getDeuxieme());
	}
}