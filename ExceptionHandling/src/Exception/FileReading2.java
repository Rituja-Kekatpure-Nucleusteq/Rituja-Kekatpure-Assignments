package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading2 {
	public static void main(String[] args) throws IOException
    {
		
		System.out.println("Enter the name of the file");
		Scanner sc = new Scanner(System.in);
		String file_name = sc.next();
		File f = new File(file_name);
		FileReader fr  = fr = new FileReader(f);;
		
    	try 
    	{
    		
    		int i;
    		while((i=fr.read())!=-1)
    		{
    			System.out.print((char)i);
    		}
    	
    		
    	}
    	catch(FileNotFoundException ex)
    	{
    		throw new FileNotFoundException("File Not found");
    
    	}
    	finally {
    		fr.close();
    	}
    }
}
