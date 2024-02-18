package FileHandling;

import java.io.File;

public class ToDeleteAFile {

	public static void main(String[] args) {
		File nav = new File("kutty.txt");
		System.out.println("File Name: " + nav.getName());
		System.out.println("File path: " + nav.getAbsolutePath());
		System.out.println("File can read: " + nav.canRead());
		System.out.println("File can write: " + nav.canWrite());
		System.out.println("File length: " + nav.length());
		if(nav.delete()) {
			System.out.println("File is deleted!!!");
		}else {
			System.out.println("File is not deleted!!!");
		}
	}

}
 