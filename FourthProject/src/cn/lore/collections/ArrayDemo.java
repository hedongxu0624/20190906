/*
 * ����洢����������
 * ��������[] ������=new ��������[���鳤��]
 * �����Сһ��ȷ�����ܸ��ģ��������ɾ�� Ԫ�أ�ֻ������������ĳ��Ԫ��
 * 
 * ���������洢�����������ÿ�������඼�����˺ܶ�������������ṩ��̬���鹦��
 * �ṩ�������Ƶı�������
 * iterable :collection:list:arraylist linkedlist vector 
 * set:hashset treeset
 *  map:hashtable hashmap
 *  arraylist:���ȿɱ�Ķ����������飬�̳�abstractlist��ʵ��list�ӿ�
 *  ���ʺͱ�������ʱ�ȽϿ죬�����ɾ���Ƚ���
 *  linkeslist:��ɾ�죬�����
 *  hashset:���ܴ洢�ظ���Ԫ�أ����Զ�����
 *  treeset:�Ƚ�������ʵ��Comparable<T>�ӿڣ�ʹ��compareTo����
 */
package cn.lore.collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Student[] arr=new Student[2];
		Scanner sc=new Scanner(System.in);//����Դ
		for(int i=0;i<arr.length;i++){
			System.out.println("����ѧ��������");
			String name=sc.next();
			System.out.println("���������䣺");
			int age=sc.nextInt();
			Student s=new Student(name,age);
			arr[i]=s; 
		}
		System.out.println(Arrays.toString(arr));
	}

}
