package TP94_GenereciteCoursExemples;

class PairJoker<T> {
	private T premier;
	private T deuxieme;

	public PairJoker() {
		premier = null;
		deuxieme = null;
	}

	public PairJoker(T premier, T deuxieme) {
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
