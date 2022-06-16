package TP93;

public class Voiture extends Thread {
	String id;
	Parking p;

	public Voiture(String id, Parking p) {
		this.id = id;
		this.p = p;
	}

	public void demander() {
		while (!p.entrer(this)) {
			System.out.format("voiture %s redemande de rentrer \n", id);
		}
	}

	public void run() {
		System.out.format("voiture %s veut entrer \n", id);
		try {
			demander();
			sleep((long) Math.random());
			p.sortir(this);
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
}
