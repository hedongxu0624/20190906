package cn.lore.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.remove(1);
		for(Integer i:list){
			System.out.print(i);
		}
		/*Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			Integer next = it.next();
			//list.add(10);
			
			System.out.print(next+",");
		}*/
	}

}
