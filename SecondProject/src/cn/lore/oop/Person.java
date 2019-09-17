package cn.lore.oop;

public class Person {
	String name="何东旭";
	int age=23;
	//参数问题：数据类型 参数名
	public void hunt(Gun g,Animal animal){
		g.shoot();
		animal.dead();
	}
}
