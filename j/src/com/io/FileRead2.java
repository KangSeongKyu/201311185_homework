package com.sd.io;

import java.io.FileReader;
import java.io.BufferedReader;

public class FileRead2 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s.toLowerCase());
		}
		fr.close();
	}
}