package TP95_RegexCoursExemples;

import java.util.regex.*;

public class Again {
	public static void main(String[] args) {
		// rechercher une chaîne qui commence par "bat" et un
		// nombre dans la plage [3-7]

		String input = "bat1, bat2, bat3, bat4, bat5, bat6, bat7, bat8";

		Pattern pattern = Pattern.compile("bat[3-7]");
		Matcher matcher = pattern.matcher(input);

		while (matcher.find())
			System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());
	}
}