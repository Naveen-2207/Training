package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter nav = new FileWriter("kutty.txt");
			nav.write("Navee Navee");
			nav.write("\n	Navee Navee");
			System.out.println("Written into the file");
			nav.close();
		}catch(IOException e){
			System.out.println(e);
		}

	}

}
