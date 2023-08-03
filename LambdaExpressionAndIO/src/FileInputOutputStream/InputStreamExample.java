package FileInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.module.FindException;

public class InputStreamExample {
  public static void main(String[] args) throws IOException {
	
	  FileInputStream fi = new FileInputStream("Text.txt");
	  int i = 0;
	  while((i=fi.read())!=-1)
	  {
		  System.out.print((char)i);
	  }
	  fi.close();
	  
}
}
