package cn.lore.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("����");
		names.add("����");
		names.add("����");
		names.add("����");
		
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		try {
			 String name = sc.next();
             if(name.length()!=2){
                 throw new CustomException("�������ܳ�������");
             }
             names.add(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
