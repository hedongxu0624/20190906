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
		System.out.println("anmial�вι��췽��");
	}
	public Animal() {
		super();
		System.out.println("����animal�ղι��췽��");
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
		System.out.println(name+"�ڳ�"+food);
	}
	public void sleep(){
		System.out.println(name+"��˯��");
	}
}
