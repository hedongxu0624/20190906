package cn.lore.opp2;

public class Mouse implements UsbInterface {

	@Override
	public void start() {
		System.out.println("������");
	}

	@Override
	public void end() {
		System.out.println("��������");
	}
	public void myName(){
		System.out.println("�������");
	}
}
