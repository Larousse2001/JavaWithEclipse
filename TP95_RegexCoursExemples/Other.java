package TP95_RegexCoursExemples;

import java.util.regex.*;

public class Other {

	public static void main(String[] args) {
		// rechercher un espace blanc, 'f' et deux caractères
		// quelconques
		Pattern pattern = Pattern.compile("\\sf..");
		Matcher matcher = pattern.matcher("The quick brown fox jumps over the lazy dog");

		while (matcher.find()) {
			System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());

		}
	}
}
