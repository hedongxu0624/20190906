/*
 *  抽象类：包含抽象方法的类，用abstract修饰,不能创建对象
 * 抽象方法：方法名要用关键字abstract修饰
 * 权限修饰符       abstract    返回值类型       方法名（）；
 * 对于抽象类不需要构造器，在子类中需要对方法进行重写，可以有构造方法，
 * 子类需要有参的构造器
 * 方法重写：必须存在继承关系
 */
package cn.lore.oop3;

public abstract class Developer {
	private String name;
	private int age;
	private String num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	//抽象方法
	public abstract void work();
	
}
