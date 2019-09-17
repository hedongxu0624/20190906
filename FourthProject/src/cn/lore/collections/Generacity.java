/*
 * ·ºÐÍ
 */
package cn.lore.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Generacity {

	public static void main(String[] args) {
		ArrayList<User> list=new ArrayList<>();
		User u=new User("ºÎ¶«Ðñ",23);
		list.add(u);
		Iterator it=list.iterator();
		System.out.println(it.next());
	}

}
