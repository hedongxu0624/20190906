/*
 * extends�̳У����̳У�ֻ�ܼ̳�һ����
 * super()�����ø����еĹ��췽��
 * this()��ָ�����޲εĹ��췽��
 * ûָ�����췽����������Զ������޲ι��췽��
 */
package cn.lore.oop3;

public class Suckler extends Animal{
	public Suckler(){
		super();
	}

	public Suckler(String food, int leg, String name) {
		super(food, leg, name);
		System.out.println("suckler�вι��췽��");
	}
	public void foodType(){
		System.out.println("���̳����");
	}
}
