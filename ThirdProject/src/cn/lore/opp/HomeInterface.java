/*
 * 定义特殊功能的一个特殊的类，interface替换了class，
 * 接口当中的成员变量都是用这个public static final;也就是接口当中的成员变量都是常量，
 * 成员方法public abstract 返回值类型 方法名（）；方法都是抽象方法
 * 扩充功能的,不能创建对象，需要通过接口的实现类创建对象
 * final常量字母需要大写，修饰的成员都是不能改变的（类（不能修饰抽象类），变量，方法）
 * 接口：功能的集合，更加抽象的抽象类，一般情况优先选用接口
 */
package cn.lore.opp;

public interface HomeInterface {

	public abstract void home();
	public abstract void work();
}
