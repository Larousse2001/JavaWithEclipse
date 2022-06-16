package TP96_ConcurrenceCoursExemples;

public class MemoryTest {
	public static void main(String args[]) throws Exception {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());
		for (int i = 0; i < 10000; i++) {
			new MemoryTest();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
	}
	// void destroy() Destruction du processus.
	// int exitValue() Retourne l'état de la fin de processus (0 si  ça s'est bien terminé).
	// InputStream getInputStream() Retourne le fichier de sortie normale du processus, dans lequel nous pouvons lire les écritures faites par le processus.
	// InputStream getInputStream() Retourne le fichier de sortie normale du processus, dans lequel nous pouvons lire les écritures faites par le processus.
	// OutputStream getOutputStream() Retourne le fichier d'entrée du processus, dans lequel nous pouvons écrire au processus.
	// OutputStream getOutputStream() Retourne le fichier d'entrée du processus, dans lequel nous pouvons écrire au processus.
}
