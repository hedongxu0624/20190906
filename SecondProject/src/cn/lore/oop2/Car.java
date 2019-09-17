/*类：抽取的对象的相同的属性和方法，仅能包含成员变量和成员方法
 * 车：成员变量：wheel engine
 * 成员方法：go stop run
 * 一般情况下成员变量为私有
 */

package cn.lore.oop2;

 class Car{
	private int wheel;
	private String engine;
	private String name;
	//无参
	public Car(){
		System.out.println("创建汽车");
	}
	//有参
	public Car(int wheel,String name,String engine){
		this.engine=engine;
		this.name=name;
		this.wheel=wheel;
	}
	public void go(){
		System.out.println(name+"启动");
		//调用内部方法
		run();
	}
	public void stop(){
		System.out.println(name+"熄火");
	}
	private void run(){
		System.out.println(name+"在行驶");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;//变量=参数
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
}
