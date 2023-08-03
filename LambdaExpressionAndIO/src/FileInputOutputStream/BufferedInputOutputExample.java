package FileInputOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputOutputExample {
 public static void main(String[] args) throws IOException {
	 FileInputStream fi= new FileInputStream("abcd.txt");    
	    BufferedInputStream bi = new BufferedInputStream(fi);    
	    int i;    
	    while((i=bi.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bi.close();    
	    fi.close();    
}
}
