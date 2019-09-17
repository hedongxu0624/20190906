package com.orilore;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo {
	public static void main(String[] args) {

		try {
			File file = new File("E:/files/a.txt");
			if (file.exists()) {
				InputStream input = new FileInputStream(file);
				OutputStream output = new FileOutputStream("D:/logs/c.txt");
				//要以节点流为基础建立处理流
				BufferedInputStream bis = new BufferedInputStream(input);
				BufferedOutputStream bos = new BufferedOutputStream(output);
				byte[] b = new byte[1024];
				
				while (bis.read(b) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.flush();
				bos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
