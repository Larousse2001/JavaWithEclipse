package TP94_GenereciteCoursExemples;

class Eleve extends Personne {
	private double[] notes = new double[10];
	private int nombreNote = 0;

	public Eleve(String nom, String prenom) {
		super(nom, prenom);
	}

	public void ajoutNote(double note) {
		if (nombreNote < 10)
			notes[nombreNote++] = note;
	}
}
