package com.lore;

import java.util.ArrayList;
import java.util.List;

public class TestCreateFile {

	public static void main(String[] args) {

		String dir = "e:/files/";
		List<String> fileNames = new ArrayList<String>();
		fileNames.add("��.txt");
		fileNames.add("��.rar");
		fileNames.add("��.bat");
		FileManager.createDir(dir, fileNames);
	}

}
