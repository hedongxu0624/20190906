/*
 * static:静态修饰成员变量和方法
 * 用static修饰的变量和方法属于类，不需要创建对象调用方法
 * 可以直接用类名调用
 * 如果需要一些公共的常量可以用static修饰类的成员变量
 * 成员方法不需要用声明对象的情况去调用，可以用static修饰
 */
package cn.lore.oop2;

public class TestMethod {

	public static void main(String[] args) {
		//Sum s=new Sum();
		int[] arr={5,4,8,9,3};
		System.out.println(Sum.sumary(arr));
		System.out.println(Sum.i);
	}
}