/*
 * ���Ժö�usb,�����ػ���ʹ��usb�豸
 * usb�豸��������
 */
package cn.lore.opp2;

public class Computer {
	public void start(){
		System.out.println("���Կ�����");
	}
	public void close(){
		System.out.println("���Թػ���");
	}
	public void usb(UsbInterface u){
		u.start();
		//a instance b:a�Ƿ���b��ʵ�У����ز���ֵ
		if(u instanceof Mouse){
			((Mouse)u).myName();//�Զ�����ת��
		}
		if(u instanceof Keybord){
			((Keybord) u).callName();
		}
		u.end();
	}
}
