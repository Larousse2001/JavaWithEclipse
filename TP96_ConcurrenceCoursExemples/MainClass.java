package TP96_ConcurrenceCoursExemples;

import java.io.File;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		try {
			File commands = new File("ProcessCommands.txt");
			File output = new File("ProcessLog.txt");
			File errors = new File("ErrorLog.txt");
			ProcessBuilder pb = new ProcessBuilder("PowerShell");
			System.out.println(pb.redirectInput().toString());
			System.out.println(pb.redirectOutput().toString());
			System.out.println(pb.redirectError().toString());
			pb.redirectInput(commands);
			pb.redirectError(errors);
			pb.redirectOutput(output);
			System.out.println(pb.redirectInput().toString());
			System.out.println(pb.redirectOutput().toString());
			System.out.println(pb.redirectError().toString());
			pb.start();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
