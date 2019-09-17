/*
 *方法重载：方法名相同，参数列表不同，参数个数，参数类型，跟形参名称无关
 *		方法重载跟返回值类型没有关系
 */
package cn.lore.oop2;

public class Sum {
	static int i=10;
	public int sumary(int a,int b){
		return a+b;
	}
	public double sumary(int a,double b){
		return (a+b);
	}
	public static int sumary(int... arr){
		int sum=0;
		//增强For..each,从第一个到最后一个
		for(int i:arr){
			sum+=i;
		}
		return sum;
	}
}
