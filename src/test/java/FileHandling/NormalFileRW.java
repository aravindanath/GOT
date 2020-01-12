package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class NormalFileRW {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "//TestData//newText.txt";

		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File created successfully!");
		} else {
			System.out.println("File is already present");
		}
		Writer w = new FileWriter(path);
		BufferedWriter bf = new BufferedWriter(w);

		bf.write("Hello all");
		bf.newLine();
		bf.write("Hope you all learnt file handling! :)");
		bf.flush();
		bf.close();
		BufferedReader br = new BufferedReader(new FileReader(file));
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		String x = "";
		int i = 1;
		while ((x = br.readLine()) != null) {

			System.out.println(i + " " + x);
			i++;
		}

		br.close();

	}

}
