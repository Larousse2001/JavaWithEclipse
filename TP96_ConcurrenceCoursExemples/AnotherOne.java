package TP96_ConcurrenceCoursExemples;

public class AnotherOne {
	public static void main(String[] args) throws InterruptedException {
		int nbThreads;
		Thread[] threads;
		Runnable runnable = new MonTraitement();
		ThreadGroup monThreadGroup = new ThreadGroup("Mon groupe de threads");
		Thread t = new Thread(monThreadGroup, runnable, "thread groupe 1");
		t.start();
		t = new Thread(monThreadGroup, runnable, "thread groupe 2");
		t.start();
		ThreadGroup monSousThreadGroup = new ThreadGroup(monThreadGroup, "Mon sous-groupe de threads");
		t = new Thread(monSousThreadGroup, runnable, "thread sous groupe 1");
		t.start();
		nbThreads = monThreadGroup.activeCount();
		System.out.println("groupe.activeCount()=" + nbThreads);
		threads = new Thread[nbThreads];
		monThreadGroup.enumerate(threads);
		for (int i = 0; i < nbThreads; i++) {
			System.out.println("Thread " + i + " = " + threads[i].getName());
		}
	}
	
	// --> Execution
	/*
	 	Mon traitement thread groupe 1 
		Mon traitement thread groupe 2 
		groupe.activeCount()=3 
		Mon traitement thread sous groupe 1 
		Thread 0 = thread groupe 1 
		Thread 1 = thread groupe 2 
		Thread 2 = thread sous groupe 1
	*/

}
