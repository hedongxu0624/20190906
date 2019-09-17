package cn.lore.oop3;

public class Animal {
	private String food;
	private int leg;
	private String name;
	
	public Animal(String food, int leg,String name) {
		super();
		this.food = food;
		this.leg = leg;
		this.name=name;
		System.out.println("anmial有参构造方法");
	}
	public Animal() {
		super();
		System.out.println("我是animal空参构造方法");
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void eat(){
		System.out.println(name+"在吃"+food);
	}
	public void sleep(){
		System.out.println(name+"在睡觉");
	}
}
