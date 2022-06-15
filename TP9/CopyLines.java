package TP9;

import java.io.*;

public class CopyLines {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("source.txt"));
			pw = new PrintWriter(new FileWriter("destination.txt"));
			String l;
			while ((l = br.readLine()) != null)
				pw.println(l);
		} finally {
			if (br != null)
				br.close();
			if (pw != null)
				pw.close();
		}
	}
}
