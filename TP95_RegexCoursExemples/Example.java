package TP95_RegexCoursExemples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		// correspondre à un chiffre suivi d'un mot
		Pattern p = Pattern.compile("\\d+\\w+");
		Matcher m = p.matcher("this is the 1st test string");
		if (m.find())
			System.out.println("matched [" + m.group() + "] from " + m.start() + " to " + m.end());

		else
			System.out.println("didn’t match");
	}
}
