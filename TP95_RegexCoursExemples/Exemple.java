package TP95_RegexCoursExemples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exemple {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[a-z&&[^aeiou]]");
		Matcher matcher = pattern.matcher("The quick brown fox.");

		while (matcher.find()) {
			System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());
		}
	}
}
