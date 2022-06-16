package TP92;

public class InversedThread extends Thread {
	int id;
	int maxIter = 50;

	public InversedThread(int id) {
		this.id = id;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.format("Hello from Thread [%d]\n", id - i);
			// System.out.format("Hello from Tass \n");
		}
	}

	public static void main(String[] args) {
		InversedThread T1 = new InversedThread(50);
		T1.run();
	}
}
