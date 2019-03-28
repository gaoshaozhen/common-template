package com.gs.test;

import java.io.*;
import java.util.Scanner;

public class Test {

	private int di(int num) {
		if(num != 1) {
			return num * di(num - 1);
		}else {
			return 1;
		}
	}
	
	private String readFile(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] by = new byte[1024];
		int count = -1;
		while((count = in.read(by)) != -1) {
			out.write(by, 0, count);
		}
		return new String(out.toByteArray(), "utf-8");
	}
	
	private void readFile() throws Exception{
		FileReader reader = new FileReader("f:/t.txt");
		BufferedReader br = new BufferedReader(reader);
		String temp;
		while((temp = br.readLine()) != null) {
			System.out.println(temp);
		}
	}
	
	private void readIn() {
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < 3; i++) {
			String str = sc.nextLine();
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws Exception{
//		System.out.println(new Test().readFile(new FileInputStream("f:/t.txt")));
//		new Test().readFile();
		new Test().readIn();
	}
}
