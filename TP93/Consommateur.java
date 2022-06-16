package TP93;

import java.util.concurrent.Semaphore;

public class Consommateur extends Thread {
	private Magasin m;
	private String nom;
	Semaphore s1 = new Semaphore(1);
	Semaphore s2 = new Semaphore(0);

	public Consommateur(Magasin m, String nom) {
		this.m = m;
		this.nom = nom;
	}

	public void run() {
		try {
			for (int i = 0; i <= 3; i++) {
				// s1.acquire();
				synchronized (m) {
					while (m.estVide()) {
						m.wait();
						// s2.acquire();

					}
					System.out.println("avant retirer \n" + m);
					m.retirer();
					System.out.println("apres retirer \n" + m);
					m.notifyAll();
					// s2.release();
				}
				// s1.release();
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}
}
