package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ToCopyAndWriteIntoAFile {
	public static void main(String[] args) {
		File fileObj = new File("dataFile.txt");
		try {
			FileWriter fileObjWriter = new FileWriter("dataFile1.txt");
			Scanner readerObj = new Scanner(fileObj);
			while (readerObj.hasNextLine()) {
				String s = readerObj.nextLine();
				fileObjWriter.write(s);
			}
			readerObj.close();
			fileObjWriter.close();
			System.out.println("File contents are copied from one file to another");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
