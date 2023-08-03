package PropertyClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass2 {
   public static void main(String[] args) throws IOException
   {
	   FileReader fr = new FileReader("info.properties");
	   Properties p = new Properties();
	   p.load(fr);
	   String s1 = p.getProperty("name");
	   String s2 = p.getProperty("password");
	   System.out.println(s1);
	   System.out.println(s2);
	   
   }
  
}
