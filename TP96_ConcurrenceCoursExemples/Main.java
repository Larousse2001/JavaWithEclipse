package TP96_ConcurrenceCoursExemples;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// create a new list of arguments for our process
		String[] list = { "notepad.exe", "test.txt" };
		// create the process builder
		ProcessBuilder pb = new ProcessBuilder(list);
		try {
			// start the subprocess
			System.out.println("Starting the process..");
			pb = pb.inheritIO();
			pb.start();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/*
	 	Java ProcessBuilder inheritIO() Définit la source et la destination des E/S
		standard du sous-processus pour qu'elles soient identiques à celles du processus
		Java père.

		Une invocation de la forme pb.inheritIO() se comporte exactement de la même
		manière que l'invocation pb.redirectInput(Redirect.INHERIT)
		pb.redirectOutput(Redirect.INHERIT) pb.redirectError(Redirect.INHERIT).
	*/
}
