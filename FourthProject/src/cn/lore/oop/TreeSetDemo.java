package cn.lore.oop;

import java.util.Scanner;
import java.util.TreeSet;

import cn.lore.collections.User;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<User> set=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("ÇëÊäÈëÐÕÃû£º");
			String name=sc.next();
			System.out.println("ÄêÁä£º");
			int age=sc.nextInt();
			User u=new User(name,age);
			set.add(u);
		}
		System.out.println(set);
	}

}
