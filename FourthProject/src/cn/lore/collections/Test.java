/*
 * ? extends T:ָ������ʱT����������Լ�
 * ? super T:ָ�ļ̳�������ײ������T
 */

package cn.lore.collections;

import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
		//��ʧ����add���� �����ޣ�����ֻ����     arr.add(new Fruit())
		ArrayList<? extends Fruit> arr=new ArrayList<>();
		
		ArrayList<? super Apple> arr1=new ArrayList<>();
		//arr1.add(new Apple());
		//arr1.add(new Fruit());
		arr1.add(new RedApple());
		arr.get(0);
	}
}
