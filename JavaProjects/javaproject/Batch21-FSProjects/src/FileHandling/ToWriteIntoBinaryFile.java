package FileHandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteIntoBinaryFile {
	public static void main(String[] args) {
		File fileObj = new File("BinaryFileDatabase.txt");
		try {
			FileOutputStream fos = new FileOutputStream(fileObj);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBoolean(true);
            dos.writeByte(12);
            dos.writeChar('a');
            dos.writeShort(2);
            dos.writeInt(123);
            dos.writeLong(123456L);
            dos.writeFloat(23.5F);
            dos.writeDouble(6.8);
            dos.close();
            fos.close();
            System.out.println("Written data successfully!!!");
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("IO exception");
		}
		System.out.println("Program terminated!!!");
	}

}
