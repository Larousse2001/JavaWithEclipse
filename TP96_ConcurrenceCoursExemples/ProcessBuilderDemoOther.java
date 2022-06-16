package TP96_ConcurrenceCoursExemples;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

class ProcessBuilderDemoOther {
	public static void main(String[] arg) throws IOException {
		// creating list of process
		List<String> list = new ArrayList<String>();
		list.add("cmd.exe");
		list.add("/C");
		list.add("start");
		list.add("fileInexistant");
		// create the process
		ProcessBuilder build = new ProcessBuilder(list);
		// checking the command in list
		System.out.println("command: " + build.command());
		File log = new File("log.txt");
		build.redirectErrorStream(true);
		build.redirectOutput(Redirect.appendTo(log));
		try {
			Process p = build.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
