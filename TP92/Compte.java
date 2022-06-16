package TP92;

public class Compte extends Thread {
	String nom;
	int direction;
	int max = 100;

	public Compte(String nom, int direction) {
		this.direction = direction;
		this.nom = nom;
	}

	public void run() {
		int cp;
		System.out.format("Je suis le thread %s \n", nom);
		for (int i = 0; i < 100; i++) {
			cp = (max - 1) * ((1 - direction) / 2) + (direction * i);
			System.out.format("%s du %d \n", nom, cp);
		}
	}

	public static void main(String[] args) {
		String jobNameA = String.format("Job_%d", 0);
		String jobNameB = String.format("Job_%d", 1);
		Compte TA = new Compte(jobNameA,-1);
		Compte TB = new Compte(jobNameB,1);
		System.out.format("Creating thread %s\n", jobNameA);
		System.out.format("Creating thread %s\n", jobNameB);
		TA.run();
		TB.run();
	}

}
