package FileFilter;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class DataInputStreamExample {
   public static void main(String[] args) throws IOException {
	FileInputStream fi = new FileInputStream("abc.txt");
	FilterInputStream di = new  DataInputStream(fi);
	 int count = fi.available();  
	    byte[] ary = new byte[count];  
	    di.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k+" ");  
	    }  
}
}
