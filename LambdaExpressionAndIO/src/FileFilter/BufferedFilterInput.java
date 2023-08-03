package FileFilter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class BufferedFilterInput {
  public static void main(String[] args) throws IOException {
	FileInputStream fi = new FileInputStream("Text.txt");
	FilterInputStream fin = new BufferedInputStream(fi);
	   int k =0;  
       while((k=fin.read())!=-1){  
           System.out.print((char)k);  
       }  
       fi.close();  
       fin.close();  
}
}
