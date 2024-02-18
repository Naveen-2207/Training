package FileHandling1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {

	public static void main(String[] args) {
		File nav = new File("bad.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(nav);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBoolean(true);
			dos.writeByte(12);
			dos.writeChar('a');
			dos.writeShort(12);
			dos.writeDouble(6.8);
			dos.writeFloat(23.5f);
			dos.writeInt(123);
			dos.writeLong(1235689);
			dos.close();
			fos.close();
			System.out.println("Written data sucessfully!!!");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		
		}catch(IOException e){
			System.out.println("IO Exception");
		}
		System.out.println("Program Terminated!!!!");
	}

}
