package FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadABinaryFile {

	public static void main(String[] args) {
		File fileObj = new File("BinaryFileDatabase.txt");
		try {
			FileInputStream fis = new FileInputStream(fileObj);
			DataInputStream dis = new DataInputStream(fis);
			boolean b = dis.readBoolean();
			char ch = dis.readChar();
			short s = dis.readShort();
			int i = dis.readInt();
			long l = dis.readLong();
			float f = dis.readFloat();
			double d = dis.readDouble();
			System.out.println("Boolean Value: " + b);
			System.out.println("Character Value: " + ch);
			System.out.println("Short Value: " + s);
			System.out.println("Integer Value: " + i);
			System.out.println("Long Value: " + l);
			System.out.println("Float Value: " + f);
			System.out.println("Double Value: " + d);
			fis.close();
			dis.close();
			System.out.println("Read the binary file successfully!!!");

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
		}catch (IOException e) {
			System.out.println("IO exception");
		}
		System.out.println("Program terminated!!!");
		
	}

}
