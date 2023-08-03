package FileInputOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputExample2 {
 public static void main(String[] args) throws IOException {
	FileOutputStream fO =  new FileOutputStream("abcde.txt");
	BufferedOutputStream bO = new BufferedOutputStream(fO);
	String s = "Welcome to abcde file";
	byte[] array = s.getBytes();
	fO.write(array);
	System.out.println("data added");
	fO.close();
	
	
}
}
