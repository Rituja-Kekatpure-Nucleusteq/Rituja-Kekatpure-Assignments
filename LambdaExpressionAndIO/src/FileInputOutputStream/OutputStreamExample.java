package FileInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("abc.txt",true);
		String s = "Welcome to new file";
		byte[] array = s.getBytes();
		fo.write(array);
		fo.close();
		System.out.println("Written in file");
		{
			
		}
		
	}

}
