/*
 * 从容器删除或插入对象，使用LinkedList,因为它基于链表结构实现
 * 加入一些插入删除对象的方法，addFirst(),addLast(),getFirst(),getLast()
 * removeFirst(),removeLast()
 */
package cn.lore.oop;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
			System.out.print(it.next());
		System.out.println("----------------");
		System.out.println(list.size());
	}
}
