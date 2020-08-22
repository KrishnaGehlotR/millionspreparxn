package org.dev.filesystem;

import java.io.File;

public class FileCreate {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		File file1 = new File("./filesystem");

		if (!file1.exists())
			System.out.println("mkdir: " + file1.mkdir());
		System.out.println("getAbsolutePaths: " + file1.getAbsolutePath());
		System.out.println("getName: " + file1.getName());
		System.out.println("getParent: " + file1.getParent());
		System.out.println("isDirectory: " + file1.isDirectory());

		File[] lstFiles = file1.listFiles();
		System.out.println("------------------------");

		for (Object obj : lstFiles) {
			System.out.println("getName: " + ((File) obj).getName());
			System.out.println("getPath: " + obj);// Gets absolute path
		}
		System.out.println("------------------------");

		for (File fil : lstFiles) {
			System.out.println("getName: " + fil.getName());
			System.out.println("getAbsolutePath: " + fil.getAbsolutePath());
		}
		System.out.println("------------------------");

		File file2 = new File("./filesystem/chromedriver.exe");
		System.out.println("isFile: " + file2.isFile());
		System.out.println("getParent: " + file2.getParent());
		System.out.println("length: " + file2.length() / 1024);
		System.out.println("------------------------");

		File file3 = new File("./filesystem");
		System.out.println("getName: " + file3.getName());
		System.out.println("getFreeSpace: " + file3.getFreeSpace() / (1024 * 1024 * 1024));
		System.out.println("getTotalSpace: " + file3.getTotalSpace() / (1024 * 1024 * 1024));
		System.out.println("getUsableSpace: " + file3.getUsableSpace() / (1024 * 1024 * 1024));

	}
}
