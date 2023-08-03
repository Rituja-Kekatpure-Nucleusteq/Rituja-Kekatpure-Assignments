package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) throws IOException
    {
    	try 
    	{
    		FileReader fr = new FileReader("xyz.txt");
    		int i;
    		while((i=fr.read())!=-1)
    		{
    			System.out.print((char)i);
    		}
    		fr.close();
    		
    	}
    	catch(FileNotFoundException ex)
    	{
    		System.out.println("OOPs not found");
    	}
    }
}
