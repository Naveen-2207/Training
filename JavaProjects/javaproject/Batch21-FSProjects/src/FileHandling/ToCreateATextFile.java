package FileHandling;

import java.io.File;
import java.io.IOException;

public class ToCreateATextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileObj = new File("dataFile1.txt");
		try {
			if (fileObj.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File is not created");
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
