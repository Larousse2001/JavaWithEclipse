package TP95_RegexCoursExemples;

import java.util.regex.*;

public class TestRegex {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java TestRegex string regExp");
			System.exit(0);
		}
		System.out.println("Input: \"" + args[0] + "\"");
		System.out.println("Regular expression: \"" + args[1] + "\"");
		Pattern p = Pattern.compile(args[1]);
		Matcher m = p.matcher(args[0]);
		while (m.find())
			System.out.println("Match \"" + m.group() + "\" at positions " +

					m.start() + "-" + (m.end() - 1));

	} 
} 
