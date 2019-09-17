package com.orilore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjStream {

	public static void main(String[] args) {
		//对象流，处理流
		//ObjectInputStream ois;
		//ObjectOutputStream oos;
		
		Person p = new Person("何东旭",23,'男');
		try {
			FileOutputStream fos = new FileOutputStream("d:/logs/a.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("d:/logs/a.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person obj = (Person)ois.readObject();
			System.out.println(obj.getAge()+obj.getName()+obj.getSex());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
