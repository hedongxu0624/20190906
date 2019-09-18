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
	 * @param dir �ļ���·������
	 * @param fileNames ��DIR�д������ļ�
	 */
	public static void createDir(String dir,List<String>fileNames){
		
		File dirFile = new File(dir);
		if(!dirFile.exists()){
			System.out.println("Ŀ¼������");
			boolean bool = dirFile.mkdir();
			if(bool){
				for(String s:fileNames){
				File file = new File(dirFile,s);//��������
				try {
					file.createNewFile();//��Ӳ���ϴ����ļ�
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			}
		}else{
			System.out.println("Ŀ¼����");
			for(String s:fileNames){
				File file = new File(dirFile,s);//��������
				try {
					file.createNewFile();//��Ӳ���ϴ����ļ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void readBitFile(String fileName){
		
		//1.����Ŀ��Ҫ��ȡ���ļ�����
		File file = new File(fileName);
		
		//2.����Ŀ���ļ�������������
		InputStream in = null;
		if(file.exists()){
			System.out.println("�ļ����ȣ�"+file.length());
			try {
				in = new FileInputStream(file);
				int count = 0;//��ȡ���ֽ���
				byte[] bys = new byte[124];//��ʱ�洢��ȡ�Ķ���������
				//3.��ȡ�ļ�����
				while((count = in.read(bys,0,bys.length))!=-1){
					String s = new String(bys,0,count);
					System.out.println("���ļ�����ȡ���ֽ�����"+s);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					//4.�ر�������
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
