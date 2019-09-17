package cn.lore.oop4;

public abstract class Staff {
	private String name;
	private String  num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public Staff() {
		super();
	}
	public Staff(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	public abstract void work();
}
