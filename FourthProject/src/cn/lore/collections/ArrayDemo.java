/*
 * 数组存储的数据类型
 * 数据类型[] 变量名=new 数据类型[数组长度]
 * 数组大小一旦确定不能更改，不能添加删除 元素，只能索引或设置某个元素
 * 
 * 集合用来存储对象的容器，每个集合类都包括了很多的容器方法，提供动态数组功能
 * 提供更加完善的遍历方法
 * iterable :collection:list:arraylist linkedlist vector 
 * set:hashset treeset
 *  map:hashtable hashmap
 *  arraylist:长度可变的对象引用数组，继承abstractlist并实现list接口
 *  访问和遍历对象时比较快，插入和删除比较慢
 *  linkeslist:增删快，查的慢
 *  hashset:不能存储重复的元素，会自动排序
 *  treeset:比较器操作实现Comparable<T>接口，使用compareTo方法
 */
package cn.lore.collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Student[] arr=new Student[2];
		Scanner sc=new Scanner(System.in);//输入源
		for(int i=0;i<arr.length;i++){
			System.out.println("输入学生姓名：");
			String name=sc.next();
			System.out.println("请输入年龄：");
			int age=sc.nextInt();
			Student s=new Student(name,age);
			arr[i]=s; 
		}
		System.out.println(Arrays.toString(arr));
	}

}
