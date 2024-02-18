package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ToCopyAndWriteIntoAFile {

	public static void main(String[] args) {
		File nav = new File("kutty.txt");
		try {
			FileWriter Write = new FileWriter("kutty1.txt");
			Scanner s = new Scanner(nav);
			while(s.hasNextLine()) {
				String m = s.nextLine();
			Write.write(m);	
			}
			s.close();
			Write.close();
			System.out.println("File contents are copied from one file to another");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		

	}

} 
