package FileFilter;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class BufferedFilterOutputExample {
   public static void main(String[] args) throws IOException {
	   FileOutputStream file = new FileOutputStream("Text.txt");  
       FilterOutputStream filter = new FilterOutputStream(file);  
       String str="Good Luck ";
       	      
       byte b[]=str.getBytes();      
       filter.write(b);     
       filter.flush();  
       filter.close();  
       file.close();  
       System.out.println("Success...");  
}
}
