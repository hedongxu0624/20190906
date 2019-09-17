package com.orilore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStream {

	public static void main(String[] args) {

		File file = new File("E:/files/a.txt");
		if(file.exists()){
			try {
				Reader reader = new FileReader(file);
				Writer writer = new FileWriter("d:/logs/d.txt");
				BufferedReader br = new BufferedReader(reader);
				BufferedWriter bw = new BufferedWriter(writer);
				String line;
				while((line=br.readLine())!=null){
					bw.write(line);
					bw.newLine();
				}
				br.close();
				bw.flush();
				bw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
			}
			
		}
	}

}
