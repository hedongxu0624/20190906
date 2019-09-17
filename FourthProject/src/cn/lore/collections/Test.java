/*
 * ? extends T:指定泛型时T的子类或者自己
 * ? super T:指的继承树下最底层的类型T
 */

package cn.lore.collections;

import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
		//丢失部分add方法 定上限，集合只读的     arr.add(new Fruit())
		ArrayList<? extends Fruit> arr=new ArrayList<>();
		
		ArrayList<? super Apple> arr1=new ArrayList<>();
		//arr1.add(new Apple());
		//arr1.add(new Fruit());
		arr1.add(new RedApple());
		arr.get(0);
	}
}
