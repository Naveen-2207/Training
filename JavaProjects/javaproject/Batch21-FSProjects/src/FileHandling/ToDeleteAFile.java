package FileHandling;

import java.io.File;
import java.io.IOException;

public class ToDeleteAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileObj = new File("dataFile.txt");

		System.out.println("File Name: " + fileObj.getName());
		System.out.println("File Path: " + fileObj.getAbsolutePath());
		System.out.println("File can read: " + fileObj.canRead());
		System.out.println("File can write: " + fileObj.canWrite());
		System.out.println("File length: " + fileObj.length());

		if (fileObj.delete()) {
			System.out.println("File is deleted!!!");
		} else {
			System.err.println("File does not exist!!!");
		}

	}

}
