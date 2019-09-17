/*
 * 继承：提高了代码的重用性，扩展了类的功能
 *
 */
package cn.lore.oop3;

public class Test {
	public static void main(String[] args) {
		//Suckler s=new Suckler("肉",4,"哺乳动物");
		Tiger t=new Tiger("猪肉",4,"东北虎");
		//Suckler s1=new Suckler();
		//s1.eat();
		//s.eat();
		t.eat();
		
	}
}
