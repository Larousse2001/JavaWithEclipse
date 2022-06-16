package TP96_ConcurrenceCoursExemples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProcessPipeTest {
	public static void testPipe() {
		try {
			Process process1 = new ProcessBuilder("PowerShell").start();
			Process process2 = new ProcessBuilder("PowerShell").start();
			RedirectStreams redirectStreams = new RedirectStreams(process1, process2);
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(process1.getOutputStream()));
			String command = "echo echo echo";
			System.out.println("Input process1: " + command);
			bufferedWriter.write(command + '\n');
			bufferedWriter.close();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process2.getInputStream()));
			String actualOutput = bufferedReader.readLine();
			System.out.println("Output process2: " + actualOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void infoOfCurrentProcess() {
		ProcessHandle processHandle = ProcessHandle.current();
		ProcessHandle.Info processInfo = processHandle.info();
		/*
			log.info("PID: " + processHandle.pid());
			log.info("Arguments: " + processInfo.arguments());
			log.info("Command: " + processInfo.command());
			log.info("Instant: " + processInfo.startInstant());
			log.info("Total CPU duration: " + processInfo.totalCpuDuration());
			log.info("User: " + processInfo.user());
		*/
		/*
		    Java 9 ajoute une nouvelle façon d'obtenir des informations sur les processus en cours et sur tous les processus engendrés.
			Permet d’obtenir de nombreuses informations sur le processus via java.lang.ProcessHandle.Info :
				la commande utilisée pour démarrer le processus
				les arguments de la commande
				instant où le processus a été lancé
				le temps total passé par celui-ci et
				l'utilisateur qui l'a créé
				On peut invoquer la méthode toHandle() dessus java.lang.Process pour obtenir une instance de java.lang.ProcessHandle.
		*/
		
		// diapo 70
	}

	public static void main(String[] args) {
		ProcessPipeTest.testPipe();
	}
}