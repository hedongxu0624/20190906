/*
 * extends继承：单继承，只能继承一个类
 * super()：调用父类中的构造方法
 * this()：指本类无参的构造方法
 * 没指定构造方法，虚拟机自动生成无参构造方法
 */
package cn.lore.oop3;

public class Suckler extends Animal{
	public Suckler(){
		super();
	}

	public Suckler(String food, int leg, String name) {
		super(food, leg, name);
		System.out.println("suckler有参构造方法");
	}
	public void foodType(){
		System.out.println("吃奶长大的");
	}
}
