package org.dev.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		File file = new File("./filesystem/Sample.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str;

		while ((str = bufferedReader.readLine()) != null) {
			if (str.length() > 0) {
				System.out.println(str);
			}
		}

		bufferedReader.close();
		fileReader.close();

	}
}
