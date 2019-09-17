/*
 * private私有的，他修饰的成员变量和方法，只有类内部能访问
 * 权限修饰符，返回值类型，方法名，（）{}
 */
package cn.lore.oop1;


 class Person {
	private String name;
	public String getName() {
		return name;
	}
//this指的是通过该类创建的对象（当前对象）
	public void setName(String name) {
		this.name = name;
	}

	private int age;
	 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>120||age<0){
		this.age = 20;
		}else{
			this.age=age;
		}
	}

	public void walk(){
		System.out.println("人在行走");
	}
} 
