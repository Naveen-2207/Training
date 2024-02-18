package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class ToWriteIntoATextFile {
	public static void main(String[] args) {
		try {
			FileWriter fileObj = new FileWriter("dataFile.txt");
			fileObj.write("Hello Everyone\n");
			fileObj.write("Hello All");
			System.out.println("Written into the file");	
			fileObj.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
