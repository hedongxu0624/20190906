package cn.lore.obj;

public class Users {

	private String name;
	private String password;
	
	public void displayMe(){
		System.out.println("–’√˚"+name);
		System.out.println("√‹¬Î"+password);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + "]";
	}

	//@Override
	/*public boolean equals(Object obj) {
		return this==obj?false:true;
	}*/

}
