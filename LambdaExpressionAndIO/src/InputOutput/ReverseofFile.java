package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseofFile {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("xyz.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("Text.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			String line = br.readLine();
			while (line != null) {
				list.add(line);
				line = br.readLine();
//         System.out.println(line);
			}
			System.out.println(list);
			

			for (int i = list.size() - 1; i >= 0; i--) {
//			System.out.println(list.get(i));
				String str = list.get(i);
				bw.write(str);
				bw.newLine();
			}
			br.close();
			bw.close();
			fr.close();

			fw.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch (IOException ex) {
			System.out.println("File Io not Found");
		}

	}
}
