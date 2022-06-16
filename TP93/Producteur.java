package TP93;

import java.util.concurrent.*;

public class Producteur extends Thread {
	private Magasin m;
	private String nom;
	Semaphore s1 = new Semaphore(1);
	Semaphore s2 = new Semaphore(0);

	public Producteur(Magasin m, String nom) {
		this.m = m;
		this.nom = nom;
	}

	public void run() {
		try {
			for (int i = 0; i <= 43; i++) {
				// s1.acquire();--> methode du semaphore
				synchronized (m) {
					while (m.estPlein()) {
						m.wait();
						// s2.acquire(); --> methode du semaphore
					}
					System.out.println("avant ajouter \n" + m);
					m.ajouter();
					System.out.println("apres ajouter \n" + m);
					m.notifyAll();
					// s2.realease(); --> methode du semaphore
				}
				// s1.realease(); --> methode du semaphore
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// sleep : awake after a declared time
	// wait : awake when another thread wake him
}
