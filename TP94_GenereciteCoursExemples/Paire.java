package TP94_GenereciteCoursExemples;
/*
	Une classe g�n�rique est une classe comprenant une ou plusieurs
	variables de type. Autrement, c�est une classe param�tr�e, dont le param�tre est
	un type d'objet.
 */
public class Paire<T> {
	private T premier;
	private T deuxieme;

	public Paire() {
		premier = null;
		deuxieme = null;
	}

	public Paire(T premier, T deuxieme) {
		this.premier = premier;
		this.deuxieme = deuxieme;
	}

	public T getPremier() {
		return this.premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getDeuxieme() {
		return this.deuxieme;
	}

	public void setDeuxieme(T deuxi�me) {
		this.deuxieme = deuxieme;
	}
}
