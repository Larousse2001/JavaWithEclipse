package TP96_ConcurrenceCoursExemples;

public class TestThreadGroup {
	public static void main(String[] args) {
		Runnable runnable = new MonTraitement();
		ThreadGroup monThreadGroup = new ThreadGroup("Mon groupe de threads");
		Thread t = new Thread(monThreadGroup, runnable);
		System.out.println("groupe:" + t.getThreadGroup().getName());
		t.start();
	}
	// Attention : une fois créé, un thread ne peut pas être déplacé vers un autre
	// groupe. +diapo 79
}
