/*
 * ������iterator
 * Arraylist:list��ʵ���࣬add,get,iterator hasNext() next()
 * ������������(Ҳ�ò�������ֵ)��for,foreach(��ǿfor)д�����򵥣��ò�������ֵ
 * �������ڱ������ϵ�ʱ�򣬲�Ҫ�Լ��Ͻ�����ɾ�Ĳ���
 * Ԫ�طŽ�ȥʲô������߾���ʲô
 * arraylist:���ȿɱ�Ķ����������飬�̳�abstactlist��ʵ��list�ӿ�
 *  ���ʺͱ�������ʱ�ȽϿ죬�����ɾ���Ƚ���
 */
package cn.lore.oop;
//��̬����,����ֱ����out.print���
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("����");
		list.add("123");
		list.add(false);
		list.add('a');
		System.out.println(list.get(0));
		Iterator it=list.iterator();
		/*
		 * hasNext()���Ƿ�����һ��Ԫ�أ����ز���ֵ
		 * next()ֱ�ӷ�����һ��Ԫ��
		 * for size()��ȡ���鳤��  get(�±�)
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
