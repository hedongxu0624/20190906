package cn.lore.opp2;

public class Mouse implements UsbInterface {

	@Override
	public void start() {
		System.out.println("鼠标插上");
	}

	@Override
	public void end() {
		System.out.println("鼠标拔下来");
	}
	public void myName(){
		System.out.println("我是鼠标");
	}
}
