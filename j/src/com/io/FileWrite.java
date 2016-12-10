package com.sd.io;

import java.io.FileWriter;

public class FileWrite {
	public static void main(String args[]) throws Exception {
		FileWriter fw = new FileWriter("text1.txt");
		fw.write("This is text");
		fw.close();
	}
}