package com.lore;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Test {

	public static void main(String[] args) {
		/**
		 * �����ļ�����
		 */
		/*String filePath = "e:\\files\\java.data";
		File file = new File(filePath);*/
		/*���۸������ļ�����·���Ƿ���ڣ�����File������Java��һ������null
		 * ������������ļ�һ����Ӳ���ϴ洢
		 */
		//System.out.println(file == null);
		
		URI uri = null;
		uri = URI.create("file:/E:/eclipse/FirstIO/");
		File resFile = FileManager.creatFileAction(uri);
		//�ж�file�����Ƿ����
		if(resFile.exists()){
			System.out.println("�ļ�����");
			System.out.println(resFile.canWrite());
			System.out.println(resFile.canRead());
			
			/*��ȡ�ļ�����·������·��������·�����ļ�����*/
			System.out.println(resFile.getAbsolutePath());
			System.out.println(resFile.getParent());
			System.out.println(resFile.getPath());
			System.out.println(resFile.getName());
			
			/*�ж��Ƿ�ΪĿ¼*/
			System.out.println(resFile.isDirectory());
			System.out.println(resFile.isFile());
			//resFile.delete();
			//ֻ��Ŀ¼������,��ȡ�������ļ�
			if(resFile.isDirectory()){
			File[] files = resFile.listFiles();
			System.out.println(files.length);
			for(File f:files){
				System.out.println("�ļ�����"+f.getName());
			}
			}
		}else{
			System.out.println("�ļ�������");
			//�����ļ�,ȷ���ϼ���Ŀ¼�ļ�����
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
