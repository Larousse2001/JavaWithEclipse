package TP96_ConcurrenceCoursExemples;

public class TestThreaddemon {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						System.out.println("Execution demon");
					}
				} finally {
					System.out.println("Fin demon");
				}
			}
		}, "Demon");
		daemonThread.setDaemon(true);
		daemonThread.start();
	}
	
	// Le nombre de messages affichés varie de un à quelques uns avant l'arrêt de la JVM. Le message du bloc finally n'est jamais affiché.
}
