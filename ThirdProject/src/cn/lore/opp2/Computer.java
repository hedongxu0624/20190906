/*
 * 电脑好多usb,开机关机，使用usb设备
 * usb设备，鼠标键盘
 */
package cn.lore.opp2;

public class Computer {
	public void start(){
		System.out.println("电脑开机了");
	}
	public void close(){
		System.out.println("电脑关机了");
	}
	public void usb(UsbInterface u){
		u.start();
		//a instance b:a是否是b的实列，返回布尔值
		if(u instanceof Mouse){
			((Mouse)u).myName();//自动向下转型
		}
		if(u instanceof Keybord){
			((Keybord) u).callName();
		}
		u.end();
	}
}
