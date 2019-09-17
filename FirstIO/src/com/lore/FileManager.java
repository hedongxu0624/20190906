package com.lore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;

public class FileManager {

	public static File creatFileAction(URI uri){
		if(uri!=null){
			return new File(uri);
		}
		return null;
	}
	/**
	 * 
	 * @param dir 文件夹路径名称
	 * @param fileNames 在DIR中创建的文件
	 */
	public static void createDir(String dir,List<String>fileNames){
		
		File dirFile = new File(dir);
		if(!dirFile.exists()){
			System.out.println("目录不存在");
			boolean bool = dirFile.mkdir();
			if(bool){
				for(String s:fileNames){
				File file = new File(dirFile,s);//创建对象
				try {
					file.createNewFile();//在硬盘上创建文件
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			}
		}else{
			System.out.println("目录存在");
			for(String s:fileNames){
				File file = new File(dirFile,s);//创建对象
				try {
					file.createNewFile();//在硬盘上创建文件
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void readBitFile(String fileName){
		
		//1.建立目标要读取的文件对象
		File file = new File(fileName);
		
		//2.基于目标文件对象建立输入流
		InputStream in = null;
		if(file.exists()){
			System.out.println("文件长度："+file.length());
			try {
				in = new FileInputStream(file);
				int count = 0;//读取到字节数
				byte[] bys = new byte[124];//临时存储读取的二进制数据
				//3.读取文件内容
				while((count = in.read(bys,0,bys.length))!=-1){
					String s = new String(bys,0,count);
					System.out.println("此文件被读取的字节数："+s);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					//4.关闭输入流
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
