package cn.lore.opp2;

public class Keybord implements UsbInterface {

	@Override
	public void start() {
		System.out.println("¼üÅÌ²åÉÏ");
	}

	@Override
	public void end() {
		System.out.println("¼üÅÌ²åÉÏ");
	}
	public void callName(){
		System.out.println("ÎÒÊÇ¼üÅÌ");
	}
}
