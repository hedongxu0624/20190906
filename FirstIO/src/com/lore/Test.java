package com.lore;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Test {

	public static void main(String[] args) {
		/**
		 * 创建文件对象
		 */
		/*String filePath = "e:\\files\\java.data";
		File file = new File(filePath);*/
		/*无论给定的文件虚拟路径是否存在，创建File对象，在Java中一定不是null
		 * 但不代表这个文件一定在硬盘上存储
		 */
		//System.out.println(file == null);
		
		URI uri = null;
		uri = URI.create("file:/E:/eclipse/FirstIO/");
		File resFile = FileManager.creatFileAction(uri);
		//判断file对象是否存在
		if(resFile.exists()){
			System.out.println("文件存在");
			System.out.println(resFile.canWrite());
			System.out.println(resFile.canRead());
			
			/*获取文件绝对路径，父路径，基本路径，文件名称*/
			System.out.println(resFile.getAbsolutePath());
			System.out.println(resFile.getParent());
			System.out.println(resFile.getPath());
			System.out.println(resFile.getName());
			
			/*判断是否为目录*/
			System.out.println(resFile.isDirectory());
			System.out.println(resFile.isFile());
			//resFile.delete();
			//只对目录起作用,获取所有子文件
			if(resFile.isDirectory()){
			File[] files = resFile.listFiles();
			System.out.println(files.length);
			for(File f:files){
				System.out.println("文件名称"+f.getName());
			}
			}
		}else{
			System.out.println("文件不存在");
			//创建文件,确保上级父目录文件存在
			try {
				boolean bool = resFile.createNewFile();
				System.out.println(bool);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(resFile!=null);
	}
}
