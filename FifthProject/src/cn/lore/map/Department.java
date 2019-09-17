package cn.lore.map;

public class Department {

	private String code;
	private String name;
	private int quantity;
	public String getCode() {
		return code;
	}
	public Department() {
		super();
	}
	public Department(String code, String name, int quantity) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
