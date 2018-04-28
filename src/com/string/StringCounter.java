package com.string;

import java.io.FileReader;
import java.io.Reader;

public class StringCounter {

	public int countWords(String file, String find) throws Exception {
		int count = 0;
		Reader in = new FileReader(file);
		int c;
		while ((c = in.read()) != -1) {
			while (c == find.charAt(0)) {
				for (int i = 1; i < find.length(); i++) {
					c = in.read();
					if (c != find.charAt(i))
						break;
					if (i == find.length() - 1)
						count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCounter stringCounter = new StringCounter();
		try {
			int count = stringCounter.countWords("D://workspace/JavaPractice/src/com/string/str_count", "abc");
			System.out.println(count);
			System.out.println("xyz".charAt(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
