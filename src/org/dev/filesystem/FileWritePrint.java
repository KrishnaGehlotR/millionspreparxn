package org.dev.filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritePrint {

	public static void main(String[] args) throws IOException {

		File file = new File("./filesystem/sample.txt");
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println("Writing thru PrintWriter");
		printWriter.println("Easy way");
		printWriter.close();
		fileWriter.close();
	}
}
