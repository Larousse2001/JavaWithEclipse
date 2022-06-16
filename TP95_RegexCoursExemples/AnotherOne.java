package TP95_RegexCoursExemples;

import java.util.regex.*;

public class AnotherOne {

	public static void main(String[] args) {
		String sentence = "The quick brown fox and BROWN tigerjumps over the lazy dog";

		Pattern pattern = Pattern.compile("brown", Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher(sentence);

		while (matcher.find())
			System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());
	}

}
