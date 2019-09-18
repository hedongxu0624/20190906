/*
 * ������ɾ����������ʹ��LinkedList,��Ϊ����������ṹʵ��
 * ����һЩ����ɾ������ķ�����addFirst(),addLast(),getFirst(),getLast()
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
