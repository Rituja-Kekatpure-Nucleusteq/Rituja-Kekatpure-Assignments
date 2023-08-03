package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyingFiles {
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("Text.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("abc.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			String Line = br.readLine();
			while (Line != null) {
				bw.write(Line);
				Line = br.readLine();
				bw.newLine();

			}
			br.close();
			bw.close();
			fr.close();
			fw.close();
			System.out.println("File copied");

		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}

}
