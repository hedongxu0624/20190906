package cn.lore.opp;

public class Person {

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	private String name;
	private int age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		System.out.println("无参构造器");
	}
	public void fn(){
		System.out.println("我是父类方法");
	}
}
