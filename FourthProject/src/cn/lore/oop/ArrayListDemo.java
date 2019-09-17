/*
 * 迭代器iterator
 * Arraylist:list的实现类，add,get,iterator hasNext() next()
 * 遍历：迭代器(也拿不到索引值)，for,foreach(增强for)写起来简单，拿不到索引值
 * 迭代器在遍历集合的时候，不要对集合进行增删改操作
 * 元素放进去什么样，里边就是什么
 * arraylist:长度可变的对象引用数组，继承abstactlist并实现list接口
 *  访问和遍历对象时比较快，插入和删除比较慢
 */
package cn.lore.oop;
//静态导入,可以直接用out.print输出
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("张三");
		list.add("123");
		list.add(false);
		list.add('a');
		System.out.println(list.get(0));
		Iterator it=list.iterator();
		/*
		 * hasNext()看是否有下一个元素，返回布尔值
		 * next()直接返回下一个元素
		 * for size()获取数组长度  get(下标)
		 */
		//System.out.println(list);
		System.out.print("[");
		/*while(it.hasNext()){			
			System.out.print(it.next()+",");
			it.next();
		}*/
		/*for(int i=0;i<list.size();i++){
			if(i==list.size()-1)
				System.out.print(list.get(i));
			else
				System.out.print(list.get(i)+",");
		}*/
		System.out.println("]");
	}
 
}
