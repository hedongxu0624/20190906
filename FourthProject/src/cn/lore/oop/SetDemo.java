package cn.lore.oop;

import java.util.Comparator;
import java.util.TreeSet;

import cn.lore.collections.User;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<User> set=new TreeSet<>(new Comparator<User>(){

			@Override
			public int compare(User o1, User o2){
				//匿名内部类
				int num=o1.getAge()-o2.getAge();
				return num==0?o1.getName().compareTo(o2.getName()):num;
			}});
		set.add(new User("aa",10));
		set.add(new User("zc",15));
		set.add(new User("cd",18));
		set.add(new User("cf",15));
		System.out.println(set);
	}

}
