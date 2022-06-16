package TP92;

public class DumbClass implements Runnable {
	String nom;
	int maxIter = 10;

	public DumbClass(String nom) {
		this.nom = nom;
	}

	public void run() {
		System.out.format("Ici le thread %s, je debute!\n", nom);
		for (int i = 0; i < maxIter; i++) {
			System.out.format("[%s] dit je suis Ici %d\n", nom, i);
		}
	}

	public static void main(String[] args) {
		String jobName = String.format("Job_%d", 0);
		DumbClass objectExec = new DumbClass(jobName);
		// Thread job = new Thread(objectExec);
		System.out.format("Creating thread %s\n", jobName);
		objectExec.run();
		// car dumbClass est deja un thread donc on peut appeler la methode run()
		// job.start();
		System.out.format("Thread principal terminé ! \n");
	}
}
