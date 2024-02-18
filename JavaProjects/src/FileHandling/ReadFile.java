package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		File nav = new File("kutty.txt");
		
		try {
			
			Scanner r = new Scanner(nav);
			
			while(r.hasNextLine()) {
				
				String s = r.nextLine();
				System.out.println(s);
				
				}
			
			r.close();
			System.out.println("File contents are read and printed");
			
		}
		
		catch(FileNotFoundException n){
			
			System.out.println(n);
		}

	}

}
