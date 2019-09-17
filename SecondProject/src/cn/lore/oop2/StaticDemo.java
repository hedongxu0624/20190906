/*
 * 关于变量作用域：块级作用域，去找最近的{}
 */
package cn.lore.oop2;

public class StaticDemo {
	public static void main(String[] args) {
		StaticDemo s=new StaticDemo();
	}
	//静态代码块，优先于对象存在,共享区域,不能访问非静态的成员变量和方法
	public StaticDemo(){
		System.out.println("我是构造方法");
	}
	static{
		System.out.println("我在什么位置");
		fn();
	}
	public static void fn(){
		
	}
}
