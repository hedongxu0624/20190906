/*
 * HashSet:��������ظ�ֵ,���Զ�����
 */
package cn.lore.oop;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();//��Ĭ������16
		set.add(50);
		set.add(22);
		set.add(33);
		set.add(54);
		set.add(60);
		set.add(4);
		set.add(4);
		/*for(Integer i:set)
			System.out.print(i);*/
		HashSet<Integer> set1=new HashSet<>();
		set1.addAll(set);
		//set1.toArray();
		System.out.println(set1);
	}

}
