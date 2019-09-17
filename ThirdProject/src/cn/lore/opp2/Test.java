package cn.lore.opp2;

public class Test {

	public static void main(String[] args) {
		Computer c=new Computer();
		//∂‡Ã¨
		UsbInterface mouse=new Mouse();
		UsbInterface key=new Keybord();
		c.start();
		c.usb(mouse);
		
		c.usb(key);
		c.close();
	}

}
