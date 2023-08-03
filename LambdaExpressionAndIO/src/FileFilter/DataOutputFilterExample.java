package FileFilter;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class DataOutputFilterExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fi = new FileOutputStream("abc.txt");
		FilterOutputStream fil = new DataOutputStream(fi);
		fil.write(65);
		fil.flush();
		fil.close();
		System.out.println("Succcess...");
	}
}
