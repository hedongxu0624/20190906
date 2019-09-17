package cn.lore.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("张三");
		names.add("李四");
		names.add("王五");
		names.add("赵瑞");
		
		System.out.println("请输入姓名：");
		Scanner sc = new Scanner(System.in);
		try {
			 String name = sc.next();
             if(name.length()!=2){
                 throw new CustomException("姓名不能超过两字");
             }
             names.add(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
