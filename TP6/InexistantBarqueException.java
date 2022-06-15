package TP6;

public class InexistantBarqueException extends Exception {
	public InexistantBarqueException(Barque B) {
		System.out.println("La barque " + B + " n'existe pas dans le port");
	}
}
