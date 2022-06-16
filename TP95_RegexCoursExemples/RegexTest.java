package TP95_RegexCoursExemples;

import java.util.regex.*;

public class RegexTest {
	public static void main(String args[]) {
		String pattern = "[a-z]+";
		String text = "Now is the time";

		Pattern p = Pattern.compile(pattern); // Compiler le pattern
		Matcher m = p.matcher(text); // Cr�er un matcher pour le texte en utilisant le pattern
		while (m.find()) // renvoie true si le motif correspond � n'importe quelle partie de la cha�ne de texte ; faux sinon
			System.out.println(text.substring(

					m.start(), m.end()));
		// m.start() renvoie l'index du premier caract�re trouv�  / m.end() renvoie l'index du dernier caract�re trouv�
		
	}
}
