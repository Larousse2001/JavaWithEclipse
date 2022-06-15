package TP6;

public class ExisteException extends Exception {
	public ExisteException(Barque B) {
		System.out.println("La barque " + B + " existe deja dans le port");
	}

}
