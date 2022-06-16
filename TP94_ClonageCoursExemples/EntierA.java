package TP94_ClonageCoursExemples;

public class EntierA implements Cloneable {
	private int entier = 10;

	public int getEntier() {
		return entier;
	}

	public void setEntier(int entier) {
		this.entier = entier;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (EntierA) super.clone();
	}
}
