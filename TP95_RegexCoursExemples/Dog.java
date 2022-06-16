package TP95_RegexCoursExemples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dog {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("dog$");
		Matcher matcher = pattern.matcher("The quick brown dog jumps over the lazy dog");

		if (matcher.find())
			System.out.format("Text \"%s\" found at %d to %d.%n", matcher.group(), matcher.start(), matcher.end());
	}
}
