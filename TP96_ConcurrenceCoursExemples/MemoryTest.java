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
	// int exitValue() Retourne l'�tat de la fin de processus (0 si  �a s'est bien termin�).
	// InputStream getInputStream() Retourne le fichier de sortie normale du processus, dans lequel nous pouvons lire les �critures faites par le processus.
	// InputStream getInputStream() Retourne le fichier de sortie normale du processus, dans lequel nous pouvons lire les �critures faites par le processus.
	// OutputStream getOutputStream() Retourne le fichier d'entr�e du processus, dans lequel nous pouvons �crire au processus.
	// OutputStream getOutputStream() Retourne le fichier d'entr�e du processus, dans lequel nous pouvons �crire au processus.
}
