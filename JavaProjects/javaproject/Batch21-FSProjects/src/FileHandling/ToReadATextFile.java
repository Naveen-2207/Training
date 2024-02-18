package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ToReadATextFile {
	public static void main(String[] args) {
		File fileObj = new File("dataFile.txt");
		try {
			Scanner readerObj = new Scanner(fileObj);
			while (readerObj.hasNextLine()) {
				String s = readerObj.nextLine();
				System.out.println(s);
			}
			readerObj.close();
			System.out.println("File contents are read and printed");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
