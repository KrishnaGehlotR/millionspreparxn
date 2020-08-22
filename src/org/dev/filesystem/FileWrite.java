package org.dev.filesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {

		System.out.println("Main method starts");
		File file = new File("./filesystem/Sample.txt");

		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write("Good Morning All");
		bufferedWriter.newLine();
		bufferedWriter.write("Writing to a file");
		bufferedWriter.newLine();
		bufferedWriter.close();

		System.out.println("Main method ends");
	}
}
