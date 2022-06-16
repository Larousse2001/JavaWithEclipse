package TP96_ConcurrenceCoursExemples;

public class ProcessDemo {
	public static void main(String[] args) {
		try {
			// create a new process
			System.out.println("Creating Process");
			Process pro = Runtime.getRuntime().exec("notepad.exe");
			// wait 10 seconds
			System.out.println("Waiting");
			Thread.sleep(10000);
			// kill the process
			pro.destroy();
			System.out.println("Process destroyed");
			System.out.println("Exited with code " + pro.exitValue());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/*
	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("mspaint.exe");
		p.waitFor(10, TimeUnit.SECONDS);
		p.destroy();
	}
	*/
	// diapo 53/54/55
}
