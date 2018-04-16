package com.io.strfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StrFile {

	private void writeFile() {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("D://eclipse-workspace/JavaPractice/src/com/io/strfile/str_file"));
			bufferedWriter.write("You are the best");
			bufferedWriter.write("\nYes, I am");
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void readFile() {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader("D://eclipse-workspace/JavaPractice/src/com/io/strfile/str_file"));
			String tmpFile;
			while ((tmpFile = bufferedReader.readLine()) != null) {
				System.out.println(tmpFile);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrFile strFile = new StrFile();
		strFile.writeFile();
		strFile.readFile();
	}

}
