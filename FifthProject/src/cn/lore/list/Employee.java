package cn.lore.list;

public class Employee {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Employee(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sex=" + sex + "]";
	}
	
}
