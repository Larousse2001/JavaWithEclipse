package TP92;

public class CompterThread extends Thread{
	String nom;
	int init;
	int inc;
	int NIC;
	int x;
	
	public CompterThread(String nom, int init, int inc, int x,int NIC) {
		this.nom = nom;
		this.init = init;
		this.inc = inc;
		this.NIC = NIC;
		this.x = x;
	}
	
	public void run() {
		try {
			for(int i = 0 ; i < NIC ; i++) {
				System.out.format("Je suis le thread %s \n", nom);
				System.out.println(init + "");
				init += inc;
				sleep(x);
			}
		}
		catch (InterruptedException e){
			e.getMessage();
		}
	}

	public static void main(String[] args) {
		CompterThread c1 = new CompterThread("Thread1",0,1,30,10);
		CompterThread c2 = new CompterThread("Thread2",0,-1,100,10);
		c1.start();
		c2.start();
	}
}
