package FileHandling1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadBinaryFile {

	public static void main(String[] args) {
		File nav = new File("bad.txt");
		try {
			FileInputStream fis = new FileInputStream(nav);
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("Boolean Value: " + dis.readBoolean());
			System.out.println("Byte Value: " + dis.readByte());
			System.out.println("Short Value: " + dis.readShort());
			System.out.println("Double Value: " + dis.readDouble());
			System.out.println("Float Value: " + dis.readFloat());
			System.out.println("Char Value: " + dis.readChar());
			System.out.println("Int Value: " + dis.readInt());
			System.out.println("Long Value: " + dis.readLong());
			dis.close();
			fis.close();
			System.out.println("Read the binary file sucessfully!!!");
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception"+e);
		}catch(IOException e) {
			System.out.println("IO Exception");
		}
		

	}

}
