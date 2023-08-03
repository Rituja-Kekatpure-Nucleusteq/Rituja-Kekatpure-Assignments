package InputOutput;

import java.io.File;
import java.io.IOException;

public class DirectoryList {
  public static void main(String[] args) throws IOException {
	
	  File f = new File("C:\\Users\\Public");
	  String contents[] = f.list();
	  System.out.println("List of files and directory");
	  for(int i = 0;i<contents.length;i++)
	  {
		  System.out.println(contents[i]);
	  }
	  
}
}
