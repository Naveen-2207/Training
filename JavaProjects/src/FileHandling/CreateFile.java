package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File nav = new File("Kutty.txt");
		try {
		if(nav.createNewFile()) {
			System.out.println("File Created");
		}else {
			System.out.println("File is not Created");
		}
			
		}catch(IOException e) {
			System.err.println(e);
		}
	}
		
}