package TP94_GenereciteCoursExemples;

class Pair<T> {
	private T premier;
	private T deuxieme;

	public Pair() {
		premier = null;
		deuxieme = null;
	}

	public Pair(T premier, T deuxieme) {
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

	public void setDeuxieme(T deuxieme) {
		this.deuxieme = deuxieme;
	}
}
