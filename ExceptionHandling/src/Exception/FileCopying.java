package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopying {
	public static void main(String[] args) throws IOException
    {
    	try {
    
    	FileReader fr = new FileReader("abc.txt");
    	FileWriter fw = new FileWriter("xyz.txt");
    	int i;
    	while((i=fr.read())!=-1)
    	{
    		fw.write(i);
    }
    	fr.close();
    	fw.close();
    	}catch(FileNotFoundException ex)
    	{
    		System.out.println("Somthing went wrong");
    	}
}
}
